<%
    def addContextPath = {
        if (!it)
            return null
        if (it.startsWith("/")) {
            it = "/" + org.openmrs.ui.framework.WebConstants.CONTEXT_PATH + it
        }
        return it
    }
    def logoIconUrl = addContextPath(configSettings?."logo-icon-url") ?: ui.resourceLink("msfcore", "images/msf_logo.png")
    def logoLinkUrl = addContextPath(configSettings?."logo-link-url") ?: "/${ org.openmrs.ui.framework.WebConstants.CONTEXT_PATH }/"
    def multipleLoginLocations = (loginLocations.size > 1);
    def enableUserAccountExt = userAccountMenuItems.size > 0;
%>
<script type="text/javascript">
    var sessionLocationModel = {
        id: ko.observable(),
        text: ko.observable()
    };
    jq(function () {
        ko.applyBindings(sessionLocationModel, jq('.change-location').get(0));
        sessionLocationModel.id(${ sessionContext.sessionLocationId });
        sessionLocationModel.text("${ ui.escapeJs(ui.encodeHtmlContent(ui.format(sessionContext.sessionLocation))) }");
        // we only want to activate the functionality to change location if there are actually multiple login locations
        <% if (multipleLoginLocations) { %>
            jq(".change-location a").click(function () {
                jq('#session-location').show();
                jq(this).addClass('focus');
                jq(".change-location a i:nth-child(3)").removeClass("icon-caret-down");
                jq(".change-location a i:nth-child(3)").addClass("icon-caret-up");
            });
            jq('#session-location').mouseleave(function () {
                jq('#session-location').hide();
                jq(".change-location a").removeClass('focus');
                jq(".change-location a i:nth-child(3)").addClass("icon-caret-down");
                jq(".change-location a i:nth-child(3)").removeClass("icon-caret-up");
            });
            jq("#session-location ul.select li").click(function (event) {
                var element = jq(event.target);
                var locationId = element.attr("locationId");
                var locationUuid = element.attr("locationUuid");
                var locationName = element.attr("locationName");
                var data = { locationId: locationId };
                jq("#spinner").show();
                jq.post(emr.fragmentActionLink("appui", "session", "setLocation", data), function (data) {
                    sessionLocationModel.id(locationId);
                    sessionLocationModel.text(locationName);
                    jq('#selected-location').attr("location-uuid", locationUuid);
                    jq('#session-location li').removeClass('selected');
                    element.addClass('selected');
                    jq("#spinner").hide();
                    jq(document).trigger("sessionLocationChanged");
                })
                jq('#session-location').hide();
                jq(".change-location a").removeClass('focus');
                jq(".change-location a i:nth-child(3)").addClass("icon-caret-down");
                jq(".change-location a i:nth-child(3)").removeClass("icon-caret-up");
            });
            <% if (enableUserAccountExt) { %>
            jq('.identifier').hover(
                function(){
                    jq('.appui-toggle').show();
                    jq('.appui-icon-caret-down').hide();
                },
                 function(){
                    jq('.appui-toggle').hide();
                    jq('.appui-icon-caret-down').show();
                 }
            );
            jq('.identifier').css('cursor', 'pointer');
            <% } %>
        <% } %>
    });
</script>

<header>
    <div class="logo">
        <a href="${ logoLinkUrl }">
            <img src="${ logoIconUrl }"/>
        </a>
    </div>
    <% if (context.authenticated) { %>
    <ul class="user-options">
        <li class="identifier">
            <i class="icon-user small"></i>
            ${context.authenticatedUser.username ?: context.authenticatedUser.systemId}
            <% if (enableUserAccountExt) { %>
            <i class="icon-caret-down appui-icon-caret-down link"></i><i class="icon-caret-up link appui-toggle" style="display: none;"></i>
                <ul id="user-account-menu" class="appui-toggle">
                    <% userAccountMenuItems.each{ menuItem  -> %>
                    <li>
                        <a id="" href="/${ contextPath }/${ menuItem.url }">
                            ${ ui.message(menuItem.label) }
                        </a>
                    </li>
                    <% } %>
                </ul>
            <% } %>
        </li>
        <li class="change-location">
            <a href="javascript:void(0);">
                <i class="icon-map-marker small"></i>
                <span id="selected-location" data-bind="text: text" location-uuid="${ sessionContext.sessionLocation ? sessionContext.sessionLocation.uuid : "" }"></span>
                <% if (multipleLoginLocations) { %>
                    <i class="icon-caret-down link"></i>
                <% } %>
            </a>
        </li>
        <li class="logout">
            <a href="${ ui.actionLink("logout", ["successUrl": contextPath]) }">
                ${ui.message("emr.logout")}
                <i class="icon-signout small"></i>
            </a>
        </li>
    </ul>

    <div id="session-location">
        <div id="spinner" style="position:absolute; display:none">
            <img src="${ui.resourceLink("uicommons", "images/spinner.gif")}">
        </div>
        <ul class="select">
            <% loginLocations.sort { ui.format(it) }.each {
                def selected = (it == sessionContext.sessionLocation) ? "selected" : ""
            %>
            <li class="${selected}" locationUuid="${it.uuid}" locationId="${it.id}" locationName="${ui.encodeHtmlContent(ui.format(it))}">${ui.encodeHtmlContent(ui.format(it))}</li>
            <% } %>
        </ul>
    </div>
    <% } %>
</header>
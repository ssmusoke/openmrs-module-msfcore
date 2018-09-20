This is a test 
<span ng-show="(visitActions).length" dropdown dropdown-append-to-body>
    <button id="visit-actions-button" dropdown-toggle>${ ui.message("Visit Actions") } <i class="icon-caret-down"></i></button>
    <ul id="visit-actions-dropdown" class="dropdown-menu" aria-labelledby="visit-actions-dropdown">
        <li class="list-element" ng-repeat="action in visitActions" ng-click="visitAction(action)" id="{{ action.uuid }}">
            <span><i class="{{ action.icon }}"></i>{{ action.label | translate }}</span>
        </li>
    </ul>
</span>
This is after the drop down 


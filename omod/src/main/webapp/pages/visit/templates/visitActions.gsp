<div class="visit-actions" ng-class="{ 'past-visit': visit.stopDatetime }">

    <p ng-show="visit.stopDatetime" class="label">
        <i class="icon-warning-sign small"></i>
        ${ ui.message("coreapps.patientDashboard.actionsForInactiveVisit") }
    </p>

    <a ng-repeat="action in visitActions | allowedWithContext:visit" class="button task" ng-click="visitAction(action)" id="{{ action.uuid }}">
        <i class="{{ action.icon }}"></i>
        {{ action.label | translate }}
    </a>
</div>
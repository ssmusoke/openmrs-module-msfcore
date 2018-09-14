angular.module("encounterTypeConfig", ["constants"])

    .factory("EncounterTypeConfig", [ "EncounterTypes", "EncounterRoles", function(EncounterTypes, EncounterRoles) {

        var hfeSimpleEditUrl = "/htmlformentryui/htmlform/editHtmlFormWithSimpleUi.page?patientId={{encounter.patient.uuid}}&encounterId={{encounter.uuid}}&returnUrl={{returnUrl}}&breadcrumbOverride={{breadcrumbOverride}}";
        var hfeStandardEditUrl = "/htmlformentryui/htmlform/editHtmlFormWithStandardUi.page?patientId={{encounter.patient.uuid}}&encounterId={{encounter.uuid}}&returnUrl={{returnUrl}}&breadcrumbOverride={{breadcrumbOverride}}";

        // if use has only "enterConsultNote", must be an active visit; retroConsultNote or retroConsultNoteThisProviderOnly required for retro visits
        // TODO do we use this anywhere?
        var standardConsultNoteRequire = "(user.hasPrivilege('Task: emr.enterConsultNote') && visit && !visit.stopDatetime) || (user.hasPrivilege('Task: emr.retroConsultNote') || user.hasPrivilege('Task: emr.retroConsultNoteThisProviderOnly'))"


        // template model url:
        // if a template operates off an model different that the standard OpenMRS REST representation of an encounter,
        // you specify the URL of the source here; used currently for htmlFormEntry encounter templates, which
        // require the encounter to be formatted using the HFE schema

        /* Define Sections */
        var baselineNCD = {
            type: "encounter-section",
            id: "msfcore-baseline-ncd",
            label: "Baseline NCD",
            icon: "icon-list-ul",
            classes: "indent",
            shortTemplate: "templates/sections/defaultEncounterShort.page",
            longTemplate: "templates/sections/defaultHtmlFormEncounterLong.page",
            templateModelUrl: "/htmlformentryui/htmlform/viewEncounterWithHtmlForm/getAsHtml.action?encounterId={{encounter.uuid}}&definitionUiResource=pihcore:htmlforms/section-chief-complaint.xml",
            editUrl: "/htmlformentryui/htmlform/editHtmlFormWithStandardUi.page?patientId={{visit.patient.uuid}}&visitId={{visit.uuid}}&encounterId={{encounter.uuid}}&definitionUiResource=pihcore:htmlforms/section-chief-complaint.xml&returnUrl={{returnUrl}}&breadcrumbOverride={{breadcrumbOverride}}"
        }

        // we include the edit url here because the "Next" navigator functionality uses it
        var familyhistory = {
            type: "include-section",
            id: "familyhistory",
            template: "templates/allergies/reviewAllergies.page",
            editUrl: "/allergyui/allergies.page?patientId={{patient.uuid}}&returnUrl={{returnUrl}}"
        };


        /* Define Encounter Types */
        var encounterTypeConfig = {
            DEFAULT: {
                defaultState: "short",
                shortTemplate: "templates/encounters/defaultEncounterShort.page",
                longTemplate: "templates/encounters/defaultHtmlFormEncounterLong.page",
                templateModelUrl: "/module/htmlformentry/encounter.json?encounter={{encounter.uuid}}",
                showOnVisitList: false
            }
        };

        encounterTypeConfig[EncounterTypes.ncdBaseline.uuid] = {
            defaultState: "short",
            shortTemplate: "templates/encounters/defaultEncounterShort.page",
            longTemplate: "templates/encounters/defaultEncounterLong.page",
            editUrl: hfeStandardEditUrl,
            showOnVisitList: true,
            sections: [
                baselineNCD,
                familyhistory
            ]
        };

        encounterTypeConfig[EncounterTypes.ncdFollowup.uuid] = {
            defaultState: "short",
            shortTemplate: "templates/encounters/checkInShort.page",
            longTemplate: "templates/encounters/defaultHtmlFormEncounterLong.page",
            templateModelUrl: "/module/htmlformentry/encounter.json?encounter={{encounter.uuid}}",
            icon: "icon-check-in",
            editUrl: hfeStandardEditUrl
        };

        encounterTypeConfig[EncounterTypes.vitals.uuid] = {
            defaultState: "short",
            shortTemplate: "templates/encounters/vitalsShort.page",
            longTemplate: "templates/encounters/viewEncounterWithHtmlFormLong.page",
            templateModelUrl: "/htmlformentryui/htmlform/viewEncounterWithHtmlForm/getAsHtml.action?encounterId={{encounter.uuid}}",
            icon: "icon-vitals",
            editUrl: hfeStandardEditUrl
        };

        return encounterTypeConfig;
    }]);

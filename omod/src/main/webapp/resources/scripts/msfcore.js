jQuery(document).ready(function() {

    // add a header section just above the form
    // Hide the register patient link
    jq('#register-patient-link').hide();
    // change the text on the link
    jq('#patient-search-register-patient').html('+ ADD NEW PATIENT');
    var content = '<div id="page-header">Search for Patient Record <a id="back" href="window.history.go(-1); return false;">Back</a> ' +jq('#patient-search-register-patient').outerHTML + '</div>'

    jq('#patient-search-form').before(content);
});
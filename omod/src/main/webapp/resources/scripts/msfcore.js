jQuery(document).ready(function() {

    // add a header section just above the form
    // Hide the register patient link
    jq('#register-patient-link').hide();
    // remove the page heading
    jq('#patient-search-form').prevAll('h2').remove();

    // change the text on the register patient link
    jq('#patient-search-register-patient').html('+ ADD NEW PATIENT');
    var content = '<div id="page-header"><h2>Search for Patient Record</h2> <a class="button" id="find-patient-back" href="window.history.go(-1); return false;">< Back</a> ' +jq('#patient-search-register-patient')[0].outerHTML + '</div>'

    jq('#patient-search-form').before(content);
});
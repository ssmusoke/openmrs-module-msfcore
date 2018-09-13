/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 * 
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.msfcore;

import org.springframework.stereotype.Component;

/**
 * Contains module's config.
 */
@Component("msfcore.MSFCoreConfig")
// TODO perhaps expose some of these through settings/global properties
public class MSFCoreConfig {

    public final static String MODULE_PRIVILEGE = "MSF Core Privilege";

    public final static String REGISTRATION_APP_EXTENSION_ID = "referenceapplication.registrationapp.registerPatient";
    public final static String SEARCH_APP_EXTENSION_ID = "coreapps.findPatient";

    public final static String MSF_REGISTRATION_APP_EXTENSION_ID = "msfcore.registrationapp";
    public final static String MSF_SEARCH_APP_EXTENSION_ID = "msfcore.findPatient";

    public final static String GP_INSTANCE_ID = "msfcore.instanceId";

    public final static String LOCATION_ATTR_TYPE_CODE_UUID = "5a504478-1701-49da-9d8b-3e1d12ab6c5a";

    public final static String PATIENT_ID_TYPE_PRIMARY_UUID = "0t504478-1701-49da-9d8b-3e1d12ab6c5b";

    public final static String PATIENT_ID_TYPE_DRIVER_LICENSE_UUID = "fc734d22-8362-47bf-a1c3-bd69cdd3413e";

    public final static String PATIENT_ID_TYPE_NATIONAL_ID_UUID = "2b3549ad-2e41-4795-b1de-171164856639";

    public final static String PATIENT_ID_TYPE_INSURANCE_CARD_UUID = "2d6b5bfd-fb7a-40c6-b0eb-1c879878c052";

    public final static String PATIENT_ID_TYPE_PASSPORT_UUID = "c4222c2e-d30c-4417-8152-d08ca8809beb";

    public final static String PATIENT_ID_TYPE_UNHCR_ID_UUID = "b324339f-1505-4e98-b699-92326cdb3102";

    public final static String PATIENT_ID_TYPE_UNRWA_ID_UUID = "c964a3cc-9431-468d-92c7-e62da43dd088";

    public final static String PATIENT_ID_TYPE_OTHER_ID_UUID = "ed4a08db-ad66-4873-aa15-9b1c4b2b9fd5";

    public final static String PATIENT_ID_TYPE_SOURCE_UUID = "9a504478-1701-49da-9d8b-3e1d12ab6c5z";

    public final static String PATIENT_ID_TYPE_OLD_PATIENT_ID_UUID = "4a504478-1701-49da-9d8b-3e1d12ab6c5s";

    public final static String MSF_ID_BASE_CHARACTER_SET = "0123456789";

    public final static String CONCEPT_NATIONALITY_UUID = "c901e362-0499-48a0-9a07-74e2d71bcd90";

    public final static String CONCEPT_PROVENANCE_UUID = "bf69e0e0-2de4-4d97-b15e-0fba26cc45b0";

    public final static String CONCEPT_MARITAL_STATUS_UUID = "3fb0d2d1-05ff-4390-8ec7-2e4665853f0e";

    public final static String CONCEPT_EDUCATION_UUID = "d04dba9f-26d5-4ea2-8967-c681ed108e84";

    public final static String CONCEPT_CONDITION_OF_LIVING_UUID = "aa981228-bafa-442f-84fa-7e592f1e0bbc";

    public final static String CONCEPT_EMPLOYMENT_STATUS_UUID = "82494b0f-0049-44ba-b166-13ab352fa408";

    public final static String PERSON_ATTRIBUTE_PHONE_NUMBER_UUID = "14d4f066-15f5-102d-96e4-000c29c2a5d7";

    public final static String PERSON_ATTRIBUTE_HEALTH_CENTER_UUID = "8d87236c-c2cc-11de-8d13-0010c6dffd0f";

    public final static String PERSON_ATTRIBUTE_NATIONALITY_UUID = "4a504478-1701-49da-9d8b-3e1d12ab6c5o";

    public final static String PERSON_ATTRIBUTE_PROVENANCE_UUID = "4a504478-1701-49da-9d8b-3e1d12ab6c5p";

    public final static String PERSON_ATTRIBUTE_MARITAL_STATUS_UUID = "4a504478-1701-49da-9d8b-3e1d12ab6c5q";

    public final static String PERSON_ATTRIBUTE_EDUCATION_UUID = "15ab4723-ca8e-4b60-8366-9cc859195f89";

    public final static String PERSON_ATTRIBUTE_CONDITION_OF_LIVING_UUID = "b6eddbee-1721-4dfa-a79a-8d545043da35";

    public final static String PERSON_ATTRIBUTE_EMPLOYMENT_STATUS_UUID = "4a504478-1701-49da-9d8b-3e1d12ab6c5r";

    public final static String PERSON_ATTRIBUTE_DATE_OF_ARRIVAL_UUID = "d03313d1-12fc-4b0b-ba6c-c4873bee3be6";

    public final static String PERSON_ATTRIBUTE_OLD_FACILITY_CODE_UUID = "4a504478-1701-49da-9d8b-3e1d12ab6c5t";

    public final static String PERSON_ATTRIBUTE_OTHER_ID_NAME_UUID = "63a75b39-de46-4c53-b7c3-53e07fa3ec9e";

    // TODO use
    // org.openmrs.module.registrationcore.RegistrationCoreConstants#GP_OPENMRS_IDENTIFIER_SOURCE_ID
    public final static String GP_OPENMRS_IDENTIFIER_SOURCE_ID = "registrationcore.identifierSourceId";

    public final static String LOCATION_TAG_UUID_MISSION = "76433e9a-8b93-11e8-9eb6-529269fb1459";

    public final static String LOCATION_TAG_UUID_PROJECT = "76433e9a-8b93-11e8-9eb6-529269fb1460";

    public final static String LOCATION_TAG_UUID_CLINIC = "76433e9a-8b93-11e8-9eb6-529269fb1461";

    public final static String LOCATION_LEBANON_UUID = "4b1e44b6-8b94-11e8-9eb6-529269fb1459";

    public final static String LOCATION_UKRAINE_UUID = "4b1e44b6-8b94-11e8-9eb6-529269fb1460";

    public final static String LOCATION_ATTRIBUTE_LEBANON_UUID = "e02d72fa-8b96-11e8-9eb6-529269fb1459";

    public final static String LOCATION_ATTRIBUTE_UKRAINE_UUID = "e02d72fa-8b96-11e8-9eb6-529269fb1460";

    public final static String LOCATION_BEKAA_VALLEY_UUID = "4b1e44b6-8b94-11e8-9eb6-529269fb1461";

    public final static String LOCATION_ATTRIBUTE_BEKAA_VALLEY_UUID = "4b1e44b6-8b94-11e8-9eb6-529269fb1462";

    public final static String LOCATION_TRIPOLI_UUID = "4b1e44b6-8b94-11e8-9eb6-529269fb1463";

    public final static String LOCATION_ATTRIBUTE_TRIPOLI_UUID = "4b1e44b6-8b94-11e8-9eb6-529269fb1464";

    public final static String LOCATION_WEST_DONETSK_UUID = "4b1e44b6-8b94-11e8-9eb6-529269fb1465";

    public final static String LOCATION_ATTRIBUTE_WEST_DONETSK_UUID = "4b1e44b6-8b94-11e8-9eb6-529269fb1466";

    public final static String LOCATION_MARIUPOL_UUID = "4b1e44b6-8b94-11e8-9eb6-529269fb1467";

    public final static String LOCATION_ATTRIBUTE_MARIUPOL_UUID = "4b1e44b6-8b94-11e8-9eb6-529269fb1468";

    public final static String LOCATION_ATTRIBUTE_AARSAL_UUID = "77081024-8b9f-11e8-9eb6-529269fb1459";

    public final static String LOCATION_ATTRIBUTE_BAALBAK_UUID = "77081024-8b9f-11e8-9eb6-529269fb1460";

    public final static String LOCATION_ATTRIBUTE_HERMEL_UUID = "77081024-8b9f-11e8-9eb6-529269fb1461";

    public final static String LOCATION_ATTRIBUTE_MAJDAL_ANJAR_UUID = "77081024-8b9f-11e8-9eb6-529269fb1462";

    public final static String LOCATION_ATTRIBUTE_ABDEH_UUID = "77081024-8b9f-11e8-9eb6-529269fb1463";

    public final static String LOCATION_ATTRIBUTE_DAZ_UUID = "77081024-8b9f-11e8-9eb6-529269fb1464";

    public final static String LOCATION_ATTRIBUTE_BEREZOVE_UUID = "77081024-8b9f-11e8-9eb6-529269fb1465";

    public final static String LOCATION_ATTRIBUTE_KAMIANKA_2_UUID = "77081024-8b9f-11e8-9eb6-529269fb1466";

    public final static String LOCATION_ATTRIBUTE_KURAKHOVE_UUID = "77081024-8b9f-11e8-9eb6-529269fb1467";

    public final static String LOCATION_ATTRIBUTE_MAXIMILIANOVKA_UUID = "77081024-8b9f-11e8-9eb6-529269fb1468";

    public final static String LOCATION_ATTRIBUTE_NETAILOVE_UUID = "77081024-8b9f-11e8-9eb6-529269fb1469";

    public final static String LOCATION_ATTRIBUTE_NOVOSELIVKA_DRUHA_UUID = "77081024-8b9f-11e8-9eb6-529269fb1470";

    public final static String LOCATION_ATTRIBUTE_OPYTNE_UUID = "77081024-8b9f-11e8-9eb6-529269fb1471";

    public final static String LOCATION_ATTRIBUTE_TARAMCHUK_UUID = "77081024-8b9f-11e8-9eb6-529269fb1472";

    public final static String LOCATION_ATTRIBUTE_VODYANE_UUID = "77081024-8b9f-11e8-9eb6-529269fb1473";

    public final static String LOCATION_ATTRIBUTE_BERDIANSKOE_UUID = "77081024-8b9f-11e8-9eb6-529269fb1474";

    public final static String LOCATION_ATTRIBUTE_GRANITNE_UUID = "77081024-8b9f-11e8-9eb6-529269fb1475";

    public final static String LOCATION_ATTRIBUTE_HOSPITAL_N_1_MARIUPOL_UUID = "77081024-8b9f-11e8-9eb6-529269fb1476";

    public final static String LOCATION_ATTRIBUTE_HOSPITAL_N_3_MARIUPOL_UUID = "77081024-8b9f-11e8-9eb6-529269fb1477";

    public final static String LOCATION_ATTRIBUTE_KAMIANKA_1_UUID = "77081024-8b9f-11e8-9eb6-529269fb1478";

    public final static String LOCATION_ATTRIBUTE_LEBEDINSKOE_UUID = "77081024-8b9f-11e8-9eb6-529269fb1479";

    public final static String LOCATION_ATTRIBUTE_MIKOLAIVKA_UUID = "77081024-8b9f-11e8-9eb6-529269fb1480";

    public final static String LOCATION_ATTRIBUTE_NOVOSELIVKA_UUID = "77081024-8b9f-11e8-9eb6-529269fb1481";

    public final static String LOCATION_ATTRIBUTE_ORLOVSKE_UUID = "77081024-8b9f-11e8-9eb6-529269fb1482";

    public final static String LOCATION_ATTRIBUTE_PASHKOVSKOGO_UUID = "77081024-8b9f-11e8-9eb6-529269fb1483";

    public final static String LOCATION_ATTRIBUTE_PAVLOPIL_UUID = "77081024-8b9f-11e8-9eb6-529269fb1484";

    public final static String LOCATION_ATTRIBUTE_PIONERSKE_UUID = "77081024-8b9f-11e8-9eb6-529269fb1485";

    public final static String LOCATION_ATTRIBUTE_PROHOROVKA_UUID = "77081024-8b9f-11e8-9eb6-529269fb1486";

    public final static String LOCATION_ATTRIBUTE_STAROGNATIVKA_UUID = "77081024-8b9f-11e8-9eb6-529269fb1487";

    public final static String LOCATION_ATTRIBUTE_STEPANIVKA_UUID = "77081024-8b9f-11e8-9eb6-529269fb1488";

    public final static String LOCATION_AARSAL_UUID = "87081024-8b9f-11e8-9eb6-529269fb1459";

    public final static String LOCATION_BAALBAK_UUID = "87081024-8b9f-11e8-9eb6-529269fb1460";

    public final static String LOCATION_HERMEL_UUID = "87081024-8b9f-11e8-9eb6-529269fb1461";

    public final static String LOCATION_MAJDAL_ANJAR_UUID = "87081024-8b9f-11e8-9eb6-529269fb1462";

    public final static String LOCATION_ABDEH_UUID = "87081024-8b9f-11e8-9eb6-529269fb1463";

    public final static String LOCATION_DAZ_UUID = "87081024-8b9f-11e8-9eb6-529269fb1464";

    public final static String LOCATION_BEREZOVE_UUID = "87081024-8b9f-11e8-9eb6-529269fb1465";

    public final static String LOCATION_KAMIANKA_2_UUID = "87081024-8b9f-11e8-9eb6-529269fb1466";

    public final static String LOCATION_KURAKHOVE_UUID = "87081024-8b9f-11e8-9eb6-529269fb1467";

    public final static String LOCATION_MAXIMILIANOVKA_UUID = "87081024-8b9f-11e8-9eb6-529269fb1468";

    public final static String LOCATION_NETAILOVE_UUID = "87081024-8b9f-11e8-9eb6-529269fb1469";

    public final static String LOCATION_NOVOSELIVKA_DRUHA_UUID = "87081024-8b9f-11e8-9eb6-529269fb1470";

    public final static String LOCATION_OPYTNE_UUID = "87081024-8b9f-11e8-9eb6-529269fb1471";

    public final static String LOCATION_TARAMCHUK_UUID = "87081024-8b9f-11e8-9eb6-529269fb1472";

    public final static String LOCATION_VODYANE_UUID = "87081024-8b9f-11e8-9eb6-529269fb1473";

    public final static String LOCATION_BERDIANSKOE_UUID = "87081024-8b9f-11e8-9eb6-529269fb1474";

    public final static String LOCATION_GRANITNE_UUID = "87081024-8b9f-11e8-9eb6-529269fb1475";

    public final static String LOCATION_HOSPITAL_N_1_MARIUPOL_UUID = "87081024-8b9f-11e8-9eb6-529269fb1476";

    public final static String LOCATION_HOSPITAL_N_3_MARIUPOL_UUID = "87081024-8b9f-11e8-9eb6-529269fb1477";

    public final static String LOCATION_KAMIANKA_1_UUID = "87081024-8b9f-11e8-9eb6-529269fb1478";

    public final static String LOCATION_LEBEDINSKOE_UUID = "87081024-8b9f-11e8-9eb6-529269fb1479";

    public final static String LOCATION_MIKOLAIVKA_UUID = "87081024-8b9f-11e8-9eb6-529269fb1480";

    public final static String LOCATION_NOVOSELIVKA_UUID = "87081024-8b9f-11e8-9eb6-529269fb1481";

    public final static String LOCATION_ORLOVSKE_UUID = "87081024-8b9f-11e8-9eb6-529269fb1482";

    public final static String LOCATION_PASHKOVSKOGO_UUID = "87081024-8b9f-11e8-9eb6-529269fb1483";

    public final static String LOCATION_PAVLOPIL_UUID = "87081024-8b9f-11e8-9eb6-529269fb1484";

    public final static String LOCATION_PIONERSKE_UUID = "87081024-8b9f-11e8-9eb6-529269fb1485";

    public final static String LOCATION_PROHOROVKA_UUID = "87081024-8b9f-11e8-9eb6-529269fb1486";

    public final static String LOCATION_STAROGNATIVKA_UUID = "87081024-8b9f-11e8-9eb6-529269fb1487";

    public final static String LOCATION_STEPANIVKA_UUID = "87081024-8b9f-11e8-9eb6-529269fb1488";

    public final static String GP_DAYS_TO_KEEP_LOGS = "msfcore.daysToKeepLogs";

    public final static String GP_ENABLE_MSF_UI = "msfcore.enableMSFUI";

    public final static String GP_MANADATORY = "msfcore.mandatory";

    public final static String TASK_AUTO_CLOSE_VISIT = "Auto Close Visits Task";
}

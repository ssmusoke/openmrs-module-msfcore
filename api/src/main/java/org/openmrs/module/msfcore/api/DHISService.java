/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 * 
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.msfcore.api;

import java.util.Properties;

import org.openmrs.Location;
import org.openmrs.LocationAttribute;
import org.openmrs.Patient;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.msfcore.dhis2.SimpleJSON;

/**
 * This is a DSHI2 synchronisation service
 */
public interface DHISService extends OpenmrsService {
    public static final String FILENAME_DHIS_MAPPINGS_PROPERTIES = "dhis-mappings.properties";

    public static final String FILENAME_OPTION_SETS_JSON = "optionSets.json";

    public String getLocationDHISUid(Location location);

    public LocationAttribute getLocationUidAttribute(Location location);

    public void transferDHISMappingsToDataDirectory();

    public Properties getDHISMappings();

    public String postTrackerInstanceThroughOpenHimForAPatient(Patient patient);

    /**
     * @return optionSets from DHIS2 live instance else if issues happen from
     *         local storage
     */
    public SimpleJSON getOptionSets();

    public void installDHIS2Metadata();
}

package org.openmrs.module.msfcore.page;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.ui.framework.page.PageRequest;
import org.openmrs.ui.framework.page.PageRequestMapper;
import org.springframework.stereotype.Component;

@Component
public class CoreAppsPatientDashboardPageRequestMapper implements PageRequestMapper {
    protected final Log log = LogFactory.getLog(getClass());
    /**
     * Implementations should call {@link PageRequest#setProviderNameOverride(String)} and
     * {@link PageRequest#setPageNameOverride(String)}, and return true if they want to remap a request,
     * or return false if they didn't remap it.
     *
     * @param request may have its providerNameOverride and pageNameOverride set
     * @return true if this page was mapped (by overriding the provider and/or page), false otherwise
     */
    public boolean mapRequest(PageRequest request) {
        if (request.getProviderName().equals("coreapps")) {
            if (request.getPageName().equals("patientdashboard")) {
                // change to the custom visit page
                request.setProviderNameOverride("msfcore");
                request.setPageNameOverride("visit");

                log.info(request.toString());
                return true;
            }
        }
        return false;
    }
}
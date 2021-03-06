package org.openmrs.module.msfcore.fragment.controller.field;

import org.openmrs.api.context.Context;
import org.openmrs.module.msfcore.MSFCoreConfig;
import org.openmrs.module.msfcore.api.MSFCoreService;
import org.openmrs.ui.framework.fragment.FragmentModel;

public class EmploymentStatusFragmentController {

    public void controller(FragmentModel model) {
        model.addAttribute("employmentStatuses", Context.getService(MSFCoreService.class).getAllConceptAnswerNames(
                        MSFCoreConfig.CONCEPT_EMPLOYMENT_STATUS_UUID));
    }
}

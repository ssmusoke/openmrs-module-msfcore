package org.openmrs.module.msfcore.formactions;

import java.util.Date;
import java.util.Set;

import org.openmrs.Obs;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.appointmentscheduling.AppointmentRequest;
import org.openmrs.module.appointmentscheduling.AppointmentRequest.AppointmentRequestStatus;
import org.openmrs.module.appointmentscheduling.TimeFrameUnits;
import org.openmrs.module.appointmentscheduling.api.AppointmentService;
import org.openmrs.module.msfcore.MSFCoreConfig;
import org.openmrs.module.msfcore.api.util.DateUtils;

public class RequestAppointmentAction {

    AppointmentService appointmentService;

    public AppointmentRequest requestAppointment(Patient patient, Set<Obs> observations) {
        String notes = "";
        Date requestedDate = null;

        for (Obs obs : observations) {
            if (obs.getConcept().getUuid().equals(MSFCoreConfig.CONCEPT_REQUEST_APPOINTMENT_DATE_UUID)) {
                requestedDate = obs.getValueDate();
            }
            if (obs.getConcept().getUuid().equals(MSFCoreConfig.CONCEPT_REQUEST_APPOINTMENT_COMMENT_UUID)) {
                notes = obs.getValueText();
            }
        }

        Date now = new Date();
        if (requestedDate == null || requestedDate.before(now)) {
            return null;
        }

        if (appointmentService == null) {
            appointmentService = Context.getService(AppointmentService.class);
        }

        AppointmentRequest appointmentRequest = new AppointmentRequest();
        appointmentRequest
                        .setAppointmentType(appointmentService.getAppointmentTypeByUuid(MSFCoreConfig.SERVICE_TYPE_GENERAL_MEDICINE_UUID));
        appointmentRequest.setNotes(notes);
        appointmentRequest.setPatient(patient);
        appointmentRequest.setMinTimeFrameUnits(TimeFrameUnits.DAYS);
        appointmentRequest.setMinTimeFrameValue(DateUtils.getDaysBetweenDates(now, requestedDate));
        appointmentRequest.setStatus(AppointmentRequestStatus.PENDING);
        appointmentRequest.setRequestedOn(new Date());
        appointmentService.saveAppointmentRequest(appointmentRequest);

        return appointmentRequest;
    }
}
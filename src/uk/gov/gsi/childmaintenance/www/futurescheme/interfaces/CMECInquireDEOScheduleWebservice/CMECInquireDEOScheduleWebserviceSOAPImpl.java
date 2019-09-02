/**
 * CMECInquireDEOScheduleWebserviceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOScheduleWebservice;

import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.Response;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.common.Response_xsd.ResponseResponseDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse.CMECInquireDEODetailsResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse.EmployerScheduleDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse.InquireDEOResponse;

public class CMECInquireDEOScheduleWebserviceSOAPImpl implements
		uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECInquireDEOScheduleWebservice.CMECInquireDEOScheduleWebservice_PortType {
	public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsResponse.CMECInquireDEODetailsResponse inquireDEOSchedule(
			uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECInquireDEODetailsRequest.CMECInquireDEODetailsRequest inquireDEOScheduleInput)
			throws java.rmi.RemoteException {
		return getCMECInquireDEODetailsResponse();
	}

	private static CMECInquireDEODetailsResponse getCMECInquireDEODetailsResponse() {
		CMECInquireDEODetailsResponse cDeoDetailsResponse = new CMECInquireDEODetailsResponse();

		InquireDEOResponse inquireDEOResponse = new InquireDEOResponse();
		inquireDEOResponse.setAction("Enquire");
		inquireDEOResponse.setEmployerAccountId("3000354050");
		inquireDEOResponse.setFromDate("08/01/2019");
		inquireDEOResponse.setScheduleStatus("Target");
		inquireDEOResponse.setToDate("09/30/2019");

		EmployerScheduleDetails[] employerScheduleDetailsCollection = new EmployerScheduleDetails[1];
		EmployerScheduleDetails em = new EmployerScheduleDetails();

		em.setScheduleId("2035");
		em.setFromDate("08/06/2019");
		em.setToDate("09/05/2019");
		em.setTargetAmount("3197.76");
		em.setActualAmount("3197.76");
		em.setScheduleDate("08/01/2019");
		em.setDueDate("09/19/2019");
		em.setScheduleStatus("Target");
		em.setReasonCode("200");
		employerScheduleDetailsCollection[0] = em;
		inquireDEOResponse.setEmployerScheduleDetailsCollection(employerScheduleDetailsCollection);

		cDeoDetailsResponse.setInquireDEOResponse(inquireDEOResponse);
		cDeoDetailsResponse.setResponseHeader(getResponse());
		return cDeoDetailsResponse;
	}

	private static Response getResponse() {
		Response res = new Response();
		res.setResponseCode(200);
		res.setResponseMessage("Success");
		ResponseResponseDetails rd = new ResponseResponseDetails();
		rd.setCode("200");
		rd.setDescription("O.K.");
		ResponseResponseDetails[] r = new ResponseResponseDetails[1];
		r[0] = rd;
		res.setResponseDetails(r);
		return res;
	}

}

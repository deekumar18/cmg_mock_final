/**
 * CMECFetchDEOScheduleWebserviceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOScheduleWebservice;

import uk.gov.dwp.esb.utils.CommonUtil;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse.CMECFetchDEODetailsResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse.FetchDEOResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse.NRPScheduleDetails;

public class CMECFetchDEOScheduleWebserviceSOAPImpl implements
		uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOScheduleWebservice.CMECFetchDEOScheduleWebservice_PortType {
	public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse.CMECFetchDEODetailsResponse fetchDEOSchedule(
			uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsRequest.CMECFetchDEODetailsRequest fetchDEOScheduleInput)
			throws java.rmi.RemoteException {
		return getCMECFetchDEODetailsResponse();
	}

	private static CMECFetchDEODetailsResponse getCMECFetchDEODetailsResponse() {
		CMECFetchDEODetailsResponse cmecFetchDEODetailsResponse = new CMECFetchDEODetailsResponse();
		FetchDEOResponse fetchDEOResponse = new FetchDEOResponse();
		fetchDEOResponse.setAction("Enquire");
		fetchDEOResponse.setDueDate("02/19/2019");
		fetchDEOResponse.setScheduleStatus("Processed");
		fetchDEOResponse.setScheduleId("776");
		fetchDEOResponse.setEmployerAccountId("3000282142");
		fetchDEOResponse.setScheduleDate("04/01/2019");
		fetchDEOResponse.setStartDate("01/06/2019");
		fetchDEOResponse.setEndDate("02/05/2019");
		
		NRPScheduleDetails[] nrpScheduleDetailsArray = new NRPScheduleDetails[1];
		NRPScheduleDetails nrpScheduleDetails = new NRPScheduleDetails();
		nrpScheduleDetails.setActualAmount("0.00");
		nrpScheduleDetails.setCSAIdentifier("Y");
		nrpScheduleDetails.setCSARefNum("5884686");
		nrpScheduleDetails.setFirstName("XYZ");
		nrpScheduleDetails.setLastName("ABC");
		nrpScheduleDetails.setNino("AA012365A");
		nrpScheduleDetails.setReasonCode("0");
		nrpScheduleDetails.setTargetAmount("0.00");

		nrpScheduleDetailsArray[0] = nrpScheduleDetails;
		fetchDEOResponse.setNRPScheduleDetailsCollection(nrpScheduleDetailsArray);
		

		cmecFetchDEODetailsResponse.setFetchDEOResponse(fetchDEOResponse);
		cmecFetchDEODetailsResponse.setResponseHeader(CommonUtil.getResponse());

		return cmecFetchDEODetailsResponse;
	}

}

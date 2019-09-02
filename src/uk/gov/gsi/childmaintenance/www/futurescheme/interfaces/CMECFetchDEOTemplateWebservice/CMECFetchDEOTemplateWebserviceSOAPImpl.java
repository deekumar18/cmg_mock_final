/**
 * CMECFetchDEOTemplateWebserviceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOTemplateWebservice;

import com.google.gson.Gson;

import uk.gov.dwp.esb.utils.CommonUtil;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse.FetchDEOResponse;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchDEODetailsResponse.NRPScheduleDetails;
import uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchTemplateDEOResponse.CMECFetchTemplateDEOResponse;

public class CMECFetchDEOTemplateWebserviceSOAPImpl implements
		uk.gov.gsi.childmaintenance.www.futurescheme.interfaces.CMECFetchDEOTemplateWebservice.CMECFetchDEOTemplateWebservice_PortType {
	public uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchTemplateDEOResponse.CMECFetchTemplateDEOResponse fetchDEOTemplate(
			uk.gov.gsi.childmaintenance.www.futurescheme.bo.esb.deoSchedule.CMECFetchTemplateDEORequest.CMECFetchTemplateDEORequest fetchDEOTemplateInput)
			throws java.rmi.RemoteException {
		return getCMECFetchTemplateDEOResponse();
	}

	private static CMECFetchTemplateDEOResponse getCMECFetchTemplateDEOResponse() {
		CMECFetchTemplateDEOResponse cmecFetchTemplateDEOResponse = new CMECFetchTemplateDEOResponse();
		FetchDEOResponse fd = new FetchDEOResponse();
		fd.setStartDate("08/01/2019");
		fd.setEndDate("08/31/2019");
		fd.setScheduleDate("08/29/2019");
		fd.setAction("Create");
		fd.setEmployerAccountId("3000282142");

		NRPScheduleDetails[] nrpScheduleDetails = new NRPScheduleDetails[1];

		NRPScheduleDetails nrp = new NRPScheduleDetails();
		nrp.setActualAmount("0.00");
		nrp.setFirstName("James");
		nrp.setLastName("WallaceDYRM");
		nrp.setNino("BA694060A");
		nrp.setReasonCode("");
		nrp.setSCIN("121004174004");
		nrp.setTargetAmount("1494.27");
		nrp.setCSAIdentifier("N");

		nrpScheduleDetails[0] = nrp;

		fd.setNRPScheduleDetailsCollection(nrpScheduleDetails);
		cmecFetchTemplateDEOResponse.setFetchDEOResponse(fd);
		cmecFetchTemplateDEOResponse.setResponseHeader(CommonUtil.getResponse());
		return cmecFetchTemplateDEOResponse;
	}

}

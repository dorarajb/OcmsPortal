package com.ocms.location;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.ocms.course.model.Location;
import com.ocms.course.service.LocationLocalServiceUtil;

/**
 * Portlet implementation class LocationPortlet
 */
public class LocationPortlet extends MVCPortlet {
 
	public void addLocation(ActionRequest request, ActionResponse response)
	        throws PortalException, SystemException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	        Location.class.getName(), request);

	    String name = ParamUtil.getString(request, "name");
	    String code = ParamUtil.getString(request, "code");
	    String notes = ParamUtil.getString(request, "notes");
	    String addressLine1 = ParamUtil.getString(request, "addressLine1");
	    String addressLine2 = ParamUtil.getString(request, "addressLine2");
	    String city = ParamUtil.getString(request, "city");
	    String state = ParamUtil.getString(request, "state");
	    String region = ParamUtil.getString(request, "region");
	    String country = ParamUtil.getString(request, "country");
	    String zip = ParamUtil.getString(request, "zip");
	    String phone = ParamUtil.getString(request, "phone");
	    String fax = ParamUtil.getString(request, "fax");
	    String email = ParamUtil.getString(request, "email");

	    try {
			LocationLocalServiceUtil.addLocation(serviceContext.getUserId(),
					name, code, notes, addressLine1, addressLine2, city, state,
					region, country, zip, phone, fax, email, serviceContext);

	        SessionMessages.add(request, "locationAdded");

	    } catch (Exception e) {
	        SessionErrors.add(request, e.getClass().getName());

	        response.setRenderParameter("mvcPath",
	            "/html/location/add_location.jsp");
	    }

	}
	
	public void editLocation(ActionRequest request, ActionResponse response)
	        throws PortalException, SystemException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	        Location.class.getName(), request);

	    long locationId = ParamUtil.getLong(request, "locationId");
	    String name = ParamUtil.getString(request, "name");
	    String code = ParamUtil.getString(request, "code");
	    String notes = ParamUtil.getString(request, "notes");
	    String addressLine1 = ParamUtil.getString(request, "addressLine1");
	    String addressLine2 = ParamUtil.getString(request, "addressLine2");
	    String city = ParamUtil.getString(request, "city");
	    String state = ParamUtil.getString(request, "state");
	    String region = ParamUtil.getString(request, "region");
	    String country = ParamUtil.getString(request, "country");
	    String zip = ParamUtil.getString(request, "zip");
	    String phone = ParamUtil.getString(request, "phone");
	    String fax = ParamUtil.getString(request, "fax");
	    String email = ParamUtil.getString(request, "email");
	    
	    try {
			LocationLocalServiceUtil.updateLocation(serviceContext.getUserId(), locationId,
					name, code, notes, addressLine1, addressLine2, city, state,
					region, country, zip, phone, fax, email, serviceContext);

	        SessionMessages.add(request, "locationUpdated");

	    } catch (Exception e) {
	        SessionErrors.add(request, e.getClass().getName());

	        response.setRenderParameter("mvcPath",
	            "/html/location/select_location.jsp");
	    }

	}
}

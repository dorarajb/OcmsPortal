package com.ocms.CourseSeries;

import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.ocms.course.model.CourseSeries;
import com.ocms.course.service.CourseSeriesLocalServiceUtil;

/**
 * Portlet implementation class CourseSeriesPortlet
 */
public class CourseSeriesPortlet extends MVCPortlet {

	public void addCourseSeries(ActionRequest request, ActionResponse response)
	        throws PortalException, SystemException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	        CourseSeries.class.getName(), request);

	    long[] locationIds = ParamUtil.getLongValues(request, "locationIds");
	    long[] courseIds = ParamUtil.getLongValues(request, "courseIds");
	    
	    try {
	    	
	    	for (long locationId : locationIds) {
	    		for (long courseId : courseIds) {
	    			CourseSeriesLocalServiceUtil.addCourseSeries(
	    					serviceContext.getUserId(), courseId, locationId,
	    					new Date(), new Date(), "type", 100, "Do not publish",
	    					serviceContext);
	    		}
	    	}

	        SessionMessages.add(request, "courseSeriesAdded");

	    } catch (Exception e) {
	        SessionErrors.add(request, e.getClass().getName());

	        response.setRenderParameter("mvcPath",
	            "/html/courseseries/view.jsp");
	    }
	}
	
	public void editCourseSeries(ActionRequest request, ActionResponse response)
	        throws PortalException, SystemException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	        CourseSeries.class.getName(), request);

	    long courseId = ParamUtil.getLong(request, "courseId");
	    long locationId = ParamUtil.getLong(request, "locationId");
	    Date startDate = ParamUtil.getDate(request, "startDate", new SimpleDateFormat());
	    Date endDate = ParamUtil.getDate(request, "endDate", new SimpleDateFormat());
	    String type = ParamUtil.getString(request, "type");
	    long maxNoStudReg = ParamUtil.getLong(request, "maxNoStudReg");
	    String publishingStatus = ParamUtil.getString(request, "publishingStatus");
	    
	    try {
	        CourseSeriesLocalServiceUtil.updateCourse(
					serviceContext.getUserId(), courseId, locationId,
					startDate, endDate, type, maxNoStudReg, publishingStatus,
					serviceContext);

	        SessionMessages.add(request, "courseSeriesUpdated");

	    } catch (Exception e) {
	        SessionErrors.add(request, e.getClass().getName());

	        response.setRenderParameter("mvcPath",
	            "/html/courseseries/select_courseseries.jsp");
	    }
	}
}

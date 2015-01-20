package com.ocms.course;

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
import com.ocms.course.model.Course;
import com.ocms.course.service.CourseLocalServiceUtil;

/**
 * Portlet implementation class CoursePortlet
 */
public class CoursePortlet extends MVCPortlet {
 
	public void addCourse(ActionRequest request, ActionResponse response)
	        throws PortalException, SystemException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	        Course.class.getName(), request);

	    String name = ParamUtil.getString(request, "name");
	    String code = ParamUtil.getString(request, "code");
	    String duration = ParamUtil.getString(request, "duration");

	    try {
	        CourseLocalServiceUtil.addCourse(serviceContext.getUserId(),
	                name, code, duration, serviceContext);

	        SessionMessages.add(request, "courseAdded");

	    } catch (Exception e) {
	        SessionErrors.add(request, e.getClass().getName());

	        response.setRenderParameter("mvcPath",
	            "/html/course/add_course.jsp");
	    }

	}
	
	public void editCourse(ActionRequest request, ActionResponse response)
	        throws PortalException, SystemException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	        Course.class.getName(), request);

	    String name = ParamUtil.getString(request, "name");
	    String code = ParamUtil.getString(request, "code");
	    String duration = ParamUtil.getString(request, "duration");
	    long courseId = ParamUtil.getLong(request, "courseId");
	    
	    try {
	        CourseLocalServiceUtil.updateCourse(serviceContext.getUserId(), courseId,
	                name, code, duration, serviceContext);

	        SessionMessages.add(request, "courseUpdated");

	    } catch (Exception e) {
	        SessionErrors.add(request, e.getClass().getName());

	        response.setRenderParameter("mvcPath",
	            "/html/course/select_course.jsp");
	    }

	}
}

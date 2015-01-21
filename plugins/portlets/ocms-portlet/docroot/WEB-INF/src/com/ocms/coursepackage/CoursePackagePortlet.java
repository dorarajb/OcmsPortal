package com.ocms.coursepackage;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.ocms.course.model.CoursePackage;
import com.ocms.course.service.CoursePackageLocalServiceUtil;

/**
 * Portlet implementation class CoursePackagePortlet
 */
public class CoursePackagePortlet extends MVCPortlet {
	public void addCoursePackage(ActionRequest request, ActionResponse response)
	        throws PortalException, SystemException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	        CoursePackage.class.getName(), request);

	    String packageName = ParamUtil.getString(request, "pname");
	    String PackageCode = ParamUtil.getString(request, "pcode");

	    try {
	        CoursePackageLocalServiceUtil.addCoursePackage(serviceContext.getUserId(),
	        		packageName, PackageCode, serviceContext);

	        SessionMessages.add(request, "coursePackageAdded");

	    } catch (Exception e) {
	        SessionErrors.add(request, e.getClass().getName());

	        response.setRenderParameter("mvcPath",
	            "/html/course/add_coursepackage.jsp");
	    }

	}
	
	public void editCoursePackage(ActionRequest request, ActionResponse response)
	        throws PortalException, SystemException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	    		CoursePackage.class.getName(), request);

	    String packageName = ParamUtil.getString(request, "pname");
	    String PackageCode = ParamUtil.getString(request, "pcode");
	    long coursePackageId = ParamUtil.getLong(request, "coursePackageId");
	    
	    try {
	    	CoursePackageLocalServiceUtil.updateCoursePackage(serviceContext.getUserId(), coursePackageId,
	    			packageName, PackageCode, serviceContext);

	        SessionMessages.add(request, "coursePackageUpdated");

	    } catch (Exception e) {
	        SessionErrors.add(request, e.getClass().getName());

	        response.setRenderParameter("mvcPath",
	            "/html/course/select_coursepackage.jsp");
	    }

	}
}

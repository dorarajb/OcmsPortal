package com.ocms.coursepackage;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.ocms.course.model.Course;
import com.ocms.course.model.CoursePackage;
import com.ocms.course.model.Location;
import com.ocms.course.service.CourseLocalServiceUtil;
import com.ocms.course.service.CoursePackageLocalServiceUtil;
import com.ocms.course.service.LocationLocalServiceUtil;
import com.ocms.course.service.PricingLocalServiceUtil;

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
	
	public void addPackageDetails(ActionRequest request, ActionResponse response)
	        throws PortalException, SystemException, ParseException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	        CoursePackage.class.getName(), request);
        String fromDateString = null;
        String toDateString = null;
	    String currency = ParamUtil.getString(request, "currency");
	    int packageId = ParamUtil.getInteger(request, "packageId");
	    int deposit = ParamUtil.getInteger(request, "deposit");
	    int price = ParamUtil.getInteger(request, "price");
	    fromDateString = ParamUtil.getString(request, "effectiveFromDate");
	    toDateString = ParamUtil.getString(request, "effectiveToDate");
	    int balanceDueParDays = ParamUtil.getInteger(request, "balanceDueParDays");
	    String locationString = ParamUtil.getString(request, "locationId");
	    String courseString = ParamUtil.getString(request, "courseId");
	    SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date effectiveFromDate = df.parse(fromDateString);
        Date effectiveToDate = df.parse(toDateString);
        String[] courseArray = courseString.split("-:");
        int courseId = Integer.parseInt(courseArray[0]);
        String courseCode = courseArray[1];
        String[] locationArray = locationString.split("-:");
        int locationId = Integer.parseInt(locationArray[0]);
        String locationCode = locationArray[1];
        
	    try {
	        PricingLocalServiceUtil.addPricing( deposit, price, currency, effectiveFromDate,effectiveToDate,balanceDueParDays, locationId,locationCode , courseId, courseCode, packageId, serviceContext);

	        SessionMessages.add(request, "PackageDetailsAdded");

	    } catch (Exception e) {
	        SessionErrors.add(request, e.getClass().getName());

	        response.setRenderParameter("mvcPath",
	            "/html/course/add_coursepackage.jsp");
	    }

	}
	
	public void listDropDownValues(ActionRequest request, ActionResponse response)
	        throws PortalException, SystemException, ParseException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	        CoursePackage.class.getName(), request);
       long groupId = serviceContext.getScopeGroupId();

		List<Course> courseList = CourseLocalServiceUtil.getCoursesByGroupId(groupId);
		List<Location> locationList = LocationLocalServiceUtil.getLocationByGroupId(groupId);
		System.out.println("Course List:"+courseList);
		System.out.println("Location List"+locationList);
		request.setAttribute("courseList", courseList);  
		request.setAttribute("locationList", locationList);  
	    response.setRenderParameter("mvcPath",
	     "/html/coursepackage/addpackagedetails.jsp");

	}
}

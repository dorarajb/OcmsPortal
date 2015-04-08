package com.ocms.coursemgmt;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;
import javax.portlet.PortletSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactory;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.ocms.course.model.Course;
import com.ocms.course.model.CourseSeries;
import com.ocms.course.model.Location;
import com.ocms.course.model.impl.CourseSeriesImpl;
import com.ocms.course.service.CourseLocalServiceUtil;
import com.ocms.course.service.CourseSeriesLocalServiceUtil;
import com.ocms.course.service.EventLocalServiceUtil;
import com.ocms.course.service.LocationLocalServiceUtil;
import com.ocms.course.service.persistence.CoursePersistence;
import com.ocms.fm.service.FMService;
import com.ocms.fm.service.FMServiceImpl;

/**
 * Portlet implementation class CourseMgmtPortlet
 */
public class CourseMgmtPortlet extends MVCPortlet {
 
	public void addCourse(ActionRequest request, ActionResponse response)
	        throws PortalException, SystemException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	        Course.class.getName(), request);

	    String activeTab = ParamUtil.getString(request, "tab");
	    
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
	            "/html/coursemgmt/view.jsp");
	    }
	    
	    response.setRenderParameter("tab", activeTab);

	}
	
	public void editCourse(ActionRequest request, ActionResponse response)
	        throws PortalException, SystemException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	        Course.class.getName(), request);

	    String activeTab = ParamUtil.getString(request, "tab");
	    
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
	            "/html/coursemgmt/view.jsp");
	    }
	    
	    response.setRenderParameter("tab", activeTab);

	}
	
	public void addLocation(ActionRequest request, ActionResponse response)
	        throws PortalException, SystemException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	        Location.class.getName(), request);

	    String activeTab = ParamUtil.getString(request, "tab");
	    
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
	            "/html/coursemgmt/view.jsp");
	    }
	    
	    response.setRenderParameter("tab", activeTab);

	}
	
	public void editLocation(ActionRequest request, ActionResponse response)
	        throws PortalException, SystemException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	        Location.class.getName(), request);

	    String activeTab = ParamUtil.getString(request, "tab");
	    
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
	            "/html/coursemgmt/view.jsp");
	    }
	    
	    response.setRenderParameter("tab", activeTab);
	}
	
	public void addCourseSeries(ActionRequest request, ActionResponse response)
	        throws PortalException, SystemException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	        CourseSeries.class.getName(), request);

	    String activeTab = ParamUtil.getString(request, "tab");
	    
	    long[] locationIds = ParamUtil.getLongValues(request, "locationIds");
	    long[] courseIds = ParamUtil.getLongValues(request, "courseIds");
	    
		OrderByComparatorFactory orderByComparatorFactory = OrderByComparatorFactoryUtil.getOrderByComparatorFactory();
		OrderByComparator comparator = orderByComparatorFactory.create(CourseSeriesImpl.TABLE_NAME, "seriesCount", false);
		
	    try {
	    	
	    	for (long locationId : locationIds) {
	    		long seriesCount = 0;
	    		String courseSeriesCode =  null;
	    		if (CourseSeriesLocalServiceUtil.getCourseSeriesesCount() > 0) {
	    			List<CourseSeries> courseSeriesTemp = CourseSeriesLocalServiceUtil.getCourseSeriesByLocationId(locationId, comparator);
	    			if (courseSeriesTemp.size() > 0) {
	    				seriesCount = courseSeriesTemp.get(courseSeriesTemp.size()-1).getSeriesCount();
	    			}
	    			courseSeriesCode = LocationLocalServiceUtil.getLocation(locationId).getCode();
	    		}	    		
	    		for (long courseId : courseIds) {
	    			/*CourseSeriesLocalServiceUtil.addCourseSeries(
	    					serviceContext.getUserId(), courseId, locationId, courseSeriesCode + " " + (seriesCount + 1),
	    					new Date(), new Date(), "type", 100, "Do not publish", seriesCount + 1,
	    					serviceContext);*/
	    		}
	    	}

	        SessionMessages.add(request, "courseSeriesAdded");

	    } catch (Exception e) {
	        SessionErrors.add(request, e.getClass().getName());

	        response.setRenderParameter("mvcPath",
	            "/html/coursemgmt/view.jsp");
	    }
	    
	    response.setRenderParameter("tab", activeTab);
	}
	
	public void editCourseSeries(ActionRequest request, ActionResponse response)
	        throws PortalException, SystemException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	        CourseSeries.class.getName(), request);

	    String activeTab = ParamUtil.getString(request, "tab");
	    
	    long courseId = ParamUtil.getLong(request, "courseId");
	    long locationId = ParamUtil.getLong(request, "locationId");
	    Date startDate = ParamUtil.getDate(request, "startDate", new SimpleDateFormat());
	    Date endDate = ParamUtil.getDate(request, "endDate", new SimpleDateFormat());
	    String type = ParamUtil.getString(request, "type");
	    long maxNoStudReg = ParamUtil.getLong(request, "maxNoStudReg");
	    String publishingStatus = ParamUtil.getString(request, "publishingStatus");
	    
	    try {
	        /*CourseSeriesLocalServiceUtil.updateCourse(
					serviceContext.getUserId(), courseId, locationId,
					startDate, endDate, type, maxNoStudReg, publishingStatus,
					serviceContext);*/

	        SessionMessages.add(request, "courseSeriesUpdated");

	    } catch (Exception e) {
	        SessionErrors.add(request, e.getClass().getName());

	        response.setRenderParameter("mvcPath",
	            "/html/coursemgmt/view.jsp");
	    }
	    
	    response.setRenderParameter("tab", activeTab);
	}
	
	public void createEvents(ActionRequest request, ActionResponse response)
	        throws PortalException, SystemException {

	    ServiceContext serviceContext = ServiceContextFactory.getInstance(
	        CourseSeries.class.getName(), request);
	    List<CourseSeries> courseSeriesList = null;
	    HttpServletRequest httpRequest = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(request));
	    HttpSession session=httpRequest.getSession();
	    String[] courseSeriesCodes =(String[]) session.getAttribute("courseSeriesId");
	    System.out.println("CourseSeries Len:"+ courseSeriesCodes.length);
	    System.out.println("CourseSeries:"+ courseSeriesCodes);
	    System.out.println("CourseSeries:"+ courseSeriesCodes[0]);
	      
	    for (String courseSeriesCode: courseSeriesCodes)
	    { 
	    	
		    try {
		    	
		    	courseSeriesList = CourseSeriesLocalServiceUtil.getCourseSeriesByCourseSeriesCode(courseSeriesCode);
		    	for (CourseSeries courseSeries : courseSeriesList) {
		    	
			    	long courseId = courseSeries.getCourseId();
				    long locationId = courseSeries.getLocationId();
				    Date startDate = courseSeries.getStartDate();
				    Date endDate = courseSeries.getEndDate();
				    String courseCode = CourseLocalServiceUtil.getCourse(courseId).getCode();
				    String courseName = CourseLocalServiceUtil.getCourse(courseId).getName();
				    String locationCode = LocationLocalServiceUtil.getLocation(locationId).getCode();
				    EventLocalServiceUtil.addEvent(serviceContext.getUserId(), courseName, courseId, courseCode, locationId, locationCode, startDate, endDate, 1, serviceContext);
			        SessionMessages.add(request, "EventAdded");
		        
		    	}
		
		    } catch (Exception e) {
		    	
		        SessionErrors.add(request, e.getClass().getName());
		        response.setRenderParameter("mvcPath","/html/coursemgmt/view.jsp");
		        
		    }
		    
	    }
	    
	    FMService fmService = new FMServiceImpl();
		fmService.addEvent();
	    response.setRenderParameter("tab", "");
	}
}

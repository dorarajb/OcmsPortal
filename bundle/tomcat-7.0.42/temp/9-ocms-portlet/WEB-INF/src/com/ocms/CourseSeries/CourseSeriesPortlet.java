package com.ocms.CourseSeries;

import java.io.IOException;
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
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.ocms.course.model.Course;
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

	    String[] locationIds = ParamUtil.getParameterValues(request, "locationIds");
	    String[] courseIds = ParamUtil.getParameterValues(request, "rowIds");
	    
	    try {
			CourseSeriesLocalServiceUtil.addCourseSeries(
					serviceContext.getUserId(), 10801, 11105,
					new Date(), new Date(), "type", 0, "Do not publish",
					serviceContext);

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
					new Date(), new Date(), type, maxNoStudReg, publishingStatus,
					serviceContext);

	        SessionMessages.add(request, "courseSeriesUpdated");

	    } catch (Exception e) {
	        SessionErrors.add(request, e.getClass().getName());

	        response.setRenderParameter("mvcPath",
	            "/html/courseseries/select_courseseries.jsp");
	    }
	}
	
	@Override
	public void render(RenderRequest renderRequest,
	        RenderResponse renderResponse) throws PortletException, IOException {

	    try {
	        ServiceContext serviceContext = ServiceContextFactory.getInstance(
	                Course.class.getName(), renderRequest);

	        long groupId = serviceContext.getScopeGroupId();

	        long courseSeriesId = ParamUtil.getLong(renderRequest, "courseSeriesId");
		    
	        List<CourseSeries> courses = CourseSeriesLocalServiceUtil.getCourseSeriesByGroupId(groupId);

	        if (courses.size() == 0) {
	            CourseSeries courseSeries = CourseSeriesLocalServiceUtil.addCourseSeries(
	                    serviceContext.getUserId(), 10802, 10803,  
	                    new Date(), new Date(), "type", 10, "Do not publish", 
	                    serviceContext);
	            courseSeriesId = courseSeries.getCourseId();
	        }
	        if (!(courseSeriesId > 0)) {
	            courseSeriesId = courses.get(0).getCourseId();
	        }
	        renderRequest.setAttribute("courseSeriesId", courseSeriesId);
	    } catch (Exception e) {
	        throw new PortletException(e);
	    }
	    super.render(renderRequest, renderResponse);
	}

}

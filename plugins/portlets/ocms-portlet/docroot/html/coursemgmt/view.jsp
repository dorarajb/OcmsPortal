<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@ page import="java.util.List" %>
<%@ page import="javax.portlet.PortletURL"%>
<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@ page import="com.liferay.portal.kernel.util.HtmlUtil" %>
<%@ page import="com.liferay.portal.kernel.util.StringPool" %>
<%@ page import="com.ocms.course.model.Course" %>
<%@ page import="com.ocms.course.service.CourseLocalServiceUtil" %>

<%@ page import="com.ocms.course.model.CourseSeries" %>
<%@ page import="com.ocms.course.service.CourseSeriesLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.dao.search.RowChecker" %>
<%@ page import="com.ocms.course.model.Contact" %>
<%@ page import="com.ocms.course.service.ContactLocalServiceUtil" %>
<%@ page import="com.ocms.course.model.CoursePackage" %>
<%@ page import="com.ocms.course.service.CoursePackageLocalServiceUtil" %>
<%@ page import="com.ocms.course.model.Location" %>
<%@ page import="com.ocms.course.service.LocationLocalServiceUtil" %>

<portlet:defineObjects />
<theme:defineObjects />

<portlet:renderURL var="courseViewURL">
    <portlet:param name="tab" value="course" />
</portlet:renderURL>
<portlet:renderURL var="locationViewURL">
    <portlet:param name="tab" value="location" />
</portlet:renderURL>
<portlet:renderURL var="courseSeriesViewURL">
    <portlet:param name="tab" value="courseseries" />
</portlet:renderURL>
<portlet:renderURL var="addCourseViewURL">
    <portlet:param name="tab" value="add_course" />
</portlet:renderURL>
<portlet:renderURL var="addLocationViewURL">
    <portlet:param name="tab" value="add_location" />
</portlet:renderURL>

<portlet:actionURL name="addCourse" var="addCourseURL">
	<portlet:param name="tab" value="course" />
</portlet:actionURL>
<portlet:actionURL name="addLocation" var="addLocationURL">
	<portlet:param name="tab" value="location" />
</portlet:actionURL>
<portlet:actionURL name="addCourseSeries" var="addCourseSeriesURL">
	<portlet:param name="tab" value="courseseries" />
</portlet:actionURL>
<portlet:actionURL name="createEvents" var="createEventsURL">
	<portlet:param name="tab" value="courseseries" />
</portlet:actionURL>

<portlet:actionURL name="editCourse" var="editCourseURL">
	<portlet:param name="tab" value="course" />
</portlet:actionURL>
<portlet:actionURL name="editLocation" var="editLocationURL">
	<portlet:param name="tab" value="location" />
</portlet:actionURL>
<portlet:actionURL name="editCourseSeries" var="editCourseSeriesURL">
	<portlet:param name="tab" value="courseseries" />
</portlet:actionURL>

<%
String activeCourseTab = ""; // default tab
String activeLocationTab = "";
String activeCourseSeriesTab = "";
String activeTab = ParamUtil.getString(request, "tab", "course");

if (activeTab.equalsIgnoreCase("course") || 
		activeTab.equalsIgnoreCase("add_course") ||
		activeTab.equalsIgnoreCase("select_course")) {
	activeCourseTab = "active";
} else if (activeTab.equalsIgnoreCase("location") || 
		activeTab.equalsIgnoreCase("add_location") ||
		activeTab.equalsIgnoreCase("select_location")) {
	activeLocationTab = "active";
} else if (activeTab.equalsIgnoreCase("courseseries") || 
		activeTab.equalsIgnoreCase("add_course_series") ||
		activeTab.equalsIgnoreCase("select_course_series") ||
		activeTab.equalsIgnoreCase("select_course_series_course") ||
		activeTab.equalsIgnoreCase("select_course_series_location")) {
	activeCourseSeriesTab = "active";
}
%>
<aui:nav cssClass="nav-tabs">
    <aui:nav-item cssClass="<%=activeCourseTab%>" href="<%=courseViewURL%>" label="Courses" />
    <aui:nav-item cssClass="<%=activeLocationTab%>" href="<%=locationViewURL%>" label="Location" />
    <aui:nav-item cssClass="<%=activeCourseSeriesTab%>" href="<%=courseSeriesViewURL%>" label="Course Series" />
</aui:nav>
<%
if (activeTab.equalsIgnoreCase("course")) {
	PortletURL actionURL = renderResponse.createRenderURL();
	actionURL.setParameter("tab", "course");
%>
	<aui:button-row cssClass="course-buttons">
	    <aui:button onClick="<%=addCourseViewURL.toString()%>" value="Add Course" />
	</aui:button-row>
	
	<liferay-ui:search-container
		iteratorURL="<%=actionURL%>" delta="5"
		emptyResultsMessage="No Results Found">
	    <liferay-ui:search-container-results
	        results="<%=CourseLocalServiceUtil.getCoursesByGroupId(scopeGroupId,
	                        searchContainer.getStart(),
	                        searchContainer.getEnd())%>"
	        total="<%=CourseLocalServiceUtil.getCoursesCount()%>" />
	
	    <liferay-ui:search-container-row 
	        className="com.ocms.course.model.Course" modelVar="course">
	        <portlet:renderURL var="selectCourseURL">
	        	<portlet:param name="courseId" value="<%=String.valueOf(course.getCourseId()) %>" />
	        	<portlet:param name="mvcPath" value="/html/coursemgmt/view.jsp" />
	        	<portlet:param name="tab" value="select_course" />
			</portlet:renderURL>
	        <liferay-ui:search-container-column-text property="name" href="<%=selectCourseURL.toString() %>"/>
	        <liferay-ui:search-container-column-text property="code" />
	        <liferay-ui:search-container-column-text property="duration" />
	
	    </liferay-ui:search-container-row>
	
	    <liferay-ui:search-iterator />
	</liferay-ui:search-container>

<% 
} else if (activeTab.equalsIgnoreCase("location")) {
	PortletURL actionURL = renderResponse.createRenderURL();
	actionURL.setParameter("tab", "location");
%>
	<aui:button-row cssClass="location-buttons">
	    <aui:button onClick="<%=addLocationViewURL.toString()%>" value="Add Location" />
	</aui:button-row>
	
	<liferay-ui:search-container
		iteratorURL="<%=actionURL%>" delta="5"
		emptyResultsMessage="No Results Found">
	    <liferay-ui:search-container-results
	        results="<%=LocationLocalServiceUtil.getLocationByGroupId(scopeGroupId,
	                        searchContainer.getStart(),
	                        searchContainer.getEnd())%>"
	        total="<%=LocationLocalServiceUtil.getLocationsCount()%>" />
	
	    <liferay-ui:search-container-row 
	        className="com.ocms.course.model.Location" modelVar="location">
	        <portlet:renderURL var="selectLocationURL">
	        	<portlet:param name="locationId" value="<%=String.valueOf(location.getLocationId()) %>" />
	        	<portlet:param name="mvcPath" value="/html/coursemgmt/view.jsp" />
	        	<portlet:param name="tab" value="select_location" />
			</portlet:renderURL>
	        <liferay-ui:search-container-column-text property="name" href="<%=selectLocationURL.toString() %>"/>
	        <liferay-ui:search-container-column-text property="code" />
	        <liferay-ui:search-container-column-text property="city" />
	        <liferay-ui:search-container-column-text property="state" />
	        <liferay-ui:search-container-column-text property="country" />
	        <liferay-ui:search-container-column-text property="region" />
	
	    </liferay-ui:search-container-row>
	
	    <liferay-ui:search-iterator />
	</liferay-ui:search-container>
<%
} else if (activeTab.equalsIgnoreCase("courseseries")) {
	PortletURL actionURL = renderResponse.createRenderURL();
	actionURL.setParameter("tab", "courseseries");
%>
	<%
	String[] courseSeriesId = {"ATL-Airport 1","ATL-Airport 2","DEN-Hotel 1","DEN-Hotel 2"};
	String test = "Testing";
	session.setAttribute("courseSeriesId", courseSeriesId);
	%>
	<%System.out.println("courseSeriesId:"+courseSeriesId[0]); %>
	<%-- <c:set var="courseSeriesId" value="${fn:split('ATL-Airport 1,ATL-Airport 2,DEN-Hotel 1,DEN-Hotel 2', ',')}" scope="application" />
	<c:out value="${courseSeriesId}"></c:out> --%>
	<aui:layout>
	<aui:button name="createEventsButton" value="Create Events" onClick="<%=createEventsURL%>"/>
		<aui:column columnWidth="35" first="true">
			<aui:field-wrapper name="location" helpMessage="Select one or more location" label="Location(s)">
				<aui:form action="<%=addCourseSeriesURL.toString()%>" name="fmLocation" method="post">
					<liferay-ui:search-container curParam="locationParam" 
						iteratorURL="<%= actionURL %>" delta="5" 
						emptyResultsMessage="No Results Found"
						rowChecker="<%=new RowChecker(renderResponse)%>">
					    <liferay-ui:search-container-results
					        results="<%=LocationLocalServiceUtil.getLocationByGroupId(scopeGroupId,
					                        searchContainer.getStart(),
					                        searchContainer.getEnd())%>"
					        total="<%=LocationLocalServiceUtil.getLocationsCount()%>" />
					
					    <liferay-ui:search-container-row 
					        className="com.ocms.course.model.Location" modelVar="location" keyProperty="locationId">
					        <portlet:renderURL var="selectLocationURL">
					        	<portlet:param name="locationId" value="<%=String.valueOf(location.getLocationId()) %>" />
					        	<portlet:param name="mvcPath" value="/html/coursemgmt/view.jsp" />
					        	<portlet:param name="tab" value="select_course_series_location" />
							</portlet:renderURL>
							<liferay-ui:search-container-column-text name="Code - Region" href="<%=selectLocationURL.toString() %>">
								<%=String.valueOf(location.getCode()) + " - " + String.valueOf(location.getRegion()) %>
							</liferay-ui:search-container-column-text>
					    </liferay-ui:search-container-row>
					    <liferay-ui:search-iterator searchContainer="<%= searchContainer %>" paginate="<%= true %>" />
					</liferay-ui:search-container>
				</aui:form>
			</aui:field-wrapper>
		</aui:column>
		<aui:column columnWidth="45">
			<aui:field-wrapper name="course" helpMessage="Select one or more course" label="Course(s)">
				<aui:form action="<%=addCourseSeriesURL.toString()%>" name="fmCourse" method="post">
					<aui:input name="locationIds" type="hidden" />
					<aui:input name="courseIds" type="hidden" />
					<liferay-ui:search-container curParam="courseParam"
						iteratorURL="<%=actionURL%>" delta="5"
						emptyResultsMessage="No Results Found"
						rowChecker="<%=new RowChecker(renderResponse)%>">
						<liferay-ui:search-container-results
							results="<%=CourseLocalServiceUtil.getCoursesByGroupId(scopeGroupId,
					                        searchContainer.getStart(),
					                        searchContainer.getEnd())%>"
							total="<%=CourseLocalServiceUtil.getCoursesCount()%>" />
						<liferay-ui:search-container-row
							className="com.ocms.course.model.Course" modelVar="course"
							keyProperty="courseId">
							<portlet:renderURL var="selectCourseURL">
								<portlet:param name="courseId" value="<%=String.valueOf(course.getCourseId()) %>" />
					        	<portlet:param name="mvcPath" value="/html/coursemgmt/view.jsp" />
					        	<portlet:param name="tab" value="select_course_series_course" />
							</portlet:renderURL>
							<liferay-ui:search-container-column-text property="name"
								href="<%=selectCourseURL.toString() %>" />
							<liferay-ui:search-container-column-text property="code" />
						</liferay-ui:search-container-row>
						<liferay-ui:search-iterator searchContainer="<%= searchContainer %>"
							paginate="<%= true %>" />
					</liferay-ui:search-container>
				</aui:form>
			</aui:field-wrapper>
		</aui:column>
	</aui:layout>
	<aui:button-row>
		<aui:button name="createCourseSeriesButton" value="Create Course Series" onClick="constructCourseSeries();"/>
		<aui:button name="cancelCourseSeriesButton" value="Cancel" onClick="<%=courseSeriesViewURL%>"/>
	</aui:button-row>
	<liferay-ui:search-container curParam="courseSeriesParam" 
		iteratorURL="<%= actionURL %>" delta="5" 
		emptyResultsMessage="No Results Found">
	    <liferay-ui:search-container-results
	        results="<%=CourseSeriesLocalServiceUtil.getCourseSeriesByGroupId(scopeGroupId,
	                        searchContainer.getStart(),
	                        searchContainer.getEnd())%>"
	        total="<%=CourseSeriesLocalServiceUtil.getCourseSeriesesCount()%>" />
	
	    <liferay-ui:search-container-row 
	        className="com.ocms.course.model.CourseSeries" modelVar="courseSeries" keyProperty="courseSeriesId">
	        <portlet:renderURL var="selectCourseSeriesURL">
	        	<portlet:param name="courseSeriesId" value="<%=String.valueOf(courseSeries.getCourseSeriesId()) %>" />
	        	<portlet:param name="mvcPath" value="/html/coursemgmt/view.jsp" />
	        	<portlet:param name="tab" value="select_course_series" />
			</portlet:renderURL>
			<liferay-ui:search-container-column-text name="Course Series" href="<%=selectCourseSeriesURL.toString() %>">
<%
	String locationCode = ""; 
	List<Location> location = LocationLocalServiceUtil.getLocationByLocationId(courseSeries.getLocationId());
	if (location != null && location.size() > 0) {
		locationCode = location.get(0).getCode();
	}
	
	String courseCode = "";
	
	List<Course> course = CourseLocalServiceUtil.getCoursesByCourseId(courseSeries.getCourseId());
	if (course != null && course.size() > 0) {
		courseCode = course.get(0).getCode();
	}
%>
				<%=locationCode + "-" + courseCode + "-" + courseSeries.getSeriesCount()%>
			</liferay-ui:search-container-column-text>
	    </liferay-ui:search-container-row>
	    <liferay-ui:search-iterator searchContainer="<%= searchContainer %>" paginate="<%= true %>" />
	</liferay-ui:search-container>
	<aui:script>
	Liferay.provide(
	     window,
	     'constructCourseSeries',
	     function() {
			var courseCheckBoxValue = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fmCourse, "<portlet:namespace />allRowIds");
			var locationCheckBoxValue = Liferay.Util.listCheckedExcept(document.<portlet:namespace />fmLocation, "<portlet:namespace />allRowIds");
			if(courseCheckBoxValue=="" || courseCheckBoxValue==null){
				alert("Please select atleast one courses to create a course series");
				return false;
			}
			if(locationCheckBoxValue=="" || locationCheckBoxValue==null){
				alert("Please select atleast one locations to create a course series");
				return false;
			}
			document.<portlet:namespace />fmCourse.<portlet:namespace />courseIds.value=courseCheckBoxValue;
			document.<portlet:namespace />fmCourse.<portlet:namespace />locationIds.value=locationCheckBoxValue;
			submitForm(document.<portlet:namespace />fmCourse, "<%=addCourseSeriesURL.toString()%>");
	     },
	     ['liferay-util-list-fields']
	);
	</aui:script>
<%
} else if (activeTab.equalsIgnoreCase("add_course")) {
%>
	<aui:form action="<%= addCourseURL %>" name="<portlet:namespace />fm">
	
	        <aui:fieldset>
	            <aui:input name="code" />
	            <aui:input name="name" />
	            <aui:input name="duration" />
	        </aui:fieldset>
	
	        <aui:button-row>
	            <aui:button type="submit"></aui:button>
	            <aui:button type="cancel" onClick="<%= courseViewURL %>"></aui:button>
	        </aui:button-row>
	</aui:form>
<%
} else if (activeTab.equalsIgnoreCase("add_location")) {
%>
	<aui:form action="<%= addLocationURL %>" name="<portlet:namespace />fm">
	
	        <aui:fieldset>
	            <aui:input name="code" />
	            <aui:input name="name" />
	            <aui:input name="notes" />
	            <aui:input name="addressLine1" />
	            <aui:input name="addressLine2" />
	            <aui:input name="city" />
	            <aui:input name="state" />
	            <aui:input name="region" />
	            <aui:input name="country" />
	            <aui:input name="zip" />
	            <aui:input name="phone" />
	            <aui:input name="fax" />
	            <aui:input name="email" />
	        </aui:fieldset>
	
	        <aui:button-row>
	            <aui:button type="submit"></aui:button>
	            <aui:button type="cancel" onClick="<%= locationViewURL %>"></aui:button>
	        </aui:button-row>
	</aui:form>
<%
} else if (activeTab.equalsIgnoreCase("select_course") ||
		activeTab.equalsIgnoreCase("select_course_series_course")) {
	long courseId = Long.valueOf(ParamUtil.getLong(renderRequest, "courseId"));
	Course course = CourseLocalServiceUtil.getCourse(courseId);
%>
	
	<aui:form action="<%= editCourseURL %>" name="<portlet:namespace />fm">
	
	        <aui:fieldset>
	        	<aui:input name="courseId" value="<%=course.getCourseId() %>" type="hidden"/>
	            <aui:input name="code" value="<%=course.getCode() %>"/>
	            <aui:input name="name" value="<%=course.getName() %>"/>
	            <aui:input name="duration" value="<%=course.getDuration() %>"/>
	        </aui:fieldset>
	
	        <aui:button-row>
	            <aui:button type="submit" name="update" value="Update"></aui:button>
<%
if (activeTab.equalsIgnoreCase("select_course")) {
%>
	            <aui:button type="cancel" onClick="<%= courseViewURL %>"></aui:button>
<%
	} else if (activeTab.equalsIgnoreCase("select_course_series_course")) {
%>
				<aui:button type="cancel" onClick="<%= courseSeriesViewURL %>"></aui:button>
<%
	}
%>
	        </aui:button-row>
	</aui:form>
<%
} else if (activeTab.equalsIgnoreCase("select_location") ||
			activeTab.equalsIgnoreCase("select_course_series_location")) {
	long locationId = Long.valueOf(ParamUtil.getLong(renderRequest, "locationId"));
	Location location = LocationLocalServiceUtil.getLocation(locationId);
%>
	
	<aui:form action="<%= editLocationURL %>" name="<portlet:namespace />fm">
	
	        <aui:fieldset>
	        	<aui:input name="locationId" value="<%=location.getLocationId() %>" type="hidden"/>
	            <aui:input name="code" value="<%=location.getCode() %>"/>
	            <aui:input name="name" value="<%=location.getName() %>"/>
	            <aui:input name="notes" value="<%=location.getNotes() %>"/>
	            <aui:input name="addressLine1" value="<%=location.getAddressLine1() %>"/>
	            <aui:input name="addressLine2" value="<%=location.getAddressLine2() %>"/>
	            <aui:input name="city" value="<%=location.getCity() %>"/>
	            <aui:input name="state" value="<%=location.getState() %>"/>
	            <aui:input name="region" value="<%=location.getRegion() %>"/>
	            <aui:input name="country" value="<%=location.getCountry() %>"/>
	            <aui:input name="zip" value="<%=location.getZipcode() %>"/>
	            <aui:input name="phone" value="<%=location.getPhone() %>"/>
	            <aui:input name="fax" value="<%=location.getFax() %>"/>
	            <aui:input name="email" value="<%=location.getEmail() %>"/>
	        </aui:fieldset>
	
	        <aui:button-row>
	            <aui:button type="submit" name="update" value="Update"></aui:button>
<%
if (activeTab.equalsIgnoreCase("select_location")) {
%>
	            <aui:button type="cancel" onClick="<%= locationViewURL %>"></aui:button>
<%
	} else if (activeTab.equalsIgnoreCase("select_course_series_location")) {
%>
				<aui:button type="cancel" onClick="<%= courseSeriesViewURL %>"></aui:button>
<%
	}
%>
	        </aui:button-row>
	</aui:form>
<%
} else if (activeTab.equalsIgnoreCase("select_course_series")) {
	long courseSeriesId = Long.valueOf(ParamUtil.getLong(renderRequest, "courseSeriesId"));
	CourseSeries courseSeries = CourseSeriesLocalServiceUtil.getCourseSeries(courseSeriesId);
%>
	
	<aui:form action="<%= editCourseSeriesURL %>" name="<portlet:namespace />fm">
	
		<aui:fieldset>
			<aui:input name="startDate" value="<%=courseSeries.getStartDate() %>"/>
			<aui:input name="endDate" value="<%=courseSeries.getEndDate() %>"/>
			<aui:input name="type" value="<%=courseSeries.getType() %>"/>
			<aui:input name="publishingStatus" value="<%=courseSeries.getPublishingStatus() %>"/>
			<aui:input name="maxNoStudReg" value="<%=courseSeries.getMaxNoStudReg() %>"/>
		</aui:fieldset>
		<aui:button-row>
			<aui:button type="submit" name="update" value="Update"></aui:button>
		    <aui:button type="cancel" name="Back" onClick="<%= courseSeriesViewURL %>"></aui:button>
		</aui:button-row>
	</aui:form>
<%
}
%>
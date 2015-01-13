<%@include file = "/html/init.jsp" %>
<%
long courseSeriesId = Long.valueOf(ParamUtil.getLong(renderRequest, "courseSeriesId"));
CourseSeries courseSeries = CourseSeriesLocalServiceUtil.getCourseSeries(courseSeriesId);
%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/courseseries/view.jsp"></portlet:param>
</portlet:renderURL>
<portlet:actionURL name="editCourseSeries" var="editCourseSeriesURL"></portlet:actionURL>

<aui:form action="<%= editCourseSeriesURL %>" name="<portlet:namespace />fm">

	<aui:fieldset>
		<aui:input name="startDate" value="<%=courseSeries.getStart_date() %>"/>
		<aui:input name="endDate" value="<%=courseSeries.getEnd_date() %>"/>
		<aui:input name="type" value="<%=courseSeries.getType() %>"/>
		<aui:input name="publishingStatus" value="<%=courseSeries.getPublishing_status() %>"/>
		<aui:input name="maxNoStudReg" value="<%=courseSeries.getMax_no_of_stud_reg() %>"/>
	</aui:fieldset>
	<aui:button-row>
		<aui:button type="submit" name="update" value="Update"></aui:button>
	    <aui:button type="cancel" name="Back" onClick="<%= viewURL %>"></aui:button>
	</aui:button-row>
</aui:form>
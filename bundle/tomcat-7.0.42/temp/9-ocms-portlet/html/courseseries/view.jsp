<%@include file="/html/init.jsp"%>
<portlet:actionURL name="addCourseSeries" var="addCourseSeriesURL"></portlet:actionURL>
<% PortletURL actionURL = renderResponse.createRenderURL(); %>
<aui:form action="<%=addCourseSeriesURL.toString()%>" name="<portlet:namespace />fm">
	<liferay-ui:search-container curParam="locationParam" 
		iteratorURL="<%= actionURL %>" delta="10" 
		emptyResultsMessage="No Results Found">
	    <liferay-ui:search-container-results
	        results="<%=LocationLocalServiceUtil.getLocationByGroupId(scopeGroupId,
	                        searchContainer.getStart(),
	                        searchContainer.getEnd())%>"
	        total="<%=LocationLocalServiceUtil.getLocationsCount()%>" />
	
	    <liferay-ui:search-container-row 
	        className="com.ocms.course.model.Location" modelVar="location" keyProperty="locationId">
	        <portlet:renderURL var="selectLocationURL">
	        	<portlet:param name="locationId" value="<%=String.valueOf(location.getLocationId()) %>" />
	        	<portlet:param name="mvcPath" value="/html/courseseries/select_location.jsp" />
			</portlet:renderURL>
			<liferay-ui:search-container-column-text>
				<aui:input name="<portlet:namespace />locationId" type="checkbox" value="<%=String.valueOf(location.getLocationId()) %>"></aui:input>
			</liferay-ui:search-container-column-text>
	        <liferay-ui:search-container-column-text property="name" href="<%=selectLocationURL.toString() %>"/>
	        <liferay-ui:search-container-column-text property="code" />
	        <liferay-ui:search-container-column-text property="city" />
	        <liferay-ui:search-container-column-text property="state" />
	        <liferay-ui:search-container-column-text property="country" />
	        <liferay-ui:search-container-column-text property="region" />
	
	    </liferay-ui:search-container-row>
	    <liferay-ui:search-iterator searchContainer="<%= searchContainer %>" paginate="<%= true %>" />
	</liferay-ui:search-container>
	
	<liferay-ui:search-container curParam="courseParam"
		iteratorURL="<%=actionURL%>" delta="10"
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
				<portlet:param name="courseId"
					value="<%=String.valueOf(course.getCourseId()) %>" />
				<portlet:param name="mvcPath"
					value="/html/courseseries/select_course.jsp" />
			</portlet:renderURL>
			<liferay-ui:search-container-column-text property="name"
				href="<%=selectCourseURL.toString() %>" />
			<liferay-ui:search-container-column-text property="code" />
			<liferay-ui:search-container-column-text property="duration" />
	
		</liferay-ui:search-container-row>
		<liferay-ui:search-iterator searchContainer="<%= searchContainer %>"
			paginate="<%= true %>" />
	</liferay-ui:search-container>
	
	<aui:button-row cssClass="course-series-buttons">
	    <aui:button type="submit" value="Add Course Series" />
	</aui:button-row>
</aui:form>
<liferay-ui:search-container curParam="courseSeriesParam" 
	iteratorURL="<%= actionURL %>" delta="10" 
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
        	<portlet:param name="mvcPath" value="/html/courseseries/select_courseseries.jsp" />
		</portlet:renderURL>
        <liferay-ui:search-container-column-text property="courseId" href="<%=selectCourseSeriesURL.toString() %>"/>
        <liferay-ui:search-container-column-text property="locationId" href="<%=selectCourseSeriesURL.toString() %>"/>
        <liferay-ui:search-container-column-text property="type" />
        <liferay-ui:search-container-column-text property="start_date" />
        <liferay-ui:search-container-column-text property="end_date" />
        <liferay-ui:search-container-column-text property="publishing_status" />
        <liferay-ui:search-container-column-text property="max_no_of_stud_reg" />

    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator searchContainer="<%= searchContainer %>" paginate="<%= true %>" />
</liferay-ui:search-container>
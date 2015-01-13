<%@include file="/html/init.jsp"%>

<%
    long courseId = Long.valueOf((Long) renderRequest.getAttribute("courseId"));
%>

<portlet:renderURL var="viewPageURL">
    <portlet:param name="mvcPath" value="/html/course/view.jsp" />
</portlet:renderURL>

<aui:nav cssClass="nav-tabs">
    <aui:nav-item cssClass="active" href="<%=viewPageURL%>" label="Courses" />
</aui:nav>

<portlet:renderURL var="addCourseURL">
    <portlet:param name="mvcPath" value="/html/course/add_course.jsp" />
</portlet:renderURL>

<aui:button-row cssClass="course-buttons">
    <aui:button onClick="<%=addCourseURL.toString()%>" value="Add Course" />
</aui:button-row>



<liferay-ui:search-container>
    <liferay-ui:search-container-results
        results="<%=CourseLocalServiceUtil.getCoursesByGroupId(scopeGroupId,
                        searchContainer.getStart(),
                        searchContainer.getEnd())%>"
        total="<%=CourseLocalServiceUtil.getCoursesCount()%>" />

    <liferay-ui:search-container-row 
        className="com.ocms.course.model.Course" modelVar="course">
        <portlet:renderURL var="selectCourseURL">
        	<portlet:param name="courseId" value="<%=String.valueOf(course.getCourseId()) %>" />
        	<portlet:param name="mvcPath" value="/html/course/select_course.jsp" />
		</portlet:renderURL>
        <liferay-ui:search-container-column-text property="name" href="<%=selectCourseURL.toString() %>"/>
        <liferay-ui:search-container-column-text property="code" />
        <liferay-ui:search-container-column-text property="duration" />

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>
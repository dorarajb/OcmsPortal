<%@include file = "/html/init.jsp" %>
<%
long courseId = Long.valueOf(ParamUtil.getLong(renderRequest, "courseId"));
Course course = CourseLocalServiceUtil.getCourse(courseId);
%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/course/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="editCourse" var="editCourseURL"></portlet:actionURL>
<aui:form action="<%= editCourseURL %>" name="<portlet:namespace />fm">

        <aui:fieldset>
        	<aui:input name="courseId" value="<%=course.getCourseId() %>" type="hidden"/>
            <aui:input name="code" value="<%=course.getCode() %>"/>
            <aui:input name="name" value="<%=course.getName() %>"/>
            <aui:input name="duration" value="<%=course.getDuration() %>"/>
        </aui:fieldset>

        <aui:button-row>
            <aui:button type="submit" name="update" value="Update"></aui:button>
            <aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>
        </aui:button-row>
</aui:form>
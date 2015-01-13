<%@include file = "/html/init.jsp" %>
<%
long courseId = Long.valueOf(ParamUtil.getLong(renderRequest, "courseId"));
Course course = CourseLocalServiceUtil.getCourse(courseId);
%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/courseseries/view.jsp"></portlet:param>
</portlet:renderURL>

<aui:input name="code" disabled="true" value="<%=course.getCode() %>"/>
<aui:input name="name" disabled="true" value="<%=course.getName() %>"/>
<aui:input name="duration" disabled="true" value="<%=course.getDuration() %>"/>

<aui:button-row>
    <aui:button type="cancel" name="Back" onClick="<%= viewURL %>"></aui:button>
</aui:button-row>

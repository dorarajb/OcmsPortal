<%@include file = "/html/init.jsp" %>
<%
long coursePackageId = Long.valueOf(ParamUtil.getLong(renderRequest, "coursePackageId"));
CoursePackage coursePackage = CoursePackageLocalServiceUtil.getCoursePackage(coursePackageId);
%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/coursepackage/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="editCoursePackage" var="editCoursePackageURL"></portlet:actionURL>
<aui:form action="<%= editCoursePackageURL %>" name="<portlet:namespace />fm">

        <aui:fieldset>
        	<aui:input name="coursePackageId" value="<%=coursePackage.getCoursePackageId() %>" type="hidden"/>
        	<aui:input name="pname" value="<%=coursePackage.getName() %>"/>
            <aui:input name="pcode" value="<%=coursePackage.getCode() %>"/>
        </aui:fieldset>

        <aui:button-row>
            <aui:button type="submit" name="update" value="Update"></aui:button>
            <aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>
        </aui:button-row>
</aui:form>
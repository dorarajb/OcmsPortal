<%@include file = "/html/init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/coursepackage/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addCoursePackage" var="addCourseURL"></portlet:actionURL>

<aui:form action="<%= addCourseURL %>" name="<portlet:namespace />fm">

        <aui:fieldset>
            <aui:input name="pname" />
            <aui:input name="pcode" />
        </aui:fieldset>

        <aui:button-row>
            <aui:button type="submit"></aui:button>
            <aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>
        </aui:button-row>
</aui:form>
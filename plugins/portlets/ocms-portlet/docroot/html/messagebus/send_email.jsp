<%@include file = "/html/init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/email/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="sendEmail" var="sendEmailURL"></portlet:actionURL>
<aui:form action="<%= sendEmailURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="to" />
        <aui:input name="subject" />
        <aui:input name="body" />
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Push Email"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>
    </aui:button-row>
</aui:form>
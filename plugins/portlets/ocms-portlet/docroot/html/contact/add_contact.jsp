<%@include file = "/html/init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/contact/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addContact" var="addContactURL"></portlet:actionURL>
<aui:form action="<%= addContactURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="contactType" />
        <aui:input name="contactName" />
        <aui:input name="addressLine1" />
        <aui:input name="addressLine2" />
        <aui:input name="city" />
        <aui:input name="state" />
        <aui:input name="region" />
        <aui:input name="zip" />
        <aui:input name="phone" />
        <aui:input name="fax" />
        <aui:input name="email" />
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>
    </aui:button-row>
</aui:form>
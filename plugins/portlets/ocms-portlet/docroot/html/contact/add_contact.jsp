<%@include file = "/html/init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/contact/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addContact" var="addContactURL"></portlet:actionURL>
<aui:form action="<%= addContactURL %>" name="<portlet:namespace />fm">
    <aui:fieldset>
        <aui:input name="Contacttype" />
        <aui:input name="Contactname" />
        <aui:input name="Addressline1" />
        <aui:input name="Addressline2" />
        <aui:input name="City" />
        <aui:input name="State" />
        <aui:input name="Region" />
        <aui:input name="Zip" />
        <aui:input name="Phone" />
        <aui:input name="Fax" />
        <aui:input name="Email" />
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>
    </aui:button-row>
</aui:form>
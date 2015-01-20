<%@include file = "/html/init.jsp" %>
<%
long contactId = Long.valueOf(ParamUtil.getLong(renderRequest, "contactId"));
Contact contact1 = ContactLocalServiceUtil.getContact(contactId);
%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/contact/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="editContact" var="editContactURL"></portlet:actionURL>
<aui:form action="<%= editContactURL %>" name="<portlet:namespace />fm">

        <aui:fieldset>
        	<aui:input name="contactId" value="<%=contact1.getContactId() %>" type="hidden"/>
            <aui:input name="contactType" value="<%=contact1.getContactType() %>"/>
            <aui:input name="contactName" value="<%=contact1.getContactName() %>"/>
            <aui:input name="addressLine1" value="<%=contact1.getAddressLine1() %>"/>
            <aui:input name="addressLine2" value="<%=contact1.getAddressLine2() %>"/>
            <aui:input name="city" value="<%=contact1.getCity() %>"/>
            <aui:input name="state" value="<%=contact1.getState() %>"/>
            <aui:input name="region" value="<%=contact1.getRegion() %>"/>
            <aui:input name="zip" value="<%=contact1.getZip() %>"/>
            <aui:input name="phone" value="<%=contact1.getPhone() %>"/>
            <aui:input name="fax" value="<%=contact1.getFax() %>"/>
            <aui:input name="email" value="<%=contact1.getEmail() %>"/>
        </aui:fieldset>

        <aui:button-row>
            <aui:button type="submit" name="update" value="Update"></aui:button>
            <aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>
        </aui:button-row>
</aui:form>
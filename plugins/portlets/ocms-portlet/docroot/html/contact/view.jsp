<%@include file="/html/init.jsp"%>

<portlet:renderURL var="viewPageURL">
    <portlet:param name="mvcPath" value="/html/contact/view.jsp" />
</portlet:renderURL>

<portlet:renderURL var="addContact">
    <portlet:param name="mvcPath" value="/html/contact/add_contact.jsp" />
</portlet:renderURL>

<aui:button-row cssClass="contact-buttons">
    <aui:button onClick="<%=addContact.toString()%>" value="Add Contact" />
</aui:button-row>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
        results="<%=ContactLocalServiceUtil.getContactByGroupId(scopeGroupId, searchContainer.getStart(), searchContainer.getEnd())%>"
        total="<%=ContactLocalServiceUtil.getContactsCount()%>" />

    <liferay-ui:search-container-row className="com.ocms.course.model.Contact" modelVar="contacts">
        <portlet:renderURL var="selectContactURL">
        	<portlet:param name="contactId" value="<%=String.valueOf(contacts.getContactId()) %>" />
        	<portlet:param name="mvcPath" value="/html/contact/select_contact.jsp" />
		</portlet:renderURL>
		<liferay-ui:search-container-column-text property="contactType"/>
        <liferay-ui:search-container-column-text property="contactName" href="<%=selectContactURL.toString() %>"/>
        <liferay-ui:search-container-column-text property="addressLine1" />
        <liferay-ui:search-container-column-text property="addressLine2" />
        <liferay-ui:search-container-column-text property="city" />
        <liferay-ui:search-container-column-text property="state" />
        <liferay-ui:search-container-column-text property="region" />
        <liferay-ui:search-container-column-text property="zip" />
        <liferay-ui:search-container-column-text property="phone" />
        <liferay-ui:search-container-column-text property="fax" />
        <liferay-ui:search-container-column-text property="email" />

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>
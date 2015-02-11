<%@include file="/html/init.jsp"%>
<portlet:renderURL var="viewPageURL">
    <portlet:param name="mvcPath" value="/html/event/view.jsp" />
</portlet:renderURL>

<portlet:actionURL name="addEvent" var="addEventURL"></portlet:actionURL>
<aui:button-row cssClass="contact-buttons">
    <aui:button onClick="<%= addEventURL %>" value="Add event" />
</aui:button-row>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
        results="<%=EventLocalServiceUtil.getEventByFlag(1)%>"
        total="<%=EventLocalServiceUtil.getEventsCount()%>" />

    <liferay-ui:search-container-row className="com.ocms.course.model.Event" modelVar="event">
        <%-- <portlet:renderURL var="selectContactURL">
        	<portlet:param name="contactId" value="<%=String.valueOf(contacts.getContactId()) %>" />
        	<portlet:param name="mvcPath" value="/html/contact/select_contact.jsp" />
		</portlet:renderURL> --%>
		<liferay-ui:search-container-column-text property="eventId"/>
        <liferay-ui:search-container-column-text property="eventName" />
        <liferay-ui:search-container-column-text property="courseCode" />
        <liferay-ui:search-container-column-text property="locationCode" />
        <liferay-ui:search-container-column-text property="flag" />

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

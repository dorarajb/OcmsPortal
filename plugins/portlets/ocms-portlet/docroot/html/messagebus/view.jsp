<%@include file = "/html/init.jsp" %>

<portlet:defineObjects />

<portlet:renderURL var="sendEmailURL">
	<portlet:param name="mvcPath" value="/html/messagebus/send_email.jsp"></portlet:param>
</portlet:renderURL>

<aui:button-row cssClass="course-buttons">
    <aui:button onClick="<%=sendEmailURL.toString()%>" value="ActiveMQ" />
</aui:button-row>

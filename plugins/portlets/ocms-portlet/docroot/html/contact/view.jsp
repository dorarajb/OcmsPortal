<%@include file="/html/init.jsp"%>

<portlet:renderURL var="viewPageURL">
    <portlet:param name="mvcPath" value="/html/contact/view.jsp" />
</portlet:renderURL>

<aui:nav cssClass="nav-tabs">
    <aui:nav-item cssClass="active" href="<%=viewPageURL%>" label="Contact" />
</aui:nav>

<portlet:renderURL var="addContact">
    <portlet:param name="mvcPath" value="/html/contact/add_contact.jsp" />
</portlet:renderURL>

<aui:button-row cssClass="contact-buttons">
    <aui:button onClick="<%=addContact.toString()%>" value="Add Contact" />
</aui:button-row>
<%@include file="/html/init.jsp"%>

<%
    long locationId = Long.valueOf((Long) renderRequest.getAttribute("locationId"));
%>

<portlet:renderURL var="viewPageURL">
    <portlet:param name="mvcPath" value="/html/location/view.jsp" />
</portlet:renderURL>

<aui:nav cssClass="nav-tabs">
    <aui:nav-item cssClass="active" href="<%=viewPageURL%>" label="Location" />
</aui:nav>

<portlet:renderURL var="addLocationURL">
    <portlet:param name="mvcPath" value="/html/location/add_location.jsp" />
</portlet:renderURL>

<aui:button-row cssClass="location-buttons">
    <aui:button onClick="<%=addLocationURL.toString()%>" value="Add Location" />
</aui:button-row>



<liferay-ui:search-container>
    <liferay-ui:search-container-results
        results="<%=LocationLocalServiceUtil.getLocationByGroupId(scopeGroupId,
                        searchContainer.getStart(),
                        searchContainer.getEnd())%>"
        total="<%=LocationLocalServiceUtil.getLocationsCount()%>" />

    <liferay-ui:search-container-row 
        className="com.ocms.course.model.Location" modelVar="location">
        <portlet:renderURL var="selectLocationURL">
        	<portlet:param name="locationId" value="<%=String.valueOf(location.getLocationId()) %>" />
        	<portlet:param name="mvcPath" value="/html/location/select_location.jsp" />
		</portlet:renderURL>
        <liferay-ui:search-container-column-text property="name" href="<%=selectLocationURL.toString() %>"/>
        <liferay-ui:search-container-column-text property="code" />
        <liferay-ui:search-container-column-text property="city" />
        <liferay-ui:search-container-column-text property="state" />
        <liferay-ui:search-container-column-text property="country" />
        <liferay-ui:search-container-column-text property="region" />

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>
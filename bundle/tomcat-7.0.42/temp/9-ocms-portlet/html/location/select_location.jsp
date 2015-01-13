<%@include file = "/html/init.jsp" %>
<%
long locationId = Long.valueOf(ParamUtil.getLong(renderRequest, "locationId"));
Location location = LocationLocalServiceUtil.getLocation(locationId);
%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/location/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="editLocation" var="editLocationURL"></portlet:actionURL>
<aui:form action="<%= editLocationURL %>" name="<portlet:namespace />fm">

        <aui:fieldset>
        	<aui:input name="locationId" value="<%=location.getLocationId() %>" type="hidden"/>
            <aui:input name="code" value="<%=location.getCode() %>"/>
            <aui:input name="name" value="<%=location.getName() %>"/>
            <aui:input name="notes" value="<%=location.getNotes() %>"/>
            <aui:input name="addressLine1" value="<%=location.getAddressLine1() %>"/>
            <aui:input name="addressLine2" value="<%=location.getAddressLine2() %>"/>
            <aui:input name="city" value="<%=location.getCity() %>"/>
            <aui:input name="state" value="<%=location.getState() %>"/>
            <aui:input name="region" value="<%=location.getRegion() %>"/>
            <aui:input name="country" value="<%=location.getCountry() %>"/>
            <aui:input name="zip" value="<%=location.getZipcode() %>"/>
            <aui:input name="phone" value="<%=location.getPhone() %>"/>
            <aui:input name="fax" value="<%=location.getFax() %>"/>
            <aui:input name="email" value="<%=location.getEmail() %>"/>
        </aui:fieldset>

        <aui:button-row>
            <aui:button type="submit" name="update" value="Update"></aui:button>
            <aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>
        </aui:button-row>
</aui:form>
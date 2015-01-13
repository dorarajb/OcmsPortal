<%@include file = "/html/init.jsp" %>
<%
long locationId = Long.valueOf(ParamUtil.getLong(renderRequest, "locationId"));
Location location = LocationLocalServiceUtil.getLocation(locationId);
%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/courseseries/view.jsp"></portlet:param>
</portlet:renderURL>

<aui:input name="locationId" disabled="true" value="<%=location.getLocationId() %>" type="hidden"/>
<aui:input name="code" disabled="true" value="<%=location.getCode() %>"/>
<aui:input name="name" disabled="true" value="<%=location.getName() %>"/>
<aui:input name="notes" disabled="true" value="<%=location.getNotes() %>"/>
<aui:input name="addressLine1" disabled="true" value="<%=location.getAddressLine1() %>"/>
<aui:input name="addressLine2" disabled="true" value="<%=location.getAddressLine2() %>"/>
<aui:input name="city" disabled="true" value="<%=location.getCity() %>"/>
<aui:input name="state" disabled="true" value="<%=location.getState() %>"/>
<aui:input name="region" disabled="true" value="<%=location.getRegion() %>"/>
<aui:input name="country" disabled="true" value="<%=location.getCountry() %>"/>
<aui:input name="zip" disabled="true" value="<%=location.getZipcode() %>"/>
<aui:input name="phone" disabled="true" value="<%=location.getPhone() %>"/>
<aui:input name="fax" disabled="true" value="<%=location.getFax() %>"/>
<aui:input name="email" disabled="true" value="<%=location.getEmail() %>"/>

<aui:button-row>
    <aui:button type="cancel" name="Back" onClick="<%= viewURL %>"></aui:button>
</aui:button-row>
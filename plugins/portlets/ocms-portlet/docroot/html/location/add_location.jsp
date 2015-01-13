<%@include file = "/html/init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/location/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addLocation" var="addLocationURL"></portlet:actionURL>

<aui:form action="<%= addLocationURL %>" name="<portlet:namespace />fm">

        <aui:fieldset>
            <aui:input name="code" />
            <aui:input name="name" />
            <aui:input name="notes" />
            <aui:input name="addressLine1" />
            <aui:input name="addressLine2" />
            <aui:input name="city" />
            <aui:input name="state" />
            <aui:input name="region" />
            <aui:input name="country" />
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
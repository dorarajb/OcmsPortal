<%@include file="/html/init.jsp"%>

<portlet:renderURL var="viewPageURL">
    <portlet:param name="mvcPath" value="/html/coursepackage/view.jsp" />
</portlet:renderURL>


<portlet:renderURL var="addPackageDetailsURL">
    <portlet:param name="mvcPath" value="/html/coursepackage/addpackagedetails.jsp" />
</portlet:renderURL>
<portlet:actionURL name="listDropDownValues" var="listDropDownValuesURL"></portlet:actionURL>
<aui:button-row cssClass="course-buttons">
    <aui:button onClick="<%= listDropDownValuesURL %>" value="Add Course" />
</aui:button-row>




<% CoursePackage coursePackageDetails = (CoursePackage)session.getAttribute("coursePackage");%>
<%int packageId = (int)coursePackageDetails.getCoursePackageId(); %>
<liferay-ui:search-container emptyResultsMessage="there-are-no-students"
headerNames="courseName,LocationName,currency,min.Deposit,price,studentAddress"
delta="5"
deltaConfigurable="true">

    <liferay-ui:search-container-results> <% results= PricingLocalServiceUtil.getPricingByPackageId(packageId, 
    		searchContainer.getStart(),searchContainer.getEnd());
        total= PricingLocalServiceUtil.getPricingsCount(); 
        searchContainer.setTotal(total);
           searchContainer.setResults(results); %> 
           </liferay-ui:search-container-results>

    <liferay-ui:search-container-row 
        className="com.ocms.course.model.Pricing" modelVar="PricingDetails">
        <portlet:renderURL var="selectPricingDetailsURL">
        	<portlet:param name="coursePackageId" value= "${packageId}" />
        	<portlet:param name="mvcPath" value="/html/coursepackage/select_coursepackage.jsp" />
		</portlet:renderURL>
        <liferay-ui:search-container-column-text name="courseCode" property="courseCode" href="<%= selectPricingDetailsURL.toString() %>" />
        <liferay-ui:search-container-column-text name="locationCode" property="locationCode" />
        <liferay-ui:search-container-column-text name="currency" property="currency" />
        <liferay-ui:search-container-column-text name="deposit" property="deposit" />
        <liferay-ui:search-container-column-text name="price" property="price" />
        <liferay-ui:search-container-column-text name="effectiveDate" property="effectiveDate" />

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>
<aui:button-row cssClass="course-buttons">
    <aui:button onClick="<%=viewPageURL.toString()%>" value="Back" />
</aui:button-row>
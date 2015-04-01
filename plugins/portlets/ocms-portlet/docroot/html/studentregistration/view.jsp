<%@include file="/html/init.jsp"%>

<portlet:renderURL var="addStudentRegistration">
    <portlet:param name="mvcPath" value="/html/studentregistration/add_studentregistration.jsp" />
</portlet:renderURL>

<aui:button-row cssClass="studentregistration-buttons">
    <aui:button onClick="<%=addStudentRegistration.toString()%>" value="Student Registration" />
</aui:button-row>

<liferay-ui:search-container>
    <liferay-ui:search-container-results
        results="<%=StudentRegistrationLocalServiceUtil.getStudentRegistrationByGroupId(scopeGroupId, searchContainer.getStart(), searchContainer.getEnd())%>"
        total="<%=StudentRegistrationLocalServiceUtil.getStudentRegistrationsCount()%>" />

    <liferay-ui:search-container-row className="com.ocms.course.model.StudentRegistration" modelVar="studentRegistrations">
        <portlet:renderURL var="selectStudentRegistrationURL">
        	<portlet:param name="studentRegistrationId" value="<%=String.valueOf(studentRegistrations.getStudRegId()) %>" />
        	<portlet:param name="mvcPath" value="/html/studentregistration/select_studentregistration.jsp" />
		</portlet:renderURL>
		
		<liferay-ui:search-container-column-text property="memo" href="<%=selectStudentRegistrationURL.toString() %>"/>
        <liferay-ui:search-container-column-text property="studRegStatus" name="Status"/>
        <liferay-ui:search-container-column-text property="advisorOrig" name="Advisor Original"/>
        <liferay-ui:search-container-column-text property="advisorReg" name="Advisor Registration"/>
        <liferay-ui:search-container-column-text property="commMethod" name="Communication Method"/>
        <liferay-ui:search-container-column-text property="notes" name="Notes"/>
        <liferay-ui:search-container-column-text property="currency" name="Currency"/>
        <liferay-ui:search-container-column-text property="tax" name="Tax"/>
        <liferay-ui:search-container-column-text property="autoCharge" name="Auto Charge"/>
        <liferay-ui:search-container-column-text property="currencyPaid" name="Currency Paid"/>
        <liferay-ui:search-container-column-text property="exchangeRate" name="Exchange Rate"/>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>
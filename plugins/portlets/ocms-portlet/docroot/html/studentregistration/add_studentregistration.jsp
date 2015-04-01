<%@page import="com.ocms.studentregistration.RegistrationAutoCharge"%>
<%@page import="com.ocms.studentregistration.RegistrationCurrency"%>
<%@page import="com.ocms.studentregistration.RegistrationCommunicationMethod"%>
<%@page import="com.ocms.studentregistration.RegistrationMemo"%>
<%@page import="com.ocms.studentregistration.RegistrationStatus"%>
<%@include file = "/html/init.jsp" %>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/studentregistration/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="addStudentRegistration" var="addStudentRegistrationURL"></portlet:actionURL>
<aui:form action="<%= addStudentRegistrationURL %>" name="<portlet:namespace />fm" ng-controller="studentregistrationCtrl">

    <aui:fieldset>
    
		<aui:select name="contact" label="Contact">
		<%  for (Contact contact1 : ContactLocalServiceUtil.getContactByGroupId(scopeGroupId)) {  %>
			<aui:option value="<%= contact1.getContactId() %>">
				<liferay-ui:message key="<%= contact1.getContactName() %>" />
			</aui:option>
		<% } %>
		</aui:select>

		<aui:select name="memo" label="Memo">
		<%  for (RegistrationMemo regMemo : RegistrationMemo.values()) {  %>
			<aui:option value="<%= regMemo.getMemo() %>">
				<liferay-ui:message key="<%= regMemo.getMemo() %>" />
			</aui:option>
		<% } %>
		</aui:select>
        <aui:select name="studRegStatus" label="Registration Status">
		<%  for (RegistrationStatus regStatus : RegistrationStatus.values()) {  %>
			<aui:option value="<%= regStatus.getStatus() %>">
				<liferay-ui:message key="<%= regStatus.getStatus() %>" />
			</aui:option>
		<% } %>
		</aui:select>
        <aui:input name="advisorOrig" label="Advisor Original"/>
        <aui:input name="advisorReg" label="Advisor Registration"/>
        <aui:select name="commMethod" label="Communication Method">
		<%  for (RegistrationCommunicationMethod commMethod : RegistrationCommunicationMethod.values()) {  %>
			<aui:option value="<%= commMethod.getMethod() %>">
				<liferay-ui:message key="<%= commMethod.getMethod() %>" />
			</aui:option>
		<% } %>
		</aui:select>
        <aui:input name="notes" label="Notes"/>
       	<aui:select name="currency" label="Currency">
		<%  for (RegistrationCurrency currency : RegistrationCurrency.values()) {  %>
			<aui:option value="<%= currency.getCurrency() %>">
				<liferay-ui:message key="<%= currency.getCurrency() %>" />
			</aui:option>
		<% } %>
		</aui:select>
        <aui:input name="tax" label="Tax"/>
       	<aui:select name="autoCharge" label="Auto Charge">
		<%  for (RegistrationAutoCharge autoCharge : RegistrationAutoCharge.values()) {  %>
			<aui:option value="<%= autoCharge.getAutoCharge() %>">
				<liferay-ui:message key="<%= autoCharge.getAutoCharge() %>" />
			</aui:option>
		<% } %>
		</aui:select>
       	<aui:select name="currencyPaid" label="Currency Paid">
		<%  for (RegistrationCurrency currency : RegistrationCurrency.values()) {  %>
			<aui:option value="<%= currency.getCurrency() %>">
				<liferay-ui:message key="<%= currency.getCurrency() %>" />
			</aui:option>
		<% } %>
		</aui:select>
        <aui:input name="exchangeRate" label="Exchange Rate"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit"></aui:button>
        <aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>
    </aui:button-row>
</aui:form>
<%@page import="com.ocms.studentregistration.RegistrationAutoCharge"%>
<%@page import="com.ocms.studentregistration.RegistrationCurrency"%>
<%@page import="com.ocms.studentregistration.RegistrationCommunicationMethod"%>
<%@page import="com.ocms.studentregistration.RegistrationMemo"%>
<%@page import="com.ocms.studentregistration.RegistrationStatus"%>
<%@include file = "/html/init.jsp" %>
<%
long studentRegistrationId = Long.valueOf(ParamUtil.getLong(renderRequest, "studentRegistrationId"));
StudentRegistration studentregistration1 = StudentRegistrationLocalServiceUtil.getStudentRegistration(studentRegistrationId);
%>

<portlet:renderURL var="viewURL">
    <portlet:param name="mvcPath" value="/html/studentregistration/view.jsp"></portlet:param>
</portlet:renderURL>

<portlet:actionURL name="editStudentRegistration" var="editStudentRegistrationURL"></portlet:actionURL>
<aui:form action="<%= editStudentRegistrationURL %>" name="<portlet:namespace />fm">
		<aui:input name="studentRegistrationId" type="hidden" value="<%=studentregistration1.getStudRegId() %>"></aui:input>
        <aui:fieldset>
        
       		<aui:select name="contact" label="Contact">
			<%  for (Contact contact1 : ContactLocalServiceUtil.getContactByGroupId(scopeGroupId)) {  %>
				<aui:option value="<%= contact1.getContactId() %>" selected="<%=studentregistration1.getContactId() ==  contact1.getContactId() %>">
					<liferay-ui:message key="<%= contact1.getContactName() %>" />
				</aui:option>
			<% } %>
			</aui:select>
			<aui:select name="memo" label="Memo" >
			<%  for (RegistrationMemo regMemo : RegistrationMemo.values()) {  %>
				<aui:option value="<%= regMemo.getMemo() %>" selected="<%=studentregistration1.getMemo().equalsIgnoreCase(regMemo.getMemo()) %>">
					<liferay-ui:message key="<%= regMemo.getMemo() %>" />
				</aui:option>
			<% } %>
			</aui:select>
	        <aui:select name="studRegStatus" label="Registration Status">
			<%  for (RegistrationStatus regStatus : RegistrationStatus.values()) {  %>
				<aui:option value="<%= regStatus.getStatus() %>" selected="<%=studentregistration1.getStudRegStatus().equalsIgnoreCase(regStatus.getStatus()) %>">
					<liferay-ui:message key="<%= regStatus.getStatus() %>" />
				</aui:option>
			<% } %>
			</aui:select>
            <aui:input label="Advisor Original" name="advisorOrig" value="<%=studentregistration1.getAdvisorOrig() %>"/>
            <aui:input label="Adivsor Registration" name="advisorReg" value="<%=studentregistration1.getAdvisorReg() %>"/>
	        <aui:select name="commMethod" label="Communication Method">
			<%  for (RegistrationCommunicationMethod commMethod : RegistrationCommunicationMethod.values()) {  %>
				<aui:option value="<%= commMethod.getMethod() %>" selected="<%=studentregistration1.getCommMethod().equalsIgnoreCase(commMethod.getMethod())%>">
					<liferay-ui:message key="<%= commMethod.getMethod() %>" />
				</aui:option>
			<% } %>
			</aui:select>
	        <aui:input label="Notes" name="notes" value="<%=studentregistration1.getNotes() %>"/>
	       	<aui:select name="currency" label="Currency">
			<%  for (RegistrationCurrency currency : RegistrationCurrency.values()) {  %>
				<aui:option value="<%= currency.getCurrency() %>" selected="<%=studentregistration1.getCurrency().equalsIgnoreCase(currency.getCurrency())%>">
					<liferay-ui:message key="<%= currency.getCurrency() %>" />
				</aui:option>
			<% } %>
			</aui:select>
	        <aui:input label="Tax" name="tax" value="<%=studentregistration1.getTax() %>"/>
	       	<aui:select name="autoCharge" label="Auto Charge">
			<%  for (RegistrationAutoCharge autoCharge : RegistrationAutoCharge.values()) {  %>
				<aui:option value="<%= autoCharge.getAutoCharge() %>" selected="<%=studentregistration1.getAutoCharge().equalsIgnoreCase(autoCharge.getAutoCharge())%>">
					<liferay-ui:message key="<%= autoCharge.getAutoCharge() %>" />
				</aui:option>
			<% } %>
			</aui:select>
	       	<aui:select name="currencyPaid" label="Currency Paid">
			<%  for (RegistrationCurrency currency : RegistrationCurrency.values()) {  %>
				<aui:option value="<%= currency.getCurrency() %>" selected="<%=studentregistration1.getCurrencyPaid().equalsIgnoreCase(currency.getCurrency())%>">
					<liferay-ui:message key="<%= currency.getCurrency() %>" />
				</aui:option>
			<% } %>
			</aui:select>
	        <aui:input label="Exchange Rate" name="exchangeRate" value="<%=studentregistration1.getExchangeRate() %>"/>
        </aui:fieldset>

        <aui:button-row>
            <aui:button type="submit" name="update" value="Update"></aui:button>
            <aui:button type="cancel" onClick="<%= viewURL %>"></aui:button>
        </aui:button-row>
</aui:form>
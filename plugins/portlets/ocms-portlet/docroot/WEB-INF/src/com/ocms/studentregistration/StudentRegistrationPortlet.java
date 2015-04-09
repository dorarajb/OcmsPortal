package com.ocms.studentregistration;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.ocms.course.model.Contact;
import com.ocms.course.model.StudentRegistration;
import com.ocms.course.service.ContactLocalServiceUtil;
import com.ocms.course.service.StudentRegistrationLocalServiceUtil;

/**
 * Portlet implementation class StudentRegistrationPortlet
 */
public class StudentRegistrationPortlet extends MVCPortlet {
 
	public void addStudentRegistration(ActionRequest request, ActionResponse response)throws PortalException, SystemException {
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(StudentRegistration.class.getName(), request);

		Long contactId = ParamUtil.getLong(request, "contact");
	    String memo = ParamUtil.getString(request, "memo");
	    String studRegStatus = ParamUtil.getString(request, "studRegStatus");
	    String advisorOrig = ParamUtil.getString(request, "advisorOrig");
	    String advisorReg = ParamUtil.getString(request, "advisorReg");
	    Long coursePackageId = ParamUtil.getLong(request, "coursePackageId");
	    Long discountId = ParamUtil.getLong(request, "discountId");
	    String commMethod = ParamUtil.getString(request, "commMethod");
	    String notes = ParamUtil.getString(request, "notes");
	    String currency = ParamUtil.getString(request, "currency");
	    Long tax = ParamUtil.getLong(request, "tax");
	    String autoCharge = ParamUtil.getString(request, "autoCharge");
	    String currencyPaid = ParamUtil.getString(request, "currencyPaid");
	    Long exchangeRate = ParamUtil.getLong(request, "exchangeRate");
	    
	    try{
			StudentRegistrationLocalServiceUtil.addStudentRegistration(
					serviceContext.getUserId(), contactId, memo, studRegStatus,
					advisorOrig, advisorReg, coursePackageId, discountId,
					commMethod, notes, currency, tax, autoCharge, currencyPaid, exchangeRate, serviceContext);
	    	SessionMessages.add(request, "StudentRegistrationAdded");
	    	
	    	Contact contact = ContactLocalServiceUtil.getContact(contactId);
		    String emailTo = ContactLocalServiceUtil.getContact(contactId).getEmail();
		    String emailSubject = "Registration Confirmation";
		    String emailBody = "Thank you for your registration with us!  Please find the details below. \n "
		    		+ "-------------------------------- \n\n\nEmail                   : " + contact.getEmail() 
		    		+ "\nOrder Date              : " + new Date() 
		    		+ "\nOrder Status    : Awaiting Payment";
		    
			Message message = new Message();
			message.put("mailSubject", emailSubject);
			message.put("mailBody", emailBody);
			message.put("toEmailAddress", emailTo);
			message.put("fromEmailAddress", "markodojo.test3@gmail.com");
			MessageBusUtil.sendMessage("liferay/mail/destination", message);
	    }catch(Exception e){
	    	SessionErrors.add(request, e.getClass().getName());
	        response.setRenderParameter("mvcPath","/html/studentregistration/add_studentregistration.jsp");
	    }
	}
	
	public void editStudentRegistration(ActionRequest request, ActionResponse response)throws PortalException, SystemException {
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(StudentRegistration.class.getName(), request);
		long studentRegistrationId = ParamUtil.getLong(request, "studentRegistrationId");

		Long contactId = ParamUtil.getLong(request, "contact");
	    String memo = ParamUtil.getString(request, "memo");
	    String studRegStatus = ParamUtil.getString(request, "studRegStatus");
	    String advisorOrig = ParamUtil.getString(request, "advisorOrig");
	    String advisorReg = ParamUtil.getString(request, "advisorReg");
	    Long coursePackageId = ParamUtil.getLong(request, "coursePackageId");
	    Long discountId = ParamUtil.getLong(request, "discountId");
	    String commMethod = ParamUtil.getString(request, "commMethod");
	    String notes = ParamUtil.getString(request, "notes");
	    String currency = ParamUtil.getString(request, "currency");
	    Long tax = ParamUtil.getLong(request, "tax");
	    String autoCharge = ParamUtil.getString(request, "autoCharge");
	    String currencyPaid = ParamUtil.getString(request, "currencyPaid");
	    Long exchangeRate = ParamUtil.getLong(request, "exchangeRate");
	    
	    try{
			StudentRegistrationLocalServiceUtil.updateStudentRegistration(
					serviceContext.getUserId(), studentRegistrationId, contactId, memo, studRegStatus,
					advisorOrig, advisorReg, coursePackageId, discountId,
					commMethod, notes, currency, tax, autoCharge, currencyPaid, exchangeRate, serviceContext);
	    	SessionMessages.add(request, "StudentRegistrationUpdated");
	    	
	    	Contact contact = ContactLocalServiceUtil.getContact(contactId);
		    String emailTo = ContactLocalServiceUtil.getContact(contactId).getEmail();
		    String emailSubject = "Registration Confirmation";
		    String emailBody = "Thank you for your registration with us!  Please find the details below. \n "
		    		+ "-------------------------------- \n\n\nEmail                   : " + contact.getEmail() 
		    		+ "\nOrder Date              : " + new Date() 
		    		+ "\nOrder Status    : Awaiting Payment";
		    
			Message message = new Message();
			message.put("mailSubject", emailSubject);
			message.put("mailBody", emailBody);
			message.put("toEmailAddress", emailTo);
			message.put("fromEmailAddress", "markodojo.test3@gmail.com");
			MessageBusUtil.sendMessage("liferay/mail/destination", message);
	    	
	    }catch(Exception e){
	    	SessionErrors.add(request, e.getClass().getName());
	        response.setRenderParameter("mvcPath","/html/studentregistration/select_studentregistration.jsp");
	    }
	}
}

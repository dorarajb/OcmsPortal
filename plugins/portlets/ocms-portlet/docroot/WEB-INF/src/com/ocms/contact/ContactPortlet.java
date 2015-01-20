package com.ocms.contact;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.ocms.course.model.Contact;
import com.ocms.course.service.ContactLocalServiceUtil;

/**
 * Portlet implementation class ContactPortlet
 */
public class ContactPortlet extends MVCPortlet {
	
	public void addContact(ActionRequest request, ActionResponse response)throws PortalException, SystemException {
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Contact.class.getName(), request);

	    String contactType = ParamUtil.getString(request, "contactType");
	    String contactName = ParamUtil.getString(request, "contactName");
	    String addressLine1 = ParamUtil.getString(request, "addressLine1");
	    String addressLine2 = ParamUtil.getString(request, "addressLine2");
	    String city = ParamUtil.getString(request, "city");
	    String state = ParamUtil.getString(request, "state");
	    String region = ParamUtil.getString(request, "region");
	    String zip = ParamUtil.getString(request, "zip");
	    String phone = ParamUtil.getString(request, "phone");
	    String fax = ParamUtil.getString(request, "fax");
	    String email = ParamUtil.getString(request, "email");
	    
	    try{
	    	ContactLocalServiceUtil.addContact(serviceContext.getUserId(), contactType, contactName, addressLine1, addressLine2, city, state, region, zip, phone, fax, email, serviceContext);
	    	SessionMessages.add(request, "ContactAdded");
	    }catch(Exception e){
	    	SessionErrors.add(request, e.getClass().getName());
	        response.setRenderParameter("mvcPath","/html/contact/add_contact.jsp");
	    }
	}
	
	public void editContact(ActionRequest request, ActionResponse response)throws PortalException, SystemException {
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(Contact.class.getName(), request);
		long contactId = ParamUtil.getLong(request, "contactId");

	    String contactType = ParamUtil.getString(request, "contactType");
	    String contactName = ParamUtil.getString(request, "contactName");
	    String addressLine1 = ParamUtil.getString(request, "addressLine1");
	    String addressLine2 = ParamUtil.getString(request, "addressLine2");
	    String city = ParamUtil.getString(request, "city");
	    String state = ParamUtil.getString(request, "state");
	    String region = ParamUtil.getString(request, "region");
	    String zip = ParamUtil.getString(request, "zip");
	    String phone = ParamUtil.getString(request, "phone");
	    String fax = ParamUtil.getString(request, "fax");
	    String email = ParamUtil.getString(request, "email");
	    
	    try{
	    	ContactLocalServiceUtil.updateContact(serviceContext.getUserId(), contactId, contactType, contactName, addressLine1, addressLine2, city, state, region, zip, phone, fax, email, serviceContext);
	    	SessionMessages.add(request, "ContactUpdated");
	    }catch(Exception e){
	    	SessionErrors.add(request, e.getClass().getName());
	        response.setRenderParameter("mvcPath","/html/contact/select_contact.jsp");
	    }
	}
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException, IOException {
		try{
			ServiceContext serviceContext = ServiceContextFactory.getInstance(Contact.class.getName(), renderRequest);

	        long groupId = serviceContext.getScopeGroupId();

	        long contactId = ParamUtil.getLong(renderRequest, "contactId");
	        
	        List<Contact> contacts = ContactLocalServiceUtil.getContactByGroupId(groupId);
	        if (contacts.size() == 0) {
	        	Contact contact = ContactLocalServiceUtil.addContact(serviceContext.getUserId(), "Home", "Course", "Newton Road", "Huston Street", "Bloomington", "Ohio", "xxx", "0000", "000-000-0000", "000-000-0000", "x@y.com", serviceContext);
	        	contactId = contact.getContactId();
	        }
	        if (!(contactId > 0)) {
	        	contactId = contacts.get(0).getContactId();
	        }
	        renderRequest.setAttribute("contactId", contactId);
			
		}catch(Exception e){
			throw new PortletException(e);
		}
		super.render(renderRequest, renderResponse);
	}
}

package com.ocms.messagebus;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ActiveMqPortlet
 */
public class MessageBusPortlet extends MVCPortlet {
 
	public void sendEmail(ActionRequest request, ActionResponse response)throws PortalException, SystemException {

	    String emailTo = ParamUtil.getString(request, "to");
	    String emailSubject = ParamUtil.getString(request, "subject");
	    String emailBody = ParamUtil.getString(request, "body");
	    
		Message message = new Message();
		message.put("mailSubject", emailSubject);
		message.put("mailBody", emailBody);
		message.put("toEmailAddress", emailTo);
		message.put("fromEmailAddress", "markodojo.test3@gmail.com");
		try {
			MessageBusUtil.sendMessage("liferay/mail/destination", message);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

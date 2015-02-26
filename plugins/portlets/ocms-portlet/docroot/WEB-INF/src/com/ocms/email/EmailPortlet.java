package com.ocms.email;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.mail.service.MailServiceUtil;
import com.liferay.portal.kernel.mail.MailMessage;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class EmailPortlet
 */
public class EmailPortlet extends MVCPortlet {
 
	public void sendEmail(ActionRequest request, ActionResponse response) {

	    String emailTo = ParamUtil.getString(request, "to");
	    String emailSubject = ParamUtil.getString(request, "subject");
	    String emailBody = ParamUtil.getString(request, "body");
	    
        try {
			MailMessage mailMessage=new MailMessage();
			mailMessage.setBody(emailBody);
			mailMessage.setSubject(emailSubject);
			mailMessage.setFrom(new InternetAddress("markodojo.test3@gmail.com"));
			mailMessage.setTo(new InternetAddress(emailTo));
			MailServiceUtil.sendEmail(mailMessage);
			SessionMessages.add(request.getPortletSession(),"mail-send-success");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
	    
	    
//	    Properties properties = System.getProperties();
//		properties.put("mail.smtp.starttls.enable", "true"); 
//		properties.put("mail.smtp.host", "smtp.gmail.com");
//		properties.put("mail.smtp.port", "587");
//		properties.put("mail.smtp.auth", "true");
//
//		Authenticator authenticator = new Authenticator () {
//		    public PasswordAuthentication getPasswordAuthentication(){
//			return new PasswordAuthentication(
//					"markodojo.test3@gmail.com",
//					"markodojo$123");
//		    }
//		};
//		
//		// Get the default Session object.
//		javax.mail.Session session = javax.mail.Session
//				.getDefaultInstance(properties, authenticator);
//
//		try {
//			MimeMessage mimeMessage = new MimeMessage(session);
//			mimeMessage.setFrom(new InternetAddress("markodojo.test3@gmail.com"));
//			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
//			mimeMessage.setSubject(emailSubject);
//			mimeMessage.setContent(emailBody, "text/html");					
//			Transport.send(mimeMessage);
//			System.out.println("Sent message successfully....");
//		} catch (MessagingException mex) {
//			mex.printStackTrace();
//		}
	    
	}
}

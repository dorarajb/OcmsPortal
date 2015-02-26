package com.ocms.messagebus;

import javax.mail.internet.InternetAddress;

import com.liferay.mail.service.MailServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.mail.MailMessage;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;

public class BulkMailSenderListenerImpl implements MessageListener {
	
	private static Log _log = LogFactoryUtil.getLog(BulkMailSenderListenerImpl.class);
	
	public void receive(Message message) {
        try {
            doReceive(message);
        }
        catch (Exception e) {
            _log.error("Unable to process message " + message, e);
        }
    }
	
    protected void doReceive(Message message) throws Exception {
        
    	String mailSubject = (String)message.get("mailSubject");
    	System.out.println("mailSubject = " + mailSubject);
    	
        String mailBody = (String)message.get("mailBody");
        String fromEmailAddress =(String)message.get("fromEmailAddress");
        String toEmailAddress =(String)message.get("toEmailAddress");
        
        MailMessage mailMessage=new MailMessage();
        mailMessage.setBody(mailBody);
        mailMessage.setSubject(mailSubject);
        mailMessage.setFrom(new InternetAddress(fromEmailAddress));
        mailMessage.setTo(new InternetAddress(toEmailAddress));
        
        MailServiceUtil.sendEmail(mailMessage);
        System.out.println("Email sent to :" + toEmailAddress);
    }
    
}

package XDPJFLOTA.Flota;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailMessagePreparer2 {

public static MimeMessage prepareTextMessage(String recipient,String recipientdw1, String recipientdw2, 
		String recipientdw3,String subject, String content) throws MessagingException {
	
	MimeMessage textMessage = prepareMessageObject(recipient,recipientdw1,recipientdw2,recipientdw1, subject);
	
	textMessage.setText(content);
	
	return textMessage;
		
}
		
private static MimeMessage prepareMessageObject(String recipient,String recipientdw1, String recipientdw2, 
		String recipientdw3,String subject) throws MessagingException{
		
	Properties properties = MailConfiguration.getConfiguration();
	
	MailAuthenticator authenticator = new MailAuthenticator();
	
	Session session = Session.getInstance(properties, authenticator);
	
	MimeMessage mimeMessage = new MimeMessage(session);
	
	mimeMessage.setSubject(subject, "UTF-8");
	
	PasswordAuthentication passwordAuthentication = authenticator.getPasswordAuthentication();
	
	mimeMessage.setFrom(passwordAuthentication.getUserName());
	
	mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
	mimeMessage.setRecipient(Message.RecipientType.CC, new InternetAddress(recipientdw1));
	mimeMessage.setRecipient(Message.RecipientType.CC, new InternetAddress(recipientdw1));
	mimeMessage.setRecipient(Message.RecipientType.CC, new InternetAddress(recipientdw1));
	
				
	return mimeMessage;
		
		
	}



}

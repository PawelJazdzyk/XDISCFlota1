package XDPJFLOTA.Flota;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthenticator extends Authenticator{

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
			
		//return new PasswordAuthentication("raport@x-disc.pl", "FfFXxX864");
		return new PasswordAuthentication("raport.flota@x-disc.pl", "j98r98fas98723-s2");	
	}

}

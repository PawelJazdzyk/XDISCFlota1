package XDPJFLOTA.Flota;

import java.util.Properties;

public class MailConfiguration {
	
	public static Properties getConfiguration() {
		
		Properties props = new Properties();
		
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "sp03.neologic.pl");
		props.put("mail.smtp.port", "587");
		
		return props;
		
	}

}

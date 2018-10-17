package co.com.chainpattern.logica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Utils {

	public static String MAIL_TEMPLATE = "/home/juanc/temp/mailTemplate.html";

	public static void enviarCorreoTLS(String mailTemplate, String destinatario) {
		final String username = "usdesarrollo@gmail.com";
		final String password = "julio12345";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "25");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("usdesarrollo@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destinatario));
			message.setSubject("Solicitud De Prestamo");
			message.setContent(mailTemplate, "text/html");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

	public void enviarCorreoSSL() {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("username", "password");
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("from@no-spam.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("to@no-spam.com"));
			message.setSubject("Testing Subject");
			message.setText("Dear Mail Crawler," + "\n\n No spam to my email, please!");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

	public static void enviarMail(Solicitud solicitud) throws Exception {
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(MAIL_TEMPLATE);
			br = new BufferedReader(fr);
			String sCurrentLine;
			String newMailTemplate = "";
			while ((sCurrentLine = br.readLine()) != null) {
				sCurrentLine = sCurrentLine.replace("{nombre}", solicitud.getNombreSolicitante());
				sCurrentLine = sCurrentLine.replace("{email}", solicitud.getEmailSolicitante());
				sCurrentLine = sCurrentLine.replace("{monto}", solicitud.getMonto().toPlainString());
				sCurrentLine = sCurrentLine.replace("{motivo}", solicitud.getMotivo());
				newMailTemplate += sCurrentLine;
			}

//			System.out.println(newMailTemplate);
			enviarCorreoTLS(newMailTemplate, solicitud.getMailAprobador());

		} catch (IOException e) {

			e.printStackTrace();

		}
	}

	public static void main(String[] args) {
		try {
			Solicitud solicitud = new Solicitud();
			solicitud.setNombreSolicitante("Juan");
			solicitud.setEmailSolicitante("juanc.pedrazad@konradlorenz.edu.co");
			solicitud.setMonto(new BigDecimal(350000));
			solicitud.setMotivo("Libre Inversion");
			solicitud.setMailAprobador("juanc.pedrazad@gmail.com");
			Utils.enviarMail(solicitud);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

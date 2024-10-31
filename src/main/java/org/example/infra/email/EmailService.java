package org.example.infra.email;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmailService {
  
    private final String passwordFrom = "nzzmooqbotmfrzfd";
    private String emailFrom = "chrstncarcamo@gmail.com";

    public void createEmail(String to, String subject, String body) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.user",to);
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailFrom, passwordFrom);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailFrom));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject(subject);
            message.setText(body);

            Transport.send(message);
            System.out.println("Correo enviado con éxito");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }


}


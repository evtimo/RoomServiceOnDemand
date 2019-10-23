package university.project.roomserviceondemand.services;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 22.10.2019
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;
import university.project.roomserviceondemand.utils.MailSender;

@Service
public class GMailSender implements MailSender {

    private final JavaMailSender javaMailSender;

    public GMailSender(@Qualifier("getJavaGMailSender") JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void send(String from, String to, String text, String subject) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);

        javaMailSender.send(message);

    }
}

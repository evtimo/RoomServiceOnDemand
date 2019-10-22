package university.project.roomserviceondemand.utils;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 09.10.2019
 */

/**
 * Simple mail message sender <br>
 * Source: Request status change <br>
 * Link: https://tinyurl.com/y45grrou
 * @version 1.0
 */
public interface MailSender {

    /**
     * Send mail message
     */
    void send(String from, String to, String text);

}

package university.project.roomserviceondemand.models;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 06.10.2019
 */

/**
 * Class represents a feedback <br>
 * Source: Feedback on the cleaning service <br>
 * Link: https://tinyurl.com/y5geyal2
 */
public class Feedback {

    private long id;

    private int grade;
    private String message;

    private Request request;

    public Feedback() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}

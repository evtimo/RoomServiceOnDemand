package university.project.roomserviceondemand.models;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 06.10.2019
 */

import javax.persistence.*;

/**
 * Class represents a feedback <br>
 * Source: Feedback on the cleaning service <br>
 * Link: https://tinyurl.com/y5geyal2
 */

@Entity
@Table(name = "feedbacks")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int grade;
    private String message;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "request_id", referencedColumnName = "id")
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

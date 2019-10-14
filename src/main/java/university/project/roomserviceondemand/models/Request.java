package university.project.roomserviceondemand.models;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 06.10.2019
 */

import java.util.Date;

public class Request {

    private long id;

    private Status status;
    private int room;
    private Date date;

    private User user;

    public Request() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

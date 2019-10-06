package university.project.roomserviceondemand.models;
/* Created by Kuyan Kirill
 *  Email: progingisfun@gmail.com
 *  Date: 06.10.2019
 */

public enum Status {


    NEW("New"), DONE("Done"), PROGRESS("In Progress"), CANCELED("Canceled");

    private final String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

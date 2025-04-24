package isp.lab5.exercise4;

import java.util.Date;

public abstract class RaceEvent {

    private String name;
    private Date dateOfEvent;

    public RaceEvent(String name, Date dateOfEvent) {
        this.name = name;
        this.dateOfEvent = dateOfEvent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfEvent() {
        return dateOfEvent;
    }

    public void setDateOfEvent(Date dateOfEvent) {
        this.dateOfEvent = dateOfEvent;
    }

    public abstract String display();
}

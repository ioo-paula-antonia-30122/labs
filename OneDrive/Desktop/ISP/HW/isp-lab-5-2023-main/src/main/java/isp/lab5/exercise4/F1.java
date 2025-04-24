package isp.lab5.exercise4;

import java.util.Date;

public class F1 extends RaceEvent {
    public F1(String name, Date dateOfEvent) {
        super(name, dateOfEvent);
    }

    @Override
    public String display() {
        return getName();
    }
}

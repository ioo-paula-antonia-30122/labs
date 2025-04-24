package isp.lab5.exercise4;

import java.util.Date;

public class MotoGP extends RaceEvent {
    public MotoGP(String name, Date dateOfEvent) {
        super(name, dateOfEvent);
    }

    @Override
    public String display() {
        return getName();
    }
}

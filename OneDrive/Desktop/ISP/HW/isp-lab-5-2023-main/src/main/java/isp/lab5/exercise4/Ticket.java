package isp.lab5.exercise4;

import java.util.UUID;

public class Ticket {
    private RaceEvent raceEvent;
    private String serialNumber;
    private TicketStatus status = TicketStatus.VALID;


    public Ticket(RaceEvent raceEvent) {
        this.raceEvent = raceEvent;
        this.serialNumber = UUID.randomUUID().toString();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void invalidate() {
        this.status = TicketStatus.INVALID;
    }

    public boolean isValid() {
        return status == TicketStatus.VALID;
    }

    @Override
    public String toString() {
        return "Ticket {" +
                "raceEvent=" + raceEvent.display() +
                ", serialNumber='" + serialNumber + '\'' +
                ", status=" + status +
                '}';
    }
}

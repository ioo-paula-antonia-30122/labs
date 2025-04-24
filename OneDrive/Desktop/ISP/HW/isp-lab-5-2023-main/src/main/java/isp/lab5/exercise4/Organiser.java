package isp.lab5.exercise4;

public class Organiser {
    private String organiserID;
    private RaceEvent raceEvent;

    public Organiser(String organiserID, RaceEvent raceEvent) {
        this.organiserID = organiserID;
        this.raceEvent = raceEvent;
    }

    public String getOrganiserID() {
        return organiserID;
    }

    public void setOrganiserID(String organiserID) {
        this.organiserID = organiserID;
    }

    public RaceEvent getRaceEvent() {
        return raceEvent;
    }

    public void setRaceEvent(RaceEvent raceEvent) {
        this.raceEvent = raceEvent;
    }

    @Override
    public String toString() {
        return "Organiser {" +
                "organiserID='" + organiserID + '\'' +
                ", raceEvent=" + raceEvent +
                '}';
    }
}

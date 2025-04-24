package edu.tucn.aut.isp.lab4.exercise1;

import edu.tucn.aut.isp.lab4.exercise3.FishFeeder;

import java.time.LocalTime;

public class AquariumController {
    private String manufacturer;
    private String model;
    private LocalTime currentTime;
    private LocalTime feedingTime;
    private FishFeeder feeder;

    public AquariumController(String manufacturer, String model, LocalTime currentTime) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
    }


    public AquariumController(String manufacturer, String model, LocalTime currentTime, LocalTime feedingTime) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feedingTime = feedingTime;
    }

    public AquariumController(String manufacturer, String model, LocalTime currentTime, LocalTime feedingTime, FishFeeder feeder) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feedingTime = feedingTime;
        this.feeder = feeder;
    }

    public void setCurrentTime(LocalTime currentTime) {
        this.currentTime = currentTime;
        if (currentTime.equals(feedingTime))
            feeder.feed();
    }

    public AquariumController(LocalTime feedingTime) {
        this.feedingTime = feedingTime;
    }

    @Override
    public String toString() {
        return "AquariumController {" +
                "manufacturer=' " + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                '}';
    }

    //attributs
    //constructors
    //methods
}

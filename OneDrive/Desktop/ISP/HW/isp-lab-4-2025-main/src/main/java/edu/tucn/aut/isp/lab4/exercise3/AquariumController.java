package edu.tucn.aut.isp.lab4.exercise3;

import java.time.LocalTime;

public class AquariumController {
    private String manufacturer;
    private String model;
    private LocalTime currentTime;
    private LocalTime feedingTime;
    private FishFeeder fishFeeder;

    public AquariumController(String manufacturer, String model, LocalTime currentTime, FishFeeder fishFeeder) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.fishFeeder = fishFeeder;
    }


    public void setCurrentTime(LocalTime currentTime) {
        this.currentTime = currentTime;
        if (currentTime.equals(feedingTime))
            fishFeeder.feed();
    }

    public void setFeedingTime(LocalTime feedingTime) {
        this.feedingTime = feedingTime;
    }



    @Override
    public String toString() {
        return "AquariumController {" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                ", feedingTime=" + feedingTime +
                '}';
    }
}

package edu.tucn.aut.isp.lab4.exercise4;

import java.time.Duration;
import java.time.LocalTime;

public class AquariumController {
    private String manufacturer;
    private String model;
    private LocalTime currentTime;
    private LocalTime feedingTime;
    private FishFeeder fishFeeder;
    private Lights lights;
    private LocalTime lightOnTime;
    private LocalTime lightsOffTime;


    public AquariumController(String manufacturer, String model, LocalTime currentTime, LocalTime feedingTime, FishFeeder fishFeeder, Lights lights, LocalTime lightOnTime, LocalTime lightsOffTime) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.currentTime = currentTime;
        this.feedingTime = feedingTime;
        this.fishFeeder = fishFeeder;
        this.lights = lights;
        setLightTimes(lightOnTime, lightsOffTime);
    }

    private void setLightTimes(LocalTime lightOnTime, LocalTime lightsOffTime) {
        long duration = Duration.between(lightOnTime, lightsOffTime).toHours();
        if (duration < 6 || duration > 8) {
            throw new IllegalArgumentException("Between 6 and 8 hours!");
        }
        this.lightOnTime = lightOnTime;
        this.lightsOffTime = lightsOffTime;
    }


    public void setFeedingTime(LocalTime feedingTime) {
        this.feedingTime = feedingTime;
    }


    public void setCurrentTime(LocalTime currentTime) {
        this.currentTime = currentTime;
        if (currentTime.equals(feedingTime))
            fishFeeder.feed();
        if (currentTime.equals(lightOnTime))
            lights.turnOn();
        else {
            if (currentTime.equals(lightsOffTime))
                lights.turnOff();
        }
    }

    public LocalTime getLightOnTime() {
        return lightOnTime;
    }

    public LocalTime getLightsOffTime() {
        return lightsOffTime;
    }


    public Lights getLights() {
        return lights;
    }

    @Override
    public String toString() {
        return "AquariumController {" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", currentTime=" + currentTime +
                ", feedingTime=" + feedingTime +
                ", fishFeeder=" + fishFeeder +
                ", lights=" + lights +
                ", lightOnTime=" + lightOnTime +
                ", lightsOffTime=" + lightsOffTime +
                '}';
    }
}

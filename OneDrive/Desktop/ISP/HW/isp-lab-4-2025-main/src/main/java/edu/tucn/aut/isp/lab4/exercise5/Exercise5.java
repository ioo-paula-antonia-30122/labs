package edu.tucn.aut.isp.lab4.exercise5;

import java.time.LocalTime;

public class Exercise5 {
    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor("Temperature", "1000", 23);
        LevelSensor levelSensor = new LevelSensor("Level", "1000", 500);
        FishFeeder fishFeeder = new FishFeeder("Fish Feeder", "1000", 13);
        Lights lights = new Lights();
        Actuator alarm = new Alarm("Alarm", "1000");
        Actuator heater = new Heater("Heater", "1000");
        AquariumController aquariumController = new AquariumController("Neptune", "Apex Jr", LocalTime.of(13, 30), LocalTime.of(13, 30), fishFeeder, lights, LocalTime.of(11, 00), LocalTime.of(18, 00));

        aquariumController.setTemperatureSensor(temperatureSensor);
        aquariumController.setAlarm(alarm);
        aquariumController.setHeater(heater);
        aquariumController.setLevelSensor(levelSensor);

        aquariumController.setPresetTemperature(25);
        aquariumController.checkTemperature();

        aquariumController.setPresetLevel(700);
        aquariumController.checkWaterLevel();

        aquariumController.setPresetLevel(500);
        aquariumController.checkWaterLevel();

        aquariumController.setPresetTemperature(23);
        aquariumController.checkTemperature();



    }
}

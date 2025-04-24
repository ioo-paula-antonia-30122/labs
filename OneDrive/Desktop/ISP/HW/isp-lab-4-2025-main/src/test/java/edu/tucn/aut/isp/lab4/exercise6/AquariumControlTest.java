package edu.tucn.aut.isp.lab4.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class AquariumControlTest {

    @Test
    public void testCheckpH() {
        TemperatureSensor temperatureSensor = new TemperatureSensor("Temperature", "1000", 23);
        LevelSensor levelSensor = new LevelSensor("Level", "1000", 500);
        FishFeeder fishFeeder = new FishFeeder("Fish Feeder", "1000", 13);
        Lights lights = new Lights();
        Actuator alarm = new Alarm("Alarm", "1000");
        Actuator heater = new Heater("Heater", "1000");
        pHControl pHControl=new pHControl();
        AquariumController aquariumController = new AquariumController("Neptune", "Apex Jr", LocalTime.of(13, 30), LocalTime.of(13, 30), fishFeeder, lights, LocalTime.of(11, 00), LocalTime.of(18, 00));


        aquariumController.setTemperatureSensor(temperatureSensor);
        aquariumController.setAlarm(alarm);
        aquariumController.setHeater(heater);
        aquariumController.setLevelSensor(levelSensor);
        aquariumController.setpHControl(pHControl);

        pHControl.setValue(7.4);
        aquariumController.monitorpH();
        Assertions.assertTrue(pHControl.isBetween());

        pHControl.setValue(6.5);
        aquariumController.monitorpH();
        Assertions.assertTrue(pHControl.checkpHMin());

        pHControl.setValue(8.2);
        aquariumController.monitorpH();
        Assertions.assertFalse(pHControl.checkpHMax());

    }
}

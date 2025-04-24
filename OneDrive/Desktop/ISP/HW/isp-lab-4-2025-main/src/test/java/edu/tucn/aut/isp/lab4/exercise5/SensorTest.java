package edu.tucn.aut.isp.lab4.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SensorTest {

    @Test
    public void testSensor() {
        Sensor sensor = new Sensor("Sensor", "1000");
        Assertions.assertEquals("Sensor {manufacturer='Sensor', model='1000'}",sensor.toString());

    }
}

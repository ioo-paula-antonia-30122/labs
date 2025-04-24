package edu.tucn.aut.isp.lab4.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TemperatureSensorTest {

    @Test
    public void testTemperatureSensor(){
        TemperatureSensor temperatureSensor = new TemperatureSensor("Temperature", "1000", 23);
        Assertions.assertEquals(23,temperatureSensor.getValue());

        temperatureSensor.setValue(25);
        Assertions.assertEquals(25,temperatureSensor.getValue());
    }

}

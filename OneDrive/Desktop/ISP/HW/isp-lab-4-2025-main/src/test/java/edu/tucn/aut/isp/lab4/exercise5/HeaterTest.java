package edu.tucn.aut.isp.lab4.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeaterTest {

    @Test
    public void testHeater() {
        Heater heater = new Heater("Heater", "1000");
        Assertions.assertFalse(heater.isOn());

        heater.turnOn();
        Assertions.assertTrue(heater.isOn());

        heater.turnOff();
        Assertions.assertFalse(heater.isOn());

    }
}

package edu.tucn.aut.isp.lab4.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActuatorTest {

    @Test
    public void testActuator() {
        Actuator actuator=new Actuator("Actuator", "1000");
        Assertions.assertFalse(actuator.isOn());

        actuator.turnOn();
        Assertions.assertTrue(actuator.isOn());

        actuator.turnOff();
        Assertions.assertFalse(actuator.isOn());

    }
}

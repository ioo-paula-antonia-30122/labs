package edu.tucn.aut.isp.lab4.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LightsTest {

    @Test
    public void testLights(){
        Lights lights=new Lights();
        Assertions.assertFalse(lights.isOn());

        lights.turnOn();
        Assertions.assertTrue(lights.isOn());

        lights.turnOff();
        Assertions.assertFalse(lights.isOn());

    }
}

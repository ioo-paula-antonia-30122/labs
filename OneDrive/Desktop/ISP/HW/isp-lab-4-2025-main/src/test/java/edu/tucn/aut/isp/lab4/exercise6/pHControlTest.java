package edu.tucn.aut.isp.lab4.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class pHControlTest {

    @Test
    public void testCheckpHMin() {
        pHControl pHControl = new pHControl();
        pHControl.setValue(6.5);
        Assertions.assertTrue(pHControl.checkpHMin());
        pHControl.setValue(6.1);
        Assertions.assertFalse(pHControl.checkpHMin());
    }

    @Test
    public void testCheckpHMax() {
        pHControl pHControl = new pHControl();
        pHControl.setValue(8.1);
        Assertions.assertTrue(pHControl.checkpHMax());
        pHControl.setValue(8.2);
        Assertions.assertFalse(pHControl.checkpHMax());
    }

    @Test
    public void testIsBetween(){
        pHControl pHControl = new pHControl();
        pHControl.setValue(7.4);
        Assertions.assertTrue(pHControl.isBetween());
        pHControl.setValue(8.4);
        Assertions.assertFalse(pHControl.isBetween());

    }
}

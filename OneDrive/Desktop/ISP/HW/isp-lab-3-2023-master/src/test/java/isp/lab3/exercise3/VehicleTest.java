package isp.lab3.exercise3;

import org.junit.Assert;
import org.junit.Test;

public class VehicleTest {

    @Test
    public void testToString() {
        Vehicle vehicle = new Vehicle("Dacia", "Logan", 150, 'B');
        Assert.assertEquals("Dacia (Logan) speed 150 fuel type B", vehicle.toString());

        Vehicle vehicle1 = new Vehicle("Opel", "Corsa", 200, 'B');
        Assert.assertEquals("Opel (Corsa) speed 200 fuel type B", vehicle1.toString());

    }
}


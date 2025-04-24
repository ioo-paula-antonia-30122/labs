package isp.lab5.exercise2;

import org.junit.Assert;
import org.junit.Test;

public class Exercise2Test {

    @Test
    public void testCharge() {
        Chargeable laptop = new Laptop(20);
        laptop.charge(20);
        Assert.assertEquals(30, laptop.getBatteryLevel());

        laptop.setBatteryLevel(30);
        laptop.charge(140);
        Assert.assertEquals(100, laptop.getBatteryLevel());

        laptop.setBatteryLevel(500);
        Assert.assertEquals(100, laptop.getBatteryLevel());

        Chargeable smartPhone = new SmartPhone(700);
        smartPhone.charge(20);
        Assert.assertEquals(100, smartPhone.getBatteryLevel());

        Chargeable smartWatch = new SmartWatch(-3);
        smartWatch.charge(5);
        Assert.assertEquals(7, smartWatch.getBatteryLevel());
    }
}

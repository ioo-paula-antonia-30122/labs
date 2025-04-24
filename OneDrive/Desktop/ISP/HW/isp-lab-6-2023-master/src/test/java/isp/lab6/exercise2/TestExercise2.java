package isp.lab6.exercise2;

import org.junit.Assert;
import org.junit.Test;

public class TestExercise2 {

    @Test
    public void testAddVehicle(){
        VehicleRegistry vehicleRegistry = new VehicleRegistry();

        Vehicle vehicle=new Vehicle("1GCEK19T04E185534","MS09FPR","Dacia","Logan",2007);
        Vehicle vehicle1=new Vehicle("2C3CDXBGXEH228745","MS10JPA","Opel","Corsa",2013);

        vehicleRegistry.addVehicle(vehicle);
        vehicleRegistry.addVehicle(vehicle1);

        Assert.assertEquals(2,vehicleRegistry.size());
    }

    @Test
    public void testRemoveVehicle(){
        VehicleRegistry vehicleRegistry = new VehicleRegistry();

        Vehicle vehicle=new Vehicle("1GCEK19T04E185534","MS09FPR","Dacia","Logan",2007);
        Vehicle vehicle1=new Vehicle("2C3CDXBGXEH228745","MS10JPA","Opel","Corsa",2013);

        vehicleRegistry.addVehicle(vehicle);
        vehicleRegistry.addVehicle(vehicle1);

        Assert.assertEquals(2,vehicleRegistry.size());

        vehicleRegistry.removeVehicle("2C3CDXBGXEH228745");

        Assert.assertEquals(1,vehicleRegistry.size());
    }

    @Test
    public void testCheckVehicle(){
        VehicleRegistry vehicleRegistry = new VehicleRegistry();

        Vehicle vehicle=new Vehicle("1GCEK19T04E185534","MS09FPR","Dacia","Logan",2007);
        Vehicle vehicle1=new Vehicle("2C3CDXBGXEH228745","MS10JPA","Opel","Corsa",2013);

        vehicleRegistry.addVehicle(vehicle);
        vehicleRegistry.addVehicle(vehicle1);

        Assert.assertTrue(vehicleRegistry.checkVehicle("2C3CDXBGXEH228745"));
        Assert.assertFalse(vehicleRegistry.checkVehicle("JA4AS2AW0DU025454"));
    }
}

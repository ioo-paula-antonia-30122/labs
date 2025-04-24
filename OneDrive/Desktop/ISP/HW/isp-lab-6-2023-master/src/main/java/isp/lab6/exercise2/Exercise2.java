package isp.lab6.exercise2;

import java.util.HashSet;
import java.util.Set;

public class Exercise2 {
    public static void main(String[] args) {
        VehicleRegistry vehicleRegistry=new VehicleRegistry();

        Vehicle vehicle=new Vehicle("1GCEK19T04E185534","MS09FPR","Dacia","Logan",2007);
        Vehicle vehicle1=new Vehicle("2C3CDXBGXEH228745","MS10JPA","Opel","Corsa",2013);

        vehicleRegistry.addVehicle(vehicle);
        vehicleRegistry.addVehicle(vehicle1);

        System.out.println("Vehicles registered:");
        vehicleRegistry.displayVehicles();

        vehicleRegistry.removeVehicle("2C3CDXBGXEH228745");
        System.out.println("Vehicles registered after attempted remove:");
        vehicleRegistry.displayVehicles();

        vehicleRegistry.checkVehicle("2C3CDXBGXEH228745");

    }
}

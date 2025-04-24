package isp.lab6.exercise2;

import java.util.HashSet;
import java.util.Set;

public class VehicleRegistry {
    private Set<Vehicle> vehicles;

    public VehicleRegistry() {
        this.vehicles = new HashSet<>();
    }

    public void displayVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("Seems that there aren't any vehicles registered! ");
        } else {
            for (Vehicle vehicle : vehicles)
                System.out.println(vehicle);
        }
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicles.add(vehicle)) {
            System.out.println("Vehicle " + vehicle.getLicensePlate() + " was added! ");
        } else {
            System.out.println("Ups! You introduced a Vehicle that has its VIN as another Vehicle! Not possible! ");
        }
    }

    public void removeVehicle(String VIN) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVIN().equals(VIN)) {
                vehicles.remove(vehicle);
                System.out.println("Vehicle was removed! ");
                return;
            }
        }
        System.out.println("No matches for VIN! It seems the Vehicle wasn't registered before! ");
    }

    public boolean checkVehicle(String VIN) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVIN().equals(VIN)) {
                System.out.println("Vehicle exists in registry!");
                return true;
            }
        }
        System.out.println("Vehicle doesn't exist in our registry!");
        return false;
    }

    public int size(){
        return vehicles.size();
    }
}

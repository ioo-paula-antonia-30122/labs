package isp.lab3.exercise3;

public class Exercise3 {
    public static void main(String[] arg) {
        Vehicle vehicle = new Vehicle("Dacia","Logan",100,'D');
        vehicle.setModel("Dacia");
        vehicle.setType("Logan");
        vehicle.setSpeed(150);
        vehicle.setFuelType('B');
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Type: " + vehicle.getType());
        System.out.println("Speed: " + vehicle.getSpeed());
        System.out.println("Fuel type: " + vehicle.getFuelType());
        System.out.println(vehicle.toString()+ "\n");

        Vehicle vehicle1 = new Vehicle("Opel", "Corsa", 180, 'B');
        vehicle1.setModel("Opel");
        vehicle1.setType("Corsa");
        vehicle1.setSpeed(200);
        vehicle1.setFuelType('B');
        System.out.println("Model: " + vehicle1.getModel());
        System.out.println("Type: " + vehicle1.getType());
        System.out.println("Speed: " + vehicle1.getSpeed());
        System.out.println("Fuel type: " + vehicle1.getFuelType());
        System.out.println(vehicle1.toString() +"\n");

        System.out.println("Vehicle 1 and vehicle 2 are equal: " + vehicle.equals(vehicle1));
        Vehicle.displayNumberOfVehicles();

        /*Vehicle vehicle2 = new Vehicle("Audi", "A4", -180, 'D');
        System.out.println(vehicle2.toString() +"\n"); will throw an exception*/


    }

}

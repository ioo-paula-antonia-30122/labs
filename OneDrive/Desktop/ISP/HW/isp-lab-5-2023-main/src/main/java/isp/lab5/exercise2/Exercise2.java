package isp.lab5.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Chargeable laptop = new Laptop(20);
        System.out.println(laptop.getBatteryLevel());
        laptop.charge(20);
        System.out.println(laptop.getBatteryLevel());
        laptop.charge(500);
        System.out.println(laptop.getBatteryLevel());
        laptop.setBatteryLevel(150);
        System.out.println(laptop.getBatteryLevel());

        Chargeable smartPhone=new SmartPhone(25);
        System.out.println(smartPhone.getBatteryLevel());
        smartPhone.charge(20);
        System.out.println(smartPhone.getBatteryLevel());
        smartPhone.charge(60);
        System.out.println(smartPhone.getBatteryLevel());
        smartPhone.setBatteryLevel(200);
        System.out.println(smartPhone.getBatteryLevel());

        Chargeable smartWatch=new SmartWatch(20);
        System.out.println(smartWatch.getBatteryLevel());
        smartWatch.charge(25);
        System.out.println(smartWatch.getBatteryLevel());
        smartWatch.charge(40);
        System.out.println(smartWatch.getBatteryLevel());
        smartWatch.setBatteryLevel(-5);
        System.out.println(smartWatch.getBatteryLevel());

    }
}

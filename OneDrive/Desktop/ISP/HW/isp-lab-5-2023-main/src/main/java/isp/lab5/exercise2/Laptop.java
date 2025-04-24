package isp.lab5.exercise2;

public class Laptop implements Chargeable {
    private int batteryLevel;

    public Laptop(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel > 100) {
            System.out.println("Maximum battery level is 100! ");
            this.batteryLevel = 100;
        } else if (batteryLevel < 0) {
            System.out.println("Battery can't pe negative! ");
            this.batteryLevel = 1;
        } else this.batteryLevel = batteryLevel;
    }

    @Override
    public void charge(int durationInMinutes) {
        int charged = (int)((durationInMinutes / 10) * 5);
        batteryLevel = Math.min(100, batteryLevel + charged);
        if (batteryLevel == 100)
            System.out.println("Laptop is fully charged! ");
        else
            System.out.println("Laptop still needs to charge... You have " + batteryLevel + "%");
    }
}
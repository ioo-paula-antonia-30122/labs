package isp.lab5.exercise2;

public class SmartPhone implements Chargeable {

    private int batteryLevel;

    public SmartPhone(int batteryLevel) {
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
        int charged = (int)((durationInMinutes / 10) * 7);
        batteryLevel = Math.min(100, batteryLevel + charged);
        if (batteryLevel == 100)
            System.out.println("Smartphone is fully charged! ");
        else
            System.out.println("SmartPhone still needs to charge... You have " + batteryLevel + "%");
    }
}

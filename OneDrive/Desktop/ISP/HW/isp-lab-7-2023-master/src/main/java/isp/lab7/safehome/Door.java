package isp.lab7.safehome;

public class Door {
    private DoorStatus status;

    public Door(DoorStatus status) {
        this.status = status;
    }

    public DoorStatus getStatus() {
        return status;
    }

    public void setStatus(DoorStatus status) {
        this.status = status;
    }

    public void lockDoor() {
        if (this.status != DoorStatus.CLOSE)
            this.status = DoorStatus.CLOSE;
        System.out.println("Door is LOCKED!");
    }

    public void unlockDoor() {
        if (this.status != DoorStatus.OPEN)
            this.status = DoorStatus.OPEN;
        System.out.println("Door is UNLOCKED!");
    }
}

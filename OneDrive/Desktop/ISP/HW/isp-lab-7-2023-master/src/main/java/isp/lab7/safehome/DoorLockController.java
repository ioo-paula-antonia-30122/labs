package isp.lab7.safehome;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class DoorLockController implements ControllerInterface {
    private Map<Tenant, AccessKey> validAccess;
    private List<AccessLog> logs;
    private Door door;
    private int attempts;

    public DoorLockController(Map<Tenant, AccessKey> validAccess, List<AccessLog> logs, Door door) {
        this.validAccess = validAccess;
        this.logs = logs;
        this.door = door;
        this.attempts = 0;
    }

    @Override
    public DoorStatus enterPin(String pin) throws InvalidPinException, TooManyAttemptsException {
        if (pin.equals(MASTER_KEY)) {
            attempts = 0;
            if (door.getStatus() == DoorStatus.OPEN) {
                door.lockDoor();
                System.out.println("Door CLOSED using MASTER KEY!");
            } else {
                door.unlockDoor();
                System.out.println("Door OPENED using MASTER KEY!");
                ;
            }
            logs.add(new AccessLog(MASTER_TENANT_NAME, LocalDateTime.now(), "[MASTER_KEY]", door.getStatus(), null));
            return door.getStatus();
        }

        if (attempts >= 3) {
            logs.add(new AccessLog("Tenant", LocalDateTime.now(), "[PIN]", door.getStatus(), "Failed Attempt"));
            throw new TooManyAttemptsException("Too many incorrect PIN attempts!");
        }

        Tenant tenant = null;
        for (Map.Entry<Tenant, AccessKey> entry : validAccess.entrySet()) {
            if (entry.getValue().getPin().equals(pin)) {
                tenant = entry.getKey();
                break;
            }
        }

        if (tenant != null) {
            attempts = 0;
            if (door.getStatus() == DoorStatus.OPEN) {
                door.lockDoor();
            } else {
                door.unlockDoor();
            }
            logs.add(new AccessLog(tenant.getName(), LocalDateTime.now(), "[PIN]", door.getStatus(), null));
            return door.getStatus();
        } else {
            attempts++;
            logs.add(new AccessLog("Tenant", LocalDateTime.now(), "[PIN]", door.getStatus(), "Wrong PIN"));

            if (attempts >= 3) {
                logs.add(new AccessLog("Tenant", LocalDateTime.now(), "[PIN]", door.getStatus(), "Too many failed attempts"));
                throw new TooManyAttemptsException("Too many incorrect PIN attempts!");
            } else {
                throw new InvalidPinException("INVALID PIN");
            }
        }
    }


    @Override
    public void addTenant(String pin, String tenantName) throws TenantAlreadyExistsException {
        for (Tenant tenant : validAccess.keySet()) {
            if (tenant.getName().equals(tenantName)) {
                throw new TenantAlreadyExistsException("We already have in our system this tenant!");
            }
        }

        Tenant newTenant = new Tenant(tenantName);
        AccessKey accessKey = new AccessKey(pin);
        validAccess.put(newTenant, accessKey);
        logs.add(new AccessLog(newTenant.getName(), LocalDateTime.now(), "[ADD_TENANT]", door.getStatus(), null));

    }

    @Override
    public void removeTenant(String name) throws TenantNotFoundException {
        Tenant removed = null;
        for (Tenant tenant : validAccess.keySet()) {
            if (tenant.getName().equals(name)) {
                removed = tenant;
                break;
            }
        }

        if (removed == null) {
            throw new TenantNotFoundException("Couldn't find the tenant!");
        }

        validAccess.remove(removed);
        logs.add(new AccessLog(name, LocalDateTime.now(), "[REMOVE_TENANT]", door.getStatus(), null));
    }

    public List<AccessLog> getLogs() {
        return logs;
    }
}

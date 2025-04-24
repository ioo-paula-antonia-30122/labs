package isp.lab7.safehome;

import java.util.*;

public class SafeHome {

    public static void main(String[] args) {
        Map<Tenant, AccessKey> validAccess = new HashMap<>();
        List<AccessLog> logs = new ArrayList<>();
        Door door = new Door(DoorStatus.CLOSE);
        DoorLockController doorLockController = new DoorLockController(validAccess, logs, door);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose your role: ");
            System.out.println("1. Admin");
            System.out.println("2. Tenant");
            System.out.println("3. End SafeHome Program");

            String user = scanner.nextLine();

            switch (user) {
                case "1":
                    System.out.println("Operations available as an ADMIN:");
                    System.out.println("1. Add Tenant");
                    System.out.println("2. Remove Tenant");
                    System.out.println("3. Logs");
                    System.out.println("4. Exit");
                    System.out.println("Please enter your choice (NUMBER)!");
                    String choice = scanner.nextLine();

                    switch (choice) {
                        case "1":
                            System.out.println("Enter name for your tenant:");
                            String name = scanner.nextLine();
                            System.out.println("Enter PIN for it:");
                            String PIN = scanner.nextLine();

                            try {
                                doorLockController.addTenant(PIN,name);
                                System.out.println("Name: " + name + ", PIN: " + PIN);
                            } catch (TenantAlreadyExistsException e) {
                                System.out.println(e.getMessage());
                            }
                            break;

                        case "2":
                            System.out.println("Who do you want to remove? ");
                            String remove = scanner.nextLine();
                            try {
                                doorLockController.removeTenant(remove);
                                System.out.println("Successfully removed the tenant!");
                            } catch (TenantNotFoundException e) {
                                System.out.println(e.getMessage());
                            }
                            break;


                        case "3":
                            List<AccessLog> logs1 = doorLockController.getLogs();
                            if (logs1.isEmpty()) {
                                System.out.println("No logs available yet!");
                            } else {
                                for (AccessLog log : logs1) {
                                    System.out.println(log.toString());
                                }
                            }
                            break;

                        case "4":
                            break;
                        default:
                            System.out.println("INVALID! Please choose from the available menu for ADMIN! ");
                            break;
                    }

                case "2":
                    System.out.println("Operations available as an TENANT:");
                    System.out.println("1. Enter PIN");
                    System.out.println("2. Exit");
                    System.out.println("Please enter your choice (NUMBER)!");
                    String choice1 = scanner.nextLine();

                    switch (choice1) {
                        case "1":
                            System.out.println("Enter PIN:");
                            String enterPIN = scanner.nextLine();
                            try {
                                DoorStatus status = doorLockController.enterPin(enterPIN);
                                System.out.println("Status: " + status);
                            } catch (InvalidPinException e) {
                                System.out.println(e.getMessage());
                            } catch (TooManyAttemptsException ex) {
                                System.out.println(ex.getMessage());
                            }
                            break;
                        case "2":
                            break;
                        default:
                            System.out.println("INVALID! Please choose from the available menu for TENANT! ");
                            break;
                    }
                    break;
                case "3":
                    System.out.println("Exiting program! Bye-bye!");
                    return;
                default:
                    System.out.println("INVALID! Please choose from the available menu! ");
                    break;
            }
        }
    }
}

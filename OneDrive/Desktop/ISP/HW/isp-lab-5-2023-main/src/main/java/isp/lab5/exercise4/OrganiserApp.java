package isp.lab5.exercise4;

import java.util.*;

public class OrganiserApp {
    private TicketsManager ticketsManager;
    private List<Organiser> organisers;
    private UserApp userApp;

    public OrganiserApp(TicketsManager ticketsManager, List<Organiser> organisers, UserApp userApp) {
        this.ticketsManager = ticketsManager;
        this.organisers = organisers;
        this.userApp = userApp;
    }

    public void checkIn(String serial) {
        ticketsManager.validateTicket(serial);
    }

    public void scanTicket(String username) {
        for (User user : userApp.getUsers()) {
            if (user.getUsername().equals(username)) {
                List<Ticket> tickets = user.getTickets();
                if (tickets.isEmpty()) {
                    System.out.println(user.getUsername() + " hasn't bought any tickets yet! ");
                    return;
                }
                System.out.println("Scanning " + user.getUsername() + "'s tickets:");
                for (Ticket ticket : tickets) {
                    System.out.println("Serial:" + ticket.getSerialNumber() + "\nStatus= " + ticket.getStatus());
                }
                return;
            }
        }
        System.out.println("Couldn't find the user!");
    }


    public void addOrganiser(Organiser organiser) {
        organisers.add(organiser);
    }

    public void displayOrganiser() {
        for (Organiser organiser : organisers) {
            System.out.println(organiser);
        }
    }

}

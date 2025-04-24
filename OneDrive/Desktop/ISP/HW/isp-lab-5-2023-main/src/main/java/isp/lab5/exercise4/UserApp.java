package isp.lab5.exercise4;

import java.util.*;

public class UserApp {
    private List<User> users;
    private TicketsManager ticketsManager;

    public UserApp(List<User> users, TicketsManager ticketsManager) {
        this.users = users;
        this.ticketsManager = ticketsManager;
    }

    public void buyTicket(String username, RaceEvent race) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                Ticket ticket = ticketsManager.generateTicket(race);
                if (ticket != null) {
                    user.addTicket(ticket);
                    ticketsManager.getPaymentGateway().payment();
                    System.out.println("Yuppy! You bought your ticket! ");
                }
                return;
            }
        }
        System.out.println("You have to buy a ticket for an valid user!");
    }

    public void viewTicket(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                if (user.getTickets().isEmpty()) {
                    System.out.println(user.getUsername() + " doesn't have tickets!");
                    return;
                } else {
                    System.out.println("Tickets for " + user.getUsername() + " :");
                    for (Ticket ticket : user.getTickets()) {
                        System.out.println(ticket);
                    }
                }
                return;
            }
        }
        System.out.println("Couldn't find the user!");
    }

    public void displayUsers() {
        System.out.println("Users: ");
        for (User user : users) {
            System.out.println(user.getUsername());
        }
    }

    public List<User> getUsers() {
        return users;
    }
}

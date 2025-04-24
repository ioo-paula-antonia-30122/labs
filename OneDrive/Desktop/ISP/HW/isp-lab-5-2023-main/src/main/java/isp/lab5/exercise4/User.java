package isp.lab5.exercise4;

import java.util.*;

public class User {
    private String username;
    private List<Ticket> tickets;

    public User(String username) {
        this.username = username;
        this.tickets = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public Ticket getTicketSerial(String serial) {
        for (Ticket ticket : tickets) {
            if (ticket.getSerialNumber().equals(serial)) {
                return ticket;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "User {" +
                "username='" + username + '\'' +
                ", tickets=" + tickets +
                '}';
    }
}

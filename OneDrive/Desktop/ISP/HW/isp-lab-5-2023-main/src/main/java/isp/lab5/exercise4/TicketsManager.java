package isp.lab5.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TicketsManager {
    private List<Ticket> tickets;
    private PaymentGateway paymentGateway;

    public TicketsManager(PaymentGateway paymentGateway) {
        this.tickets = new ArrayList<>();
        this.paymentGateway = paymentGateway;
    }

    public PaymentGateway getPaymentGateway() {
        return paymentGateway;
    }

    public Ticket generateTicket(RaceEvent race) {
        if (tickets.size() > 50) {
            System.out.println("Maximum 50 tickets! ");
            return null;
        }
        Ticket ticket = new Ticket(race);
        tickets.add(ticket);
        return ticket;
    }

    public void validateTicket(String serial) {
        for (Ticket ticket : tickets) {
            if (ticket.getSerialNumber().equals(serial)) {
                if (ticket.isValid()) {
                    System.out.println("Ticket is now validated! Enjoy your race!");
                    ticket.invalidate();
                } else {
                    System.out.println("Your ticket is invalid!");
                }
                return;
            }
        }
        System.out.println("Please buy a ticket first!");
    }

}

package isp.lab5.exercise4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        User user = new User("Paula#123");
        User user1 = new User("D@ria456");

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user1);

        PaymentGateway paymentGateway = new PaymentGateway(200);
        TicketsManager ticketsManager = new TicketsManager(paymentGateway);

        UserApp userApp = new UserApp(users, ticketsManager);

        RaceEvent F1Bahrain = new F1("Bahrain", new Date());
        RaceEvent MotoGPQatar = new MotoGP("Qatar", new Date());

        Organiser organiser = new Organiser("FIA", F1Bahrain);
        Organiser organiser1 = new Organiser("FIM", MotoGPQatar);

        List<Organiser> organisers = new ArrayList<>();
        organisers.add(organiser);
        organisers.add(organiser1);

        OrganiserApp organiserApp = new OrganiserApp(ticketsManager, organisers, userApp);

        userApp.buyTicket("Paula#123", F1Bahrain);
        userApp.viewTicket("Paula#123");

        organiserApp.scanTicket("Paula#123");

        organiserApp.checkIn(user.getTickets().get(0).getSerialNumber());

        organiserApp.checkIn(user.getTickets().get(0).getSerialNumber());

        userApp.displayUsers();
        userApp.viewTicket("D@ria456");
        userApp.viewTicket("Paula#123");

        userApp.buyTicket("Paula#123", MotoGPQatar);
        organiserApp.scanTicket("Paula#123");

        userApp.viewTicket("Paula#123");

        organiserApp.scanTicket("Maria263");

        userApp.buyTicket("Maria567",F1Bahrain);
    }
}

package isp.lab5.exercise4;

public class PaymentGateway {
    private int amount;

    public PaymentGateway(int amount) {
        this.amount = amount;
    }

    public void payment() {
        System.out.println("You have paid " + amount + " EUR for the ticket!");
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

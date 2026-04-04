package main.com.watkins.behavioral.state;

public class InTransit implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Order is in transit. Contact courier to cancel.");
        System.out.println("Contacting payment gateway to rollback transaction.");
        return 20;
    }
}

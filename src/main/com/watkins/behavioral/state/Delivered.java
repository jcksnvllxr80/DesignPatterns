package main.com.watkins.behavioral.state;

public class Delivered implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Order is delivered. Contacting courier service for item pickup.");
        System.out.println("Payment rollback will be initiated upon receiving return package.");
        return 30;
    }
}

package main.com.watkins.behavioral.state;

public class Paid implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Order is paid. Contact payment gateway to rollback transaction.");
        return 10;
    }
}

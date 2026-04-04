package main.com.watkins.behavioral.state;

public class New implements OrderState {

    @Override
    public double handleCancellation() {
        System.out.println("Order is new. No processing done.");
        return 0;
    }
}

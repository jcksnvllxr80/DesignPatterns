package main.com.watkins.behavioral.state;

public class Client {
    public static void main(String[] args) {
        Order order = new Order();  // create a new order
        order.paymentSuccessful();  // simulate payment
        order.dispatched();  // simulate dispatch
        order.delivered();  // simulate delivery
        order.cancel();  // simulate cancellation

        // cancelling an already canceled order just to test the exception handling
        try {
            order.cancel();
        } catch (IllegalStateException e) {
            System.out.println("Cannot cancel an already cancelled order.");
        }
    }
}

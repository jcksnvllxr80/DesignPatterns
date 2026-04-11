package main.com.watkins.behavioral.strategy;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class DetailPrinter implements OrderPrinter {

    @Override
    public void print(Collection<Order> orders) {
        System.out.println("******************** Detail Report ********************");
        Iterator<Order> it = orders.iterator();
        double total = 0;
        for (int i = 1; it.hasNext(); i++) {
            double orderTotal = 0;
            Order order = it.next();
            System.out.println(i + ". " + order.getId() + "\t" + order.getDate());
            for (Map.Entry<String, Double> entry : order.getItems().entrySet()) {
                System.out.println("\t" + entry.getKey() + "\t" + entry.getValue());
                orderTotal += entry.getValue();
            }
            System.out.println("****************************************");
            System.out.println("\t\tTotal: $" + orderTotal);
            System.out.println("****************************************");
            total += orderTotal;
        }
        System.out.println("****************************************");
        System.out.println("Grand Total: $" + total);
    }
}

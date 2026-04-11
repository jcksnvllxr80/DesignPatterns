package main.com.watkins.behavioral.strategy;

import java.util.Collection;
import java.util.Iterator;

public class SummaryPrinter implements OrderPrinter {

    @Override
    public void print(Collection<Order> orders) {
        System.out.println("******************** Summary Report ********************");
        Iterator<Order> it = orders.iterator();
        double total = 0.0;

        for(int i = 1; it.hasNext(); i++) {
            Order order = it.next();
            System.out.println(i + ". " + order.getId() + "\t" + order.getDate() + "\t" + order.getItems().size() + "\t" + order.getTotal());
            total += order.getTotal();
        }

        System.out.println("****************************************");
        System.out.println("\t\t\tTotal: " + total);
    }
}

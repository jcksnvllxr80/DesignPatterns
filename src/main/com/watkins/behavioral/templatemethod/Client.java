package main.com.watkins.behavioral.templatemethod;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException {
        Order order1 = new Order("1001");
        order1.addItem("Apple", 1.50);
        order1.addItem("Banana", 0.75);
        order1.addItem("Orange", 1.25);

        OrderPrinter printer1 = new TextPrinter();
        printer1.printOrder(order1, "1001.txt");

        Order order2 = new Order("1002");
        order2.addItem("Apple", 1.50);
        order2.addItem("Banana", 0.75);
        order2.addItem("Grapes", 2.00);

        OrderPrinter printer2 = new HtmlPrinter();
        printer2.printOrder(order2, "1002.html");
    }
}

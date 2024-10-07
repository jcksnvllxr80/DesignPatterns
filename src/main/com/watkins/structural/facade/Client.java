package main.com.watkins.structural.facade;

import main.com.watkins.structural.facade.email.*;

public class Client {

    public static void main(String[] args) {
        Order order = new Order("101", 99.99);

        // using facade pattern
        EmailFacade facade = new EmailFacade();
        boolean result1 = facade.sendOrderEmail(order);

        // NOT using facade pattern
        boolean result2 = sendOrderEmailWithoutFacade(order);

        System.out.println("[Facade] - Order Email " + (result1 ? "sent!" : "not sent..."));
        System.out.println("[Standard] - Order Email " + (result2 ? "sent!" : "not sent..."));
    }

    private static boolean sendOrderEmailWithoutFacade(Order order) {
        Template template = TemplateFactory.createTemplateFor(Template.TemplateType.Email);
        Stationary stationary = StationaryFactory.createStationary();
        Email email = Email.getBuilder()
                .withTemplate(template)
                .withStationary(stationary)
                .forObject(order)
                .build();
        Mailer mailer = Mailer.getMailer();
        return mailer.send(email);
    }
}

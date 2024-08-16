package main.com.watkins.structural.decorator;

import main.com.watkins.structural.decorator.TextMessage;

public class Client {
    public static void main(String[] args) {
        Message m = new TextMessage("The <FORCE> is strong with this one!");
        System.out.println(m.GetContent());

        Message decorator = new HtmlEncodedMessage(m);
        System.out.println(decorator.GetContent());

        decorator = new Base64EncodedMessage(m);
        System.out.println(decorator.GetContent());

        decorator = new Base64EncodedMessage(decorator);
        System.out.println(decorator.GetContent());
    }
}

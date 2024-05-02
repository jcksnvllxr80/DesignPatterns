package main.com.watkins.creational.factorymethod;

import main.com.watkins.creational.factorymethod.message.Message;

public class Client {

    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());

        printMessage(new TextMessageCreator());
    }

    public static void printMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        System.out.println(msg);
    }
}

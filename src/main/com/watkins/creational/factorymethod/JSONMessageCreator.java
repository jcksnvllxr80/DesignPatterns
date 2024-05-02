package main.com.watkins.creational.factorymethod;

import  main.com.watkins.creational.factorymethod.message.JSONMessage;
import  main.com.watkins.creational.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }


}
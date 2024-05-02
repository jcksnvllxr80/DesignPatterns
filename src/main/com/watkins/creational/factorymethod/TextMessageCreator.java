package main.com.watkins.creational.factorymethod;

import main.com.watkins.creational.factorymethod.message.Message;
import main.com.watkins.creational.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new TextMessage();
    }



}
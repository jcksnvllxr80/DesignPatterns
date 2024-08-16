package main.com.watkins.structural.decorator;

import java.util.Base64;

public class Base64EncodedMessage implements Message {

    private Message msg;

    public Base64EncodedMessage(Message msg) {
        this.msg = msg;
    }

    @Override
    public String GetContent() {
        // Be wary of charset!! This is platform dependent.
        return Base64.getEncoder().encodeToString(msg.GetContent().getBytes());
    }

}

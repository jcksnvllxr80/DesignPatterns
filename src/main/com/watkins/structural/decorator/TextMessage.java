package main.com.watkins.structural.decorator;

// ConcreteComponent. Object to be decorated
public class TextMessage implements Message {
    private String msg;

    public TextMessage(String msg) {
        this.msg = msg;
    }

    @Override
    public String GetContent() {
        return msg;
    }
}

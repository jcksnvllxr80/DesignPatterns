package main.com.watkins.structural.facade.email;

public class Email {

    public static EmailBuilder getBuilder() {
        return new EmailBuilder();
    }
}

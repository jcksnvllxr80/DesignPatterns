package main.com.watkins.structural.flyweight;

public class SystemErrorMessage implements ErrorMessage {
    // some error message $errorCode
    private String messageTemplate;

    //http://somedomain.com/help?eroror=
    private String helpUrlBase;

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }

    @Override
    public String getText(String code) {
        return messageTemplate.replace("$errorCode", code) + helpUrlBase + code;
    }
}

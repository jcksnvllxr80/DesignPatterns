package main.com.watkins.behavioral.command;

// concrete implementation of command
public class AddMemberCommand implements Command {

    private EWSService receiver;
    private String emailAddress;
    private String listName;

    public AddMemberCommand(String email, String listName, EWSService service) {
        this.receiver = service;
        this.emailAddress = email;
        this.listName = listName;
    }

    @Override
    public void execute() {
        receiver.addMember(emailAddress, listName);
    }
}

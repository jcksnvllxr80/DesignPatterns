package main.com.watkins.behavioral.command;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        EWSService service = new EWSService();

        Command c1 = new AddMemberCommand("a@a.com", "spam", service);
        MailTasksRunner.getInstance().addCommand(c1);

        Command c2 = new AddMemberCommand("b@b.com", "spam", service);
        MailTasksRunner.getInstance().addCommand(c2);

        Thread.sleep(3000);

        MailTasksRunner.getInstance().shutdown();
    }
}

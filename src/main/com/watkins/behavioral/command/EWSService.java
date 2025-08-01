package main.com.watkins.behavioral.command;

// This class is the Receiver
public class EWSService {

    // Add new member to the mailing list
    public void addMember(String contact, String contactGroup) {
        // contact exchange
        System.out.println("Added " + contact + " to " + contactGroup);
    }

    // Remove member from mailing list
    public void removeMember(String contact, String contactGroup) {
        // contact exchange
        System.out.println("Removed " + contact + " from " + contactGroup);
    }
}

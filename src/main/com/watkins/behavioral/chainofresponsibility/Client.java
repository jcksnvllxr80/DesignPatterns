package main.com.watkins.behavioral.chainofresponsibility;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        LeaveApplication application = LeaveApplication.getBuilder()
                .withType(LeaveApplication.Type.Sick)
                .from(LocalDate.now())
                .to(LocalDate.of(2025, 8, 2))
                .build();
        System.out.println(application);
        System.out.println("********************************");
        LeaveApprover approver = createChain();
        approver.processLeaveApplication(application);
        System.out.println(application);
    }

    private static LeaveApprover createChain() {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        return new ProjectLead(manager);
    }
}

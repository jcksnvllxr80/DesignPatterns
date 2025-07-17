package main.com.watkins.behavioral.chainofresponsibility;

public interface LeaveApprover {

    void processLeaveApplication(LeaveApplication application);

    String getApproverRole();
}

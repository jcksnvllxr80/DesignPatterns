package main.com.watkins.behavioral.chainofresponsibility;

public class ProjectLead extends Employee {

    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        // process if type is `sick` and duration is less than or eq to 2 days
        if (application.getType() == LeaveApplication.Type.Sick) {
            if (application.getNumberOfDays() <= 2) {
                System.out.println("Project Lead approved " + application);
                return true;
            }
        }
        return false;
    }
}

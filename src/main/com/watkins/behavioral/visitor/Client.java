package main.com.watkins.behavioral.visitor;

import java.util.Date;
import java.util.Random;

public class Client {

    public static void main(String[] args) {

        Employee organization = buildOrganization();
        Visitor visitor = new PrintVisitor();
        visitOrgStructure(organization, visitor);

        System.out.println("***************************************");
        //Perform a fake appraisal
        appraisal(organization, new Random(new Date().getTime()));

        AppraisalVisitor visitor2 = new AppraisalVisitor();
        //Carry out final appraisal where we consider team performance
        visitOrgStructure(organization, visitor2);

        //create new print visitor with final ratings taken from appraisal visitor
        visitor = new PrintVisitor(visitor2.getFinalRatings());
        visitOrgStructure(organization, visitor);
    }

    private static Employee buildOrganization() {

        Programmer p1 = new Programmer("John", "Java");
        Programmer p2 = new Programmer("Jane", "Python");

        Programmer p3 = new Programmer("Alice", "JavaScript");
        Programmer p4 = new Programmer("Bob", "C#");

        ProjectLead pl1 = new ProjectLead("Charlie",  p1, p2);
        ProjectLead pl2 = new ProjectLead("David", p3, p4);

        Manager m1 = new Manager("Mike", pl1);
        Manager m2 = new Manager("Sarah", pl2);

        VicePresident vp = new VicePresident("Richard", m1, m2);

        return vp;
    }

    private static void visitOrgStructure(Employee employee, Visitor visitor) {
        employee.accept(visitor);
        employee.getDirectReports().forEach(e -> visitOrgStructure(e, visitor));
    }

    //This method assigns some random values to performance rating field of employees
    private static void appraisal(Employee emp, Random random) {
        int rating = random.nextInt(6);
        emp.setPerformanceRating(rating < 1 ? 1: rating);
        emp.getDirectReports().forEach(r -> appraisal(r, random));
    }
}

package main.com.watkins.behavioral.interpreter;

public class Client {

    public static void main(String[] args) {
        Report report1 = new Report("Cashflow report", "NOT ADMIN");
        ExpressionBuilder builder = new ExpressionBuilder();

        PermissionExpression exp = builder.build(report1);
        System.out.println(exp);

        // results in false for access because the report requires not admin yet Dave has admin rights
        // User user1 = new User("Dave", "USER", "ADMIN");

        // results in true for access because the report requires no admin rights, which Dave has none
        User user1 = new User("Dave", "USER");


        System.out.println("User access report: " + exp.interpret(user1));
    }
}

package main.com.watkins.structural.adapter.classadapter;

public class Client {


    public static void main(String[] args) {
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);
        System.out.println(card);

    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("John Doe");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("Making robots, New York City, New York");
    }
}

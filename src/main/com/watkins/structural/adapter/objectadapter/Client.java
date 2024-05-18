package main.com.watkins.structural.adapter.objectadapter;

import main.com.watkins.structural.adapter.classadapter.BusinessCardDesigner;
import main.com.watkins.structural.adapter.classadapter.Employee;

public class Client {

    public static void main(String[] args) {
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(objectAdapter);
        System.out.println(card);
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("John Doe");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("Making robots, New York City, New York");
    }
}

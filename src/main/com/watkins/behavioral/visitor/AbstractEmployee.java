package main.com.watkins.behavioral.visitor;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AbstractEmployee implements Employee {

    private int performanceRating;

    private String name;

    private static int employeeIdCounter = 101;

    private int employeeId;

    public AbstractEmployee(String name) {
        this.name = name;
        this.employeeId = employeeIdCounter++;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getPerformanceRating() {
        return performanceRating;
    }

    @Override
    public void setPerformanceRating(int rating) {
        performanceRating = rating;
    }

    @Override
    public Collection<Employee> getDirectReports() {
        return Collections.emptyList();
    }

    @Override
    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public void accept(Visitor visitor) {

    }
}

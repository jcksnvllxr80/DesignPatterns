package main.com.watkins.structural.adapter.objectadapter;

import main.com.watkins.structural.adapter.classadapter.Customer;
import main.com.watkins.structural.adapter.classadapter.Employee;

public class EmployeeObjectAdapter implements Customer {

    private Employee adaptee;

    public EmployeeObjectAdapter(Employee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getDesignation() {
        return adaptee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return adaptee.getOfficeLocation();
    }

    @Override
    public String getName() {
        return adaptee.getFullName();
    }
}

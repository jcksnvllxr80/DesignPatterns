package main.com.watkins.structural.adapter.classadapter;

/**
 * A class adapter (AKA two-way adapter)
 */
public class EmployeeClassAdapter extends Employee implements Customer {
    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }

    @Override
    public String getName() {
        return this.getFullName();
    }
}

package main.com.watkins.creational.abstractfactory;

public class EC2Instance implements Instance {
    public EC2Instance(Capacity capacity) {
        // Map capacity ti ec2 instance types. use aws API to provision
        System.out.println("Created EC2Instance");
    }

    @Override
    public void start() {
        System.out.println("EC2Instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to EC2Instance");
    }

    @Override
    public void stop() {
        System.out.println("EC2Instance stopped");
    }

    @Override
    public String toString() {
        return "EC2Instance";
    }
}

package main.com.watkins.creational.abstractfactory;

public class GoogleComputeEngineInstance implements Instance {
    public GoogleComputeEngineInstance(Capacity capacity) {
        // Map capacity to GCP computer instance types. Use GCP API to provision
        System.out.println("Created Google Compute Engine instance");
    }

    @Override
    public void start() {
        System.out.println("Google Compute Engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " Google Compute Engine instance.");
    }

    @Override
    public void stop() {
        System.out.println("Google Compute Engine instance stopped");
    }
}

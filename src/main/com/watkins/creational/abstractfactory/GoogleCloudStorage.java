package main.com.watkins.creational.abstractfactory;

public class GoogleCloudStorage implements Storage {
    public GoogleCloudStorage(int capacityInMib) {
        // Use GCP API
        System.out.println("Allocated " + capacityInMib + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gcpcs1";
    }

    @Override
    public String toString() {
        return "Google Cloud Storage";
    }
}

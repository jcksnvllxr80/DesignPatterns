package main.com.watkins.behavioral.nullobject;

import java.io.IOException;
import java.io.PrintWriter;

public class StorageService {

    public void save(Report report) {
        System.out.println("Saving report " + report.getName());
        try {
            PrintWriter writer = new PrintWriter(report.getName() + ".txt");
            writer.println(report.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

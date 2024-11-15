package main.com.watkins.structural.proxy.dynamicProxy;

import main.com.watkins.structural.proxy.staticProxy.Image;

import javafx.geometry.Point2D;

public class Client {

    public static void main(String[] args) {
        Image img = ImageFactory.getImage("test.jpg");
        img.setLocation(new Point2D(10, 0));
        System.out.println("Image location: " + img.getLocation());
        System.out.println("Rendering image now...");
        img.render();
    }
}

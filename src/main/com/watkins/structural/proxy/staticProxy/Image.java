package main.com.watkins.structural.proxy.staticProxy;

import javafx.geometry.Point2D;

public interface Image {

    void setLocation(Point2D point2d);

    Point2D getLocation();

    void render();
}

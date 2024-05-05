package main.com.watkins.creational.abstractfactory;

public interface Instance {
    enum Capacity{ micro, small, large}

    void start();

    void attachStorage(Storage storage);

    void stop();
}

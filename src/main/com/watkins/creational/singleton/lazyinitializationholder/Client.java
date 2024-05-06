package main.com.watkins.creational.singleton.lazyinitializationholder;

public class Client {
    public static void main(String[] args) {
        LazyRegistryIODH singleton;

        // call as many times as you want but only get one LazyRegistryIODH constructed.
        singleton = LazyRegistryIODH.getInstance();
        singleton = LazyRegistryIODH.getInstance();
        singleton = LazyRegistryIODH.getInstance();
        singleton = LazyRegistryIODH.getInstance();
    }
}

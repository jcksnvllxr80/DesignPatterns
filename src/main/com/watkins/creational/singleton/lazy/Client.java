package main.com.watkins.creational.singleton.lazy;

import main.com.watkins.creational.singleton.eager.EagerRegistry;

public class Client {
    public static void main(String[] args) {
        LazyRegisterWithDCL lazyRegisterWithDCL = LazyRegisterWithDCL.getInstance();
        LazyRegisterWithDCL lazyRegisterWithDCL2 = LazyRegisterWithDCL.getInstance();
        System.out.println(lazyRegisterWithDCL == lazyRegisterWithDCL2);
    }
}

package main.com.watkins.structural.proxy.dynamicProxy;

import main.com.watkins.structural.proxy.staticProxy.Image;

import java.lang.reflect.Proxy;

public class ImageFactory {

    public static Image getImage(String name) {
        return (Image) Proxy.newProxyInstance(
            ImageFactory.class.getClassLoader(),
            new Class[]{Image.class},
            new ImageInvocationHandler(name)
        );
    }
}

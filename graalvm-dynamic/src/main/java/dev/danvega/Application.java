package dev.danvega;

import java.lang.reflect.InvocationTargetException;

public class Application {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> niceClazz = Class.forName("org.nd4j.shade.guava.util.concurrent.AtomicDouble");
        System.out.println("Double value is: " + niceClazz.getMethod("longValue").invoke(niceClazz.getConstructor().newInstance()));


    }
}

package dev.danvega;

import java.lang.reflect.InvocationTargetException;

public class Application {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> niceClazz = Class.forName("dev.danvega.NiceMessage");
        niceClazz.getMethod("printMessage").invoke(niceClazz.getConstructor().newInstance());
        Class<?> meanClazz = Class.forName("dev.danvega.MeanMessage");
        meanClazz.getMethod("printMessage").invoke(meanClazz.getConstructor().newInstance());
        Class<?> thanhClazz = Class.forName("dev.danvega.ThanhMessage");
        thanhClazz.getMethod("printMessage").invoke(thanhClazz.getConstructor().newInstance());
    }
}

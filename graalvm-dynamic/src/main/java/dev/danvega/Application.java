package dev.danvega;

import org.nd4j.common.primitives.Counter;

import java.lang.reflect.InvocationTargetException;

public class Application {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> niceClazz = Class.forName("dev.danvega.NiceMessage");
        niceClazz.getMethod("printMessage").invoke(niceClazz.getConstructor().newInstance());

        Class<?> meanClazz = Class.forName("dev.danvega.MeanMessage");
        meanClazz.getMethod("printMessage").invoke(meanClazz.getConstructor().newInstance());

        Class<?> thanhClazz = Class.forName("dev.danvega.ThanhMessage");
        thanhClazz.getMethod("printMessage").invoke(thanhClazz.getConstructor().newInstance());

        Counter<String> counterA = new Counter<>();

        counterA.incrementCount("A", 1);
        counterA.incrementCount("A", 1);
        counterA.incrementCount("A", 1);

        Counter<String> counterB = new Counter<>();
        counterB.incrementCount("B", 2);
        counterB.incrementCount("B", 2);

        System.out.println(counterA.getCount("A")); // 3
        System.out.println(counterA.getCount("B")); // 4

        counterA.incrementAll(counterB);

        System.out.println(counterA.getCount("A")); // 3
        System.out.println(counterA.getCount("B")); // 4

        counterA.setCount("B", 234);

        System.out.println(counterA.getCount("B")); // 234
    }
}

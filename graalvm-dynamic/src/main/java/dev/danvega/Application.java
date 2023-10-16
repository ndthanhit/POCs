package dev.danvega;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

import java.lang.reflect.InvocationTargetException;

public class Application {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        INDArray nd1 = Nd4j.create(new double[]{1,2,3,4,5,6}, 2,3);
        System.out.println("nd1:\n"+nd1);

        INDArray ndv = nd1.add(1);

        System.out.println("nd1.add(1):\n"+ndv);

        ndv = nd1.mul(5);
        System.out.println("nd1.mul(5):\n"+ndv);

        ndv = nd1.sub(3);
        System.out.println("nd1.sub(3):\n"+ndv);

        ndv = nd1.div(2);
        System.out.println("nd1.div(2):\n"+ndv);

        /*Class<?> niceClazz = Class.forName("dev.danvega.NiceMessage");
        niceClazz.getMethod("printMessage").invoke(niceClazz.getConstructor().newInstance());

        Class<?> meanClazz = Class.forName("dev.danvega.MeanMessage");
        meanClazz.getMethod("printMessage").invoke(meanClazz.getConstructor().newInstance());

        Class<?> thanhClazz = Class.forName("dev.danvega.ThanhMessage");
        thanhClazz.getMethod("printMessage").invoke(thanhClazz.getConstructor().newInstance());*/
    }
}

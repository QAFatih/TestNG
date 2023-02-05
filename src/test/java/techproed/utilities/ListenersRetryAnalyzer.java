package techproed.utilities;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public class ListenersRetryAnalyzer implements IAnnotationTransformer {
    //Bu sinifin amaci: Tum Fail test caseleri bir kez daha otomatik olarak run etmek.
    //Bu class ListenersRetry sinifini xml'de otomatik olarak calistirabilmek icin olusturuldu.
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
        //Bu sinif ListenersRetry util class'ina baglidir.
        annotation.setRetryAnalyzer(ListenersRetry.class);
    }
}

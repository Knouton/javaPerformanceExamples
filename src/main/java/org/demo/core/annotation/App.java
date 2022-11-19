package org.demo.core.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Arrays;

public class App {

    public static void main(String[] args) throws Exception {
        Class<DemoClass> demoClassObj = DemoClass.class;
        readAnnotationOn(demoClassObj);
        Method method = demoClassObj.getMethod("printString");
        readAnnotationOn(method);
        method = demoClassObj.getMethod("printInt");
        readAnnotationOn(method);
    }
    static void readAnnotationOn(AnnotatedElement element) {
        try {
            System.out.println("Поиск аннотаций в " + element.getClass().getName());
            Annotation[] annotations = element.getAnnotations();
            for (Annotation annotation : annotations) {
                if(annotation.annotationType().equals(AnnotationDemoFieldInfo.class)) {
                    AnnotationDemoFieldInfo fieldInfo = (AnnotationDemoFieldInfo)annotation;
                    System.out.println("Name: "+ fieldInfo.name());
                    System.out.println("Value: "+ fieldInfo.value());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

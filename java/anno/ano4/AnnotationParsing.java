package ano4;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import ano3.Test;

public class AnnotationParsing {

//	public static void main(String[] args) {
//        try {
//            for (Method method : AnnotationParsing.class.getClassLoader().loadClass(("ano4.AnnotationExample")).getMethods()) {
//                // checks if MethodInfo annotation is present for the method
//                if (method.isAnnotationPresent(ano4.MethodInfo.class)) {
//                    try {
//                        // iterates all the annotations available in the method
//                        for (Annotation anno : method.getDeclaredAnnotations()) {
//                            System.out.println("Annotation in Method '"
//                                    + method + "' : " + anno);
//                        }
//                        MethodInfo methodAnno = method
//                                .getAnnotation(MethodInfo.class);
//                        if (methodAnno.revision() == 1) {
//                            System.out.println("Method with revision no 1 = "
//                                    + method);
//                        }
// 
//                    } catch (Throwable ex) {
//                        ex.printStackTrace();
//                    }
//                }
//            }
//        } catch (SecurityException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
	
	public static <T> void initData(Test clzz) throws IllegalArgumentException, IllegalAccessException{
        try {
            for (Method method : AnnotationParsing.class.getClassLoader().loadClass(("ano4.AnnotationExample")).getMethods()) {
                // checks if MethodInfo annotation is present for the method
                if (method.isAnnotationPresent(ano4.MethodInfo.class)) {
                    try {
                        // iterates all the annotations available in the method
                        for (Annotation anno : method.getDeclaredAnnotations()) {
                            System.out.println("Annotation in Method '"
                                    + method + "' : " + anno);
                        }
                        MethodInfo methodAnno = method
                                .getAnnotation(MethodInfo.class);
                        if (methodAnno.revision() == 1) {
                            System.out.println("Method with revision no 1 = "
                                    + method);
                        }
 
                    } catch (Throwable ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (SecurityException | ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
}

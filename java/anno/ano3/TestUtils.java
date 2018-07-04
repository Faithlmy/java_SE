package ano3;

import java.lang.reflect.Field;

public class TestUtils {

	public static <T> void initData(Test clzz) throws IllegalArgumentException, IllegalAccessException{
        Field[] fields = clzz.getClass().getDeclaredFields();
        for(Field f:fields){
            if(f.isAnnotationPresent(MyAnimotions.class)){
                MyAnimotions annotation = f.getAnnotation(MyAnimotions.class);
                
//                String value = annotation.value();
//                f.set(clzz, value);//将测试类和@interface放入 field中
//                
//                String a = annotation.a();
//                f.set(clzz, a);
                
                double a11 = annotation.a11();
                f.set(clzz, a11);
                
//                double a2 = annotation.a2();
//                f.set(clzz, a2);
            }
        }
    }
}

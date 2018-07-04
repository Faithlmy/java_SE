package ano3;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;


@Target(value = {ElementType.METHOD, ElementType.FIELD})
@Retention(RUNTIME)
public @interface MyAnimotions {

//    String value()  default "";
//    
//    String a() default "res";
    
	double a11() default 111;
    
    double a2() default 1.0;
}

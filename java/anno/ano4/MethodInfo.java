package ano4;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RUNTIME)
public @interface MethodInfo {

    String author() default "Pankaj";
    String date();
    int revision() default 1;
    String comments();
}

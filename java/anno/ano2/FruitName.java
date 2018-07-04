package ano2;

import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

/*
 * fruit name anno
 * */
@Target(FIELD)
@Retention(RUNTIME)
@Documented
public @interface FruitName {

	String value() default "fruit name";
}

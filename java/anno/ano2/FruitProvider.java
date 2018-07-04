package ano2;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(FIELD)
@Retention(RUNTIME)
@Documented

public @interface FruitProvider {

	public int id() default -1;
	
	public String name() default "name";
	
	public String address() default "sz";
}

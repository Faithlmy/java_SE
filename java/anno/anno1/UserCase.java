package anno1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class UserCase {

	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface MyUserCase{
		public String id();
		public String description() default "no description";
	}
	
	public @interface MyName{
		String name() default "res";
	}
}

package java.annotation2;

import java.lang.annotation.*;


public class UseCase {
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	
	public @interface Faith{
	    public String id();
	    public String description() default "no description";
	}

}

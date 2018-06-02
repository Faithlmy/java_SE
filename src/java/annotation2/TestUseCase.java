package java.annotation2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestUseCase {
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		Collections.addAll(l, 43, 89, 23, 56);
		traceUseCase(l, PasswordUtils.class);
	}
	
	public static void traceUseCase(List<Integer> l, Class<?> cl) {
		for(Method m : cl.getDeclaredMethods()){
			java.annotation2.UseCase.Faith uc = m.getAnnotation(java.annotation2.UseCase.Faith.class);
			if(uc != null) {
				System.out.println(uc.id() + "  " + uc.description());
				l.remove(new Integer(uc.id()));
			}
			
		for(int i: l) {
			System.out.println(i);
		}
		}
	}

}

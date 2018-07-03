package anno1;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import anno1.UserCase.MyUserCase;

public class TestAnno {

	public static void main(String[] args) {
		List<Integer> uc = new ArrayList<>();
		Collections.addAll(uc,  90);
		trackUseCases(uc,PassWord.class);
	}
	
	public static void trackUseCases(List<Integer> uc, Class<?> cl) {
		for(Method m : cl.getDeclaredMethods()) {
			MyUserCase muc = m.getAnnotation(MyUserCase.class);
			if(uc != null) {
				System.out.println(muc.id() + muc.description());
			}
		}
	}
}

package GenericExe.java;

import java.util.Objects;

@SuppressWarnings("unused")
public class GenericArrylist <E> {
	
	Object[] ob = new Object[10];
	int index = 0;
	
	public GenericArrylist() {
		System.out.println("This is constructor.");
	}
	
	public void add(E e) {
		if(index == ob.length) {
			Object[] newOb = new Object[ob.length];
			System.arraycopy(ob, 0, newOb, 0, ob.length);
			ob = newOb;
		}
		ob[index] = e;
		index++;
	}
	
	public void add(double e) {
		if(index == ob.length) {
			Object[] newOb = new Object[ob.length];
			System.arraycopy(ob, 0, newOb, 0, ob.length);
			ob = newOb;
		}
		ob[index] = e;
		index++;
	}
	
	public int size() {
		return index++;
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index) {
		return (E) ob[index];
	}
}

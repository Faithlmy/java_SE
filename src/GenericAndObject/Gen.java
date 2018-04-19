package GenericAndObject;

public class Gen<T> {
	
	private T ob;
	
	public Gen() {}
	public Gen(T ob) {
		this.ob = ob;
	}
	
	public T getOb() {
		return ob;
	}
	
	public void setOb() {
		this.ob = ob;
	}
	
	public void showType() {
		System.out.println("The realize type of T is :  " + ob.getClass().getName());
	}
}

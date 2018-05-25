package generic1;

public class GenObject {

	private Object ob;
	
	public GenObject() {};
	public GenObject(Object ob) {
		this.ob = ob;
	}
	
	public Object getOb() {
		return ob;
	}
	
	public void setOb(Object ob) {
		this.ob = ob;
	}
	
	public void showType() {
		System.out.println("Type is : " + ob.getClass().getName());
	}
	
}

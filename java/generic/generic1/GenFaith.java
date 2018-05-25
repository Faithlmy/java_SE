package generic1;

public class GenFaith<Faith> {

	private Faith f;
	
	public GenFaith() {}
	public GenFaith(Faith f) {
		this.f = f;
	}
	
	public Faith getFaith() {
		return f;
	}
	
	public void setFaith(Faith f) {
		this.f = f;
	}
	
	public void showType() {
		System.out.println("Type is: " + f.getClass().getName());
	}
}

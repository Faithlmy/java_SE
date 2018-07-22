package constructor;

public class ThisInitialization {

	public static void main(String[] args) {
		FunClass f = new FunClass(4);
		System.out.println(f.b);
		f.Fun();
	}
}

class FunClass{
	// 定义好变量，用构造器来进行不同的初始化
	private int a;
	public String b;
	public FunClass(){
		a = 1;
		b = "b";
	}
	public FunClass(int a) {
		this.a = a;
		b = "mk";
	}
	public void Fun() {
		System.out.println(a + b);
	}
}

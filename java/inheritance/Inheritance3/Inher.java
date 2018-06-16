package Inheritance3;


import static java.lang.System.*;
public class Inher {
	public static void main(String[] args) {
		B b = new B();
		
		C c = new C();
		D d = new D();
	}

}

class A{
	A(){
		out.println("A constructor.");
	}
	public void Aprint() {
		out.println("Aprint");
	} 
} 


class AA{
	AA(){
		out.println("AA constructor.");
	}
	public void AAprint() {
		out.println("AAprint");
	} 
} 

class B extends A{
	B(){
		out.println("B constructor.");
	}
	protected void  Bprint() {
		out.println("Bprint");
	}
}



class C extends B{
	C(){
		out.println("C constructor.");
	}
	public void Cprint() {
		out.println("Cprint");
	}
	
}

class D extends B{
	D(){
		out.println("D constructor.");
	}
	public void Dprint() {
		out.println("Dprint");
	}
	
}





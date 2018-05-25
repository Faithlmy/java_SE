package kw_this;

/**
 * @author root
 * This example shows another way this used.
 * 1. 
 */
import static java.lang.System.out;

public class Flower {
	int pc = 90;
	String s = "sv";
	Flower(){
		this(111);//calling the constructor of Flower(int num)
		out.println("111 pc " + this.pc);
		out.println(pc);
	}
	
	Flower(int num){
		this("hello");
		pc = num;
		out.println("Funnum");
		out.println("this " + this.pc);
		out.println("or "+ pc);
		//this("hello");//Constructor call must be the first statement in a constructor
	}
	Flower(String s){
		//this();//Recursive constructor invocation Flower(String)
		//this(88);
		//this(2, 8);
		this.s = s;
		out.println(s);
	}
	Flower(int a, int b){
		this("ab");
		out.println(a + b);
		
	}
	
	public void Fun() {
		//this("hello");//Constructor call must be the first statement in a constructor
		out.println("Fun");
	}


}

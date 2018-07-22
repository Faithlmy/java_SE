package kw_static;

import java.util.Properties;

//如下代码输出的结果：
public class OrderStatic3 {

    Res res = new Res("Test");

    static{
        System.out.println("test static");
    }

    public OrderStatic3() {
        System.out.println("test constructor");
    }

    public static void main(String[] args) {
        new MyClass();
        for(int i = 0; i < args.length; i++) {
        	System.out.println(args[i]);
        }
    }
}

class Res{

    static{
        System.out.println("Res static");
    }
    public Res(String str) {
        System.out.println("Res "+str);
    }

}

class MyClass extends OrderStatic3 {


    Res res = new Res("MyClass");
    
    static{
        System.out.println("myclass static");
    }

    public MyClass() {
        System.out.println("myclass constructor");
    }

}
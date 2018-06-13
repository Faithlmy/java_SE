package kw_static;

class Pook{
    public Pook(String msg) {
        System.out.println(msg);
    }
}

public class Person1 {

    Pook book1 = new Pook("book1成员变量初始化");
    static Pook book2;
    
    static {
        book2 = new Pook("static成员book2成员变量初始化");
        book4 = new Pook("static成员book4成员变量初始化");
    }
    
    public Person1(String msg) {
        System.out.println(msg);
    }
    
    Pook book3 = new Pook("book3成员变量初始化");
    static Pook book4;
    
    public static void funStatic() {
        System.out.println("static修饰的funStatic方法");
    }
    
    public static void main(String[] args) {
        Person.funStatic();
        System.out.println("****************");
        Person p1 = new Person("p1初始化");
    }
    /**Output
     * static成员book2成员变量初始化
     * static成员book4成员变量初始化
     * static修饰的funStatic方法
     * ***************
     * book1成员变量初始化
     * book3成员变量初始化
     * p1初始化
     *///~
}

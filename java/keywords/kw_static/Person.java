package kw_static;


// 静态块
/*
 * 当我们new一个Person对象时，static修饰的成员变量首先被初始化，
 * 随后是普通成员，最后调用Person类的构造方法完成初始化。也就是说，
 * 在创建对象时，static修饰的成员会首先被初始化，而且我们还可以看到，
 * 如果有多个static修饰的成员，那么会按照他们的先后位置进行初始化。
 * */
class Book{
    public Book(String msg) {
        System.out.println(msg);
    }
}

public class Person {

    Book book1 = new Book("book1成员变量初始化");
    static Book book2 = new Book("static成员book2成员变量初始化");
    
    public Person(String msg) {
        System.out.println(msg);
    }
    
    Book book3 = new Book("book3成员变量初始化");
    static Book book4 = new Book("static成员book4成员变量初始化");
    
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
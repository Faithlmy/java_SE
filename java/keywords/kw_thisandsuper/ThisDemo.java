package kw_thisandsuper;


public class ThisDemo {
	
	public static void main(String[] args) {
		Student s = new Student("faith", 18);
		System.out.println(s.toString()); // Student[name= null, age= 0]
		s.age = 11;
		s.name = "g";
		
		myfaith f = new myfaith("dream", 36);
		System.out.println(f.toString()); // Student[name= dream, age= 36]
		
		mydream d = new mydream(null);
		System.out.println(d.toString());
	}
}

class Student {
	String name;
	int age;
	public Student(String name, int age) {
		name = name;
		age = age;
	}
	
	public String toString() {
		return "Student[name= " + name + ", "+ "age= " + age + "]";
	}
	
}



class myfaith {
	String name;
	int age;
	public myfaith(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Student[name= " + name + ", "+ "age= " + age + "]";
	}
}


class mydream{
	 String name;
     int age;
     int id;
     
     public mydream() {};
     public mydream(String name, int age, int id) {
         this.name = name;
         this.age = age;
         this.id = id;
         System.out.println("构造器3已调用");
     }
     public mydream(String name, int age) {
         this(name,age,0);
         System.out.println("构造器2已调用");
     }

     public mydream(String name) {
         this(name,0);//参数不足,就使用参数默认值补全
         System.out.println("构造器1已调用");
     }
     @Override
     public String toString() {
         return "Student [ id=" + id + ", name=" + name + ", age=" + age +"]";
     }
}








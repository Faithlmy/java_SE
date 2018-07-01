package clone3;

public class TestClone {

	public static void main(String args[]) {  
        Student stu1 = new Student();  
        stu1.setNumber(12345);  
        Student stu2 = stu1;  
        stu2.setNumber(54321); 
          
        System.out.println("学生1:" + stu1.getNumber());  
        System.out.println("学生2:" + stu2.getNumber());  
    }  
}

class Student {  
    private int number;  
  
    public int getNumber() {  
        return number;  
    }  
  
    public void setNumber(int number) {  
        this.number = number;  
    }  
      
} 
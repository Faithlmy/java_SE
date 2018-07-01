package clone3;

public class CloneClass{
	public static void main(String[] args) {
        S stu1 = new S();  
        S stu2 = (S) stu1.clone(); 
        
        stu1.setNumber(12345);  
        System.out.println("学生1:" + stu1.getNumber());  
        System.out.println("学生2:" + stu2.getNumber()); 
        
        stu2.setNumber(54321); 
        System.out.println("学生1:" + stu1.getNumber());  
        System.out.println("学生2:" + stu2.getNumber());  
        
        //
        System.out.println(stu1 == stu2); // false  
	}
}

class S implements Cloneable  {

    private int number;  
    
    public int getNumber() {  
        return number;  
    }  
  
    public void setNumber(int number) {  
        this.number = number;  
    }  
    
    @Override  
    public Object clone() {  
        S stu = null;  
        try{  
            stu = (S)super.clone();  
        }catch(CloneNotSupportedException e) {  
            e.printStackTrace();  
        }  
        return stu;  
    }  
}

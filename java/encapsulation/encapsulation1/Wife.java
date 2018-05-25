package encapsulation1;

public class Wife {
	public static void main(String []args) {
		Husband h = new Husband();
		h.name1 = "faith";
		h.sex1 = "male";
		h.setSex("setMale");
		h.setName("setFaith");
	}
	
    public String name;
    private int age;
    private String sex;
    private Husband husband;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getSex() {
//        return sex;
//    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
    	if(age > 100 || age <= 0) {
    		System.out.println("ERROR");
    	}
    	else {
    		this.age = age;
    	}
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    public Husband getHusband() {
        return husband;
    }
    
}

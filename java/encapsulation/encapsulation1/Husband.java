package encapsulation1;

public class Husband {
	Wife w = new Wife();
	
	private String name ;
	public String name1;//This variable can be invoked in invoke.java
	
    private String sex ;
    protected String sex1;
    private int age ;
    private Wife wife;
    
    public void n(String a) {
    	name1 = a;
    	System.out.print(name1);
    }

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	public Wife getWife() {
//		return wife;
//	}
	public void setWife(Wife wife) {
		this.wife = wife;
	}
	


}

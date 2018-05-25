package object1;


public class User {
	private int uid;
	private String name;
	private int age;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof User))
			return false;
		if(((User) obj).getUid() == this.getUid())
			return true;
		return false;
	}

}

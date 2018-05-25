package object1;


public class UserMain implements Cloneable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User();
		u1.setUid(121);
		u1.setName("feng");
		
		User u2 = new User();
		u2.setUid(121);
		u2.setName("faith");
		
		System.out.println(u1.equals(u2));// the result is true.  User类定义中重写了equals()方法
	}

}

package abstractClass;

public class Air extends abstractFly{ // 
	
	@Override
	public void fly() { // 重写abstractFly里面的内容
		System.out.println("airfaith");
	}

	@Override
	public int add(int a, int b) { //重写abstractFly里面的内容
		// TODO Auto-generated method stub
		return a + b;
		
	}

}

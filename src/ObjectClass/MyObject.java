package ObjectClass;

public class MyObject implements Cloneable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object ob = new Object();
//		Object clone = ob.clone(); // "The method clone() from the type Object is not visible"
		
		MyObject mo1 = new MyObject();
		try {
			MyObject mo2 = (MyObject) mo1.clone();
			System.out.println("mo2:  " + mo2.toString());
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();  // java.lang.CloneNotSupportedException
		}
	}

}

package ano3;

public class Test {

//	@MyAnimotions(a = "hello")
//    public String result;
//
//	@MyAnimotions(value = "kk")
//	public String res;
	
//	@MyAnimotions(a11  = 3.0)
	public double b;
//	@MyAnimotions(a11 = 6.0)
//	public double c;

    public static void main(String[] args) {
        Test test = new Test();
        try {
            TestUtils.initData(test);
//            System.out.println(test.result);
//            System.out.println(test.res);
//            System.out.println(test.b + test.c);
            test.fun();
//            System.out.println();
//            System.out.println(test.c);
        } catch (IllegalArgumentException | IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    @MyAnimotions(a11 = 5.0)
    public void fun() {
    	System.out.println(b);  
    	}
}

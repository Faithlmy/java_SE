package breakandcontinue;

public class MyBreak {
	
	public static void main(String[] args) {
		System.out.println("ccc");
		for(int i = 0; i < 7; i++) {
			System.out.println("xx");
			if(i == 3) {
				System.out.println("In if next break.");
				break;
			}
		}
	}

}

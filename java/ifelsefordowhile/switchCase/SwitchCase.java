package switchCase;

public class SwitchCase {
	
	public static void main(String[] args) {
		NoBreak nb = new NoBreak();
		nb.TestNoBreak();
		System.out.println("===============================================");
		YesBreak yb = new YesBreak();
		yb.TestNoBreak();
	}
}


class NoBreak{
	public NoBreak() {}
	
	public void TestNoBreak() {
			for(int i = 0; i < 5; i++) {
				 switch(i) {
				 case 1: 
				 case 2: 
				 System.out.println("vowel");
				 break;
				 
				 default:
				 System.out.println("consonant");
				 }
			}
		}
}




class YesBreak{
	public YesBreak() {}
	
	public void TestNoBreak() {
		for(int i = 0; i < 5; i++) {
			 switch(i) {
			 case 1: break;
			 case 2: 
			 System.out.println("vowel");
			 break;
			 
			 default:
			 System.out.println("consonant");
			 }
		}
	}
}



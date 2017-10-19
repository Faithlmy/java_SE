package faithbaseone;

/**
 * @author faith
 *Alainsing during method calls(invocates)
 */
public class Aliasing {
	static void fun(Letter y) {
		y.c = 'z';
	}
	
	public static void main(String []args) {
		Letter letter = new Letter();
		
		letter.c = 'a';
		System.out.println(letter.c);//a
		
		fun(letter);
		System.out.println(letter.c);//z
	}

}
class Letter{
	char c;
}
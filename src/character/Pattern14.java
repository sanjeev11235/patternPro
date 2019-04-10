package character;

public class Pattern14 {

	static void display() {
		
		for(int i=1; i<=5; i++) {
			char alphabet=65;
			for(int j=1; j<=i; j++) {
				System.out.print(alphabet);
				++alphabet;
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		display();
	}
}
/*
 Output
 
 */

package character;

public class Pattern05 {
	
	static void display() {
		
		for(int i=0; i<5; i++) {
			char alphabet=65;
			for(int j=0; j<5; j++) {
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
 Output:
 
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE 
 
 */

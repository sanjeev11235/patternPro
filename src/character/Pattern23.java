package character;

public class Pattern23 {

	static void display() {
		
		for(int i=5; i>=1; i--) {
			char alphabet=69;
			for(int j=i; j>=1; j--) {
				System.out.print(alphabet);
				--alphabet;
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

EDCBA
EDCB
EDC
ED
E 
 
 
 */

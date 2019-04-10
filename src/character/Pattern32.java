package character;

public class Pattern32 {

	static void display() {
		char alphabet=69;
		for(int i=5; i>=1; i--) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(alphabet);
			}
			--alphabet;
			System.out.println();
		}
	}
	public static void main(String args[]) {
		display();
	}
}
/*	
 Output:
 EEEEE
  DDDD
   CCC
    BB
     A 
 */

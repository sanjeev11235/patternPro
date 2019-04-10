package character;

public class Pattern41 {

	static void display() {
		char alphabet=65;
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(alphabet++);
			}
			--alphabet;
			for(int r=1; r<i; r++) {
				System.out.print(--alphabet);
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
     A
    ABA
   ABCBA
  ABCDCBA
 ABCDEDCBA
 
 */

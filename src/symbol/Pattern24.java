package symbol;

public class Pattern24 {

	static void display() {
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print("*");
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
     *
    **
   ***
  ****
 *****
*/
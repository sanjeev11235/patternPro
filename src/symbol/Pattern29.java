package symbol;

public class Pattern29 {

	static void display() {
		for(int i=5; i>=1; i--) {
			for(int j=5; j>=i; j--) {
				if(j==5)
					continue;
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

*****
 ****
  ***
   **
    *
*/
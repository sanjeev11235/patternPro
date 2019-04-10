package numeric;

public class Pattern39 {

	static void display() {
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <=2*i-1; k++) {
				System.out.print(k);
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
     1
    123
   12345
  1234567
 123456789

*/
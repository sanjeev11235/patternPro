package numeric;

public class Pattern17 {

	static void display() {
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
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
 
12345
1234
123
12
1
 
 */

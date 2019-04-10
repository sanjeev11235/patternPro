package numeric;

public class Pattern20 {

	static void display() {
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
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

55555
4444
333
22
1

*/

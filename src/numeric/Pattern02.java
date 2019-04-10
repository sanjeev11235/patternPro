package numeric;

public class Pattern02 {
	
	
	static void display() {
		
		for(int i=0; i<5; i++) {
			for(int j=1; j<=5; j++) {
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
12345
12345
12345
12345

*/
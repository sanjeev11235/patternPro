package numeric;

public class Pattern06 {
	
	static void display() {
		
		for(int i=5; i>=1; i--) {
			for(int j=0; j<5; j++) {
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
44444
33333
22222
11111
 
 */

package numeric;

public class Pattern03 {
	
	static void display() {
		for(int i=1; i<=5; i++) {
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

11111
22222
33333
44444
55555
 
 
 */

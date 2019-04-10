package symbol;

public class Pattern01 {
	
	static char a='*';
	
	static void display() {
		
		for(int i=0; i<5;i++) {
			for(int j=0; j<5; j++) {
				System.out.print(a);
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
*****
*****
*****
*****
	
 */

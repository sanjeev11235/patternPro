package numeric;

public class Patter11 {
	
	static void display() {
		
		for(int i=1; i<=5; i++) {
			
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
1
22
333
4444
55555
*/

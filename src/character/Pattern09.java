package character;

public class Pattern09 {
	
	static void display() {
		
		
		for(int i=1; i<=5; i++) {
			char alphabet=69;
			for(int j=1; j<=5; j++) {
				System.out.print(alphabet);
				--alphabet;
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

EDCBA
EDCBA
EDCBA
EDCBA
EDCBA
*/
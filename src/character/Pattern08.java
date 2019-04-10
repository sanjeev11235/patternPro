package character;

public class Pattern08 {
	
	static void display() {
		char alphabet=69;
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(alphabet);
			}
			--alphabet;
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		display();
	}
}
/*
Output:
EEEEE
DDDDD
CCCCC
BBBBB
AAAAA

*/
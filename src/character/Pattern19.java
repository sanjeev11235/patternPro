package character;

public class Pattern19 {

	static void display() {
		for(int i=5; i>=1; i--) {
			char alphabet=65;
			for(int j=1; j<=i; j++) {
				System.out.print(alphabet);
				++alphabet;
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

ABCDE
ABCD
ABC
AB
A

*/

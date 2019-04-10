package character;

public class Pattern18 {

	static void display() {
		char alphabet=65;
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(alphabet);
			}
			++alphabet;
			System.out.println();
		}
	}
	public static void main(String args[]) {
		display();
	}
}
/*
Output:

AAAAA
BBBB
CCC
DD
E

*/
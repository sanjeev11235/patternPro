package character;

public class Pattern28 {

	static void display() {
		for(int i=1; i<=5; i++) {
			char alphabet=65;
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
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
     A
    AB
   ABC
  ABCD
 ABCDE
 */

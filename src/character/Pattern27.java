package character;

public class Pattern27 {

	static void display() {
		char alphabet=65;
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(alphabet);
			}
			++alphabet;
			System.out.println();
		}
	}
	public static void  main(String args[]) {
		display();
	}
}
/*
Output:
     A
    BB
   CCC
  DDDD
 EEEEE
*/
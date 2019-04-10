package numeric;

public class Pattern40 {

	static void display() {
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=2*i-1; k>=1; k--) {
				System.out.print(k);
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
    321
   54321
  7654321
 987654321

*/
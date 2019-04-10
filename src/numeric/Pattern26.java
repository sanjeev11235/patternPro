package numeric;

public class Pattern26 {

	
	static void display() {
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		display();
	}
}

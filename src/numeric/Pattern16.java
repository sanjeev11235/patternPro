package numeric;

public class Pattern16 {

	static void display() {
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		display();
	}
}

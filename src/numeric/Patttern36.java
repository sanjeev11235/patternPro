package numeric;

public class Patttern36 {

	static void display() {
		for(int i=1; i<=5; i++) {
			for(int k=5; k>=i; k--) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print(2*i-1);
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		display();
	}
}

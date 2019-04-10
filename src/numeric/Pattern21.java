package numeric;

public class Pattern21 {

	static void display() {
		for(int i=5; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print(j);
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

54321
4321
321
21
1

*/
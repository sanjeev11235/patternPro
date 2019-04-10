package numeric;

public class Pattern07 {
	
	static void display() {
		
		for(int i=0; i<5; i++) {
			for(int j=5; j>=1; j--) {
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
54321
54321
54321
54321
*/
package character;

public class Pattern22 {

	static void display() {
		
		char alphabet=69;
		for(int i=5; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print(alphabet);
			}
			--alphabet;
			System.out.println();
		}
	}
	public static void main(String args[]) {
		display();
	}
}

/*
Output:

EEEEE
DDDD
CCC
BB
A

 */ 

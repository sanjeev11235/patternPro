package character;

public class Pattern13 {

	static void display() {
		char alphabet=65;
		
		for(int i=1; i<=5; i++) {
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
A
BB
CCC
DDDD
EEEEE

*/ 


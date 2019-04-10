package character;

public class Pattern38 {

	static void display() {
		char alphabet =65;
		for(int i=1; i<=5; i++) {
			for(int k=5; k>=i; k--) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print(alphabet);
			}
			alphabet=(char) (2+alphabet);//cannot convert from int to char
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
    CCC
   EEEEE
  GGGGGGG
 IIIIIIIII
*/
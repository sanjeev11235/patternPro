package character;

public class Pattern04 {
	
	//int alphabet=65;
	static char alphabet =65;
	
	static void display() {
		
		for(int i=0; i<5; i++) {
			for(int j=0;j<5; j++) {
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
 
AAAAA
BBBBB
CCCCC
DDDDD
EEEEE
  
 */

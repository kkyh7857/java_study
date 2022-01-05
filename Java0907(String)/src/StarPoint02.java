
public class StarPoint02 {

	public static void main(String[] args) {
		// *    *
		// **  **
		// ******
		// ******
		// **  **
		// *    *

		for (int up = 1, down = 4; down >= 0; up++, down-=2) {
			for (int i = 0; i < up; i++) {
				System.out.print("*");
			}
			for (int i = 0; i < down; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < up; i++) {
				System.out.print("*");
			}System.out.println();
		}
		
		for (int up = 0, down = 3; down >= 1; up+=2, down--) {
			for (int i = 0; i < down; i++) {
				System.out.print("*");
			}
			for (int i = 0; i < up; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < down; i++) {
				System.out.print("*");
			}System.out.println();
			
		}
	}

}


public class StarPoint01 {

	public static void main(String[] args) {

		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 1; i <= 7; i++) { // 몇 번째 줄에서 ex) 1번 줄에서 1번 찍을래 
			for (int j = 1; j <= i; j++) { // 별을 몇번 찍을래?
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}

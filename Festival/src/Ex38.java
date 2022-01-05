import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		// TODO Auto -generated method stub
		//     * 41
		//    *** 33
		//   ***** 25
		//  ******* 17
		// ********* 09
		Scanner sc = new Scanner(System.in);
		System.out.print("ют╥б: ");
		int n = sc.nextInt();

		for (int up = 1, down = n-1; down >= 0; up += 2, down--) {
			for (int i = down; i > 0; i--) {
				System.out.print(" ");
			}
			for (int i = 0; i < up; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}

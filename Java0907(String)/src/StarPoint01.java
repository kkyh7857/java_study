
public class StarPoint01 {

	public static void main(String[] args) {
		// *** *
		// ** **
		// * ***
		// *** *
		// ** **
		// * ***

		for (int up = 1, down = 3; up <= 3; up++, down--) {
			for(int i = 0; i < up; i++) {
				System.out.print(" ");
			}
			for(int i = 0; i < down; i++) {
				System.out.print("*");
			}
			for(int i = 0; i < down; i++) {
				System.out.print(" ");
			}
			for(int i = 0; i < up; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int up = 1, down = 3; up <= 3; up++, down--) {
			for(int i = 0; i < down; i++) {
				System.out.print("*");
			}
			for(int i = 0; i < up; i++) {
				System.out.print(" ");
			}
			for(int i = 0; i < up; i++) {
				System.out.print("*");
			}
			for(int i = 0; i < down; i++) {
				System.out.print(" ");
			}
			System.out.println();
		}

//		for (int space = 1, star = 3; star > 0; space += 2, star -= 2) {
//			for (int i = 0; i < space; i++) {
//				System.out.print(" ");
//			}
//			for (int i = 0; i < star; i++) {
//				System.out.print("*");
//			}
//		}
//		System.out.println();
//		for (int space = 2, star = 2; star > 0; star--) {
//			for (int i = 0; i < 2; i++) {
//				System.out.print(" ");
//			}
//			for (int i = 0; i < 2; i++) {
//				System.out.print("*");
//			}
//		}
//		System.out.println();
//		for (int space = 3, star = 1; space > 0; space -= 2, star += 2) {
//			for (int i = 0; i < space; i++) {
//				System.out.print(" ");
//			}
//			for (int i = 0; i < star; i++) {
//				System.out.print("*");
//			}
//		}
//		System.out.println();
//
//		for (int space = 0, star = 3; star > 0; star -= 2, space++) {
//			for (int i = 0; i < star; i++) {
//				System.out.print("*");
//			}
//			for (int i = 0; i <= space; i++) {
//				System.out.print(" ");
//			}
//		}
//		System.out.println();
//
//		for (int star =2 , space = 2; star > 0; star--) {
//			for (int i = 0; i < 2; i++) {
//				System.out.print("*");
//			}
//			for (int i = 0; i < 2; i++) {
//				System.out.print(" ");
//			}
//		}
//		System.out.println();
//
//		for (int space = 3, star = 1; star <= 3; star += 2, space-=3) {
//			for (int i = 0; i < star; i++) {
//				System.out.print("*");
//			}
//			for (int i = 0; i < space; i++) {
//				System.out.print(" ");
//			}
//		}
//		System.out.println();

	}

}

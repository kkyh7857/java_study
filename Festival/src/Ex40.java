import java.util.Arrays;

public class Ex40 {

	public static void main(String[] args) {
		// 모래시계
		// A B C D E 15
		//   F G H 33
		//     I 51
		//   J K L 33
		// M N O P Q 15
		char[] alpa = new char[17];
		int count = -1;
		for (char i = 0, j = 'A'; i < alpa.length; i++, j++) {
			alpa[i] = j;
		}
		for (int up = 1, down = 5; up <= 5; up += 2, down -= 2) {
			for (int i = 0; i < up; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < down; i++) {
				count = count + 1;
				System.out.print(alpa[count] + " ");
			}
			System.out.println();
		}
		for (int up = 3, down = 3; up <= 5; up += 2, down -= 2) {
			for (int i = 0; i < down; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < up; i++) {
				count = count + 1;
				System.out.print(alpa[count] + " ");
			}
			System.out.println();
		}
		

	}

}

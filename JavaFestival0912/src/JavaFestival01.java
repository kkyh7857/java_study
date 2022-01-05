import java.util.Scanner;

public class JavaFestival01 {

	public static void main(String[] args) {
		// 정수 n을 입력 받아 n*n 배열을 만들어라
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 21 23 24

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력: ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		int count = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = count;
				count++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array[0].length; j++) {
					System.out.print(array[i][j] + "\t");
				}
				System.out.println();
			} else {
				for (int j = n-1; j >= 0; j--) {
					System.out.print(array[i][j] + "\t");
				}
				System.out.println();
			}
		}
	}
}

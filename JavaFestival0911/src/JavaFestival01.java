import java.util.Scanner;

public class JavaFestival01 {

	public static void main(String[] args) {
		// 정수 n을 입력 받아
		// nxn형 배열을 만들고
		// 배열 값으로 1~n까지 출력하라
		//  1  6 11 16 21
		//  2  7 12 17 22
		//  3  8 13 18 23
		//  4  9 14 19 24
		//  5 10 15 20 25

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		int count = 1 ;
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[0].length; j++) {
				array[i][j]=count;
				count++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[j][i]+"\t");
			}System.out.println();
		}
	}
}

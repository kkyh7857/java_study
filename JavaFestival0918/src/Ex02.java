import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 사용자에게 입력 받아 배열의 인덱스의 수 만큼 별을 출력
		// 1~5번째 별의 수 를 받는다.
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		

		for (int i = 0; i < array.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			array[i] = sc.nextInt();
			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ": ");
			for (int j = 0; j < array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

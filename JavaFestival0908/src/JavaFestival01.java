import java.util.Scanner;

public class JavaFestival01 {

	public static void main(String[] args) {
		// 정수 n을 입력 받아 1 2 4 7 11과 같은 수열의 n번째 항까지 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("n 정수 입력: ");
		int n = sc.nextInt();
		int num = 1;
		for (int i = 0; i < n; i++) {
			num = num + i;
			System.out.print(num + " ");
		}

	}

}

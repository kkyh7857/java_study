import java.util.Scanner;

public class JavaFestival02 {

	public static void main(String[] args) {
		// 1보다 큰 정수 n을 입력 하여 n!의 값을 구하라

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력: ");
		int n = sc.nextInt();
		long total = 1;
		for (int i = 1; i <= n; i++) {
			total = total*i;
		}
		System.out.print("출력: " + total);
	}

}

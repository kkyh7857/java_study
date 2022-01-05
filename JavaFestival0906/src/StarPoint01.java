import java.util.Scanner;

public class StarPoint01 {

	public static void main(String[] args) {
		// 행 갯수를 입력 받아 다음과 같이 삼각형을 출력.

		Scanner sc = new Scanner(System.in);
		System.out.print("행 수 입력: ");
		int v = sc.nextInt();
		
		for (int i = 1; i <= v; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

import java.util.Scanner;

public class While실습02 {

	public static void main(String[] args) {
		// 두 수를 입력 받아
		// 두 수의 차를 계산하는 프로그램
		// 두 수가 모두 0이 입력 되면 프로그램 종료

		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;

		while (true) {
			System.out.print("A 숫자: ");
			num1 = sc.nextInt();
			System.out.print("B 숫자: ");
			num2 = sc.nextInt();

			if (num1 == 0 && num2 == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("결과: " + (num1 - num2));

		}

	}

}

import java.util.Scanner;

public class 메소드Ex01 {

	public static void main(String[] args) {
		// 키보드로부터 입력받은 두 개의 정수 인자를 매개변수로 넘겨받아
		// num1에서 num2를 뺀 결과값을 절대값으로 바꾸어 출력하는
		// getValue()메소드를 구현

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력: ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수 입력: ");
		int num2 = sc.nextInt();
		// 메소드 호출
		int result = getValue(num1, num2);
		System.out.println("결과확인: " + result);
		sc.close();
	}

	// 메소드 정의
	public static int getValue(int num1, int num2) {
		int result = num1 - num2;

		if (result < 0) {
			result = -result;
		}

		// int result = Math.abs(num1-num2);
		return result;

	}
}

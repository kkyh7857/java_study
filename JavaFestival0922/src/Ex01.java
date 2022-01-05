import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 2개의 정수를 입력 받아, base, n 제곱 하는 메소드 powerN()
		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과확인: " + result);

	}

	private static int powerN(int base, int n) {
		int result = 1;
		for (int i = 0; i < n; i++) {
			result *= base;
		}
		return result;

//		int result = (int) Math.pow(base, n);
	}

}

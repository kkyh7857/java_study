import java.util.Scanner;

public class Ex01_01 {

	public static void main(String[] args) {
		// 8자리 정수를 입력 받아, 각 자리의 수를 더하라

		Scanner sc = new Scanner(System.in);
		System.out.println("8자리 정수 입력 >> ");
		int eightNum = sc.nextInt();
		int remainder = 0;
		int sum = 0;
		for (int i = 0; i < 8; i++) {
			remainder = eightNum % 10;
			sum += remainder;
			eightNum = eightNum / 10;
		}
		System.out.println("합계 >> " + sum);
	}

}

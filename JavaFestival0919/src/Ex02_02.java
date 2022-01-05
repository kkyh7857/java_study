import java.util.Scanner;

public class Ex02_02 {

	public static void main(String[] args) {
		// 숫자를 입력 받아 2진법으로 표기 하라.

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();
		int num2 = num;
		int count = 0;
		while (true) { // 2로 몇 번 나눠지는 지 알아본다.
						// 이는, 2진법으로 몇자리인지 알아보는 과정이다.
			num /= 2;
			count++;
			if (num == 0) {
				break;
			}
		}
		int[] arr = new int[count];
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = num2 % 2;
			num2 = num2 / 2;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

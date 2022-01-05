import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// 숫자를 입력 받아 n 진법으로 표기 하라.
		// 1. 풀이 방식, 2. 쉬운 방식
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		int num2 = num;
		System.out.print("몇 진법: ");
		int notation = sc.nextInt();
		int count = 0;
		while (true) {
			num = num / notation;
			count++;
			if (num == 0) {
				break;
			}
		}
		int[] array = new int[count];
		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = num2 % notation;
			num2 = num2 / notation;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

//		String num2 = Integer.toBinaryString(num); 2진법
//		String num8 = Integer.toHexString(num); 8진법
//		String num10 = Integer.toOctalString(num); 10진법
//		System.out.println(num1);
	}

}

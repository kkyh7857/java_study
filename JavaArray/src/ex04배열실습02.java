import java.util.Random;
import java.util.Scanner;

public class ex04배열실습02 {

	public static void main(String[] args) {
		// 1차원 정수형 배열 선언 후 임의의 값 초기화
		// 배열의 값 중 홀수인 값이 몇개인지 출력 하는 프로그램 작성

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("얼마? ");
		int num = sc.nextInt();
		int[] array1 = new int[num];
		int count = 0;
		System.out.print("array에 들어있는 홀수는 ");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = rd.nextInt(100) + 1;
			if (array1[i] % 2 == 1) {
				System.out.print(array1[i] + " ");
				count++;
			}

		}
		System.out.print("이며,\n총 " + count + "개 입니다.");
	}

}

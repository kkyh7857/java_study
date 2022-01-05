import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 입력 받은 수 중, 3의 배수 출력

		int[] num = new int[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print(i + 1 + "번째 수 입력: ");
			num[i] = sc.nextInt();
			if (num[i] % 2 == 0) {
				num[count] = num[i];
				count++;
			}
		}
		System.out.print("3의 배수는: " + Arrays.toString(Arrays.copyOf(num, count)));
		// Arrays.toString = 배열을 출력;
		// Arrays.copyOf(num, count) = num 배열에서 index를 count로 바꿔 새로운 배열로 카피 한다. 
		// 단순히 주소값을 카피하는 것이기 때문에, toString과 함께 사용되기도 한다.

	}

}

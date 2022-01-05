import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// 크기가 5인 저수형 배열 array를 만들고
		// 사용자가 입력한 값으로 초기화 시켜주세요

		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "번째 값: ");
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		// Arrays.sort(array);<간단하게 하는 방법도 있음!!!!
		// 이중 포문
		// 버블 정렬>>모든 값과 한번이상 비교를 한다.
		System.out.println();
		System.out.print("오름차순: ");
		for (int i = 0; i < array.length; i++) {
			// 배열의 크기가 5니 총 5개의 숫자를 정렬해야 한다.
			for (int j = 0; j < array.length -1; j++) {
				// 나를 제외 한 나머지와 비교해야 하니, 4번 비교를 하게 된다.
				if (array[j] > array[j + 1]) {
					// 두 값을 비교해 큰 값을 temp에 저장한다.
					//치환  -> 변수 값 바꾸기!!
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}

		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// 선택 정렬

		Scanner sc = new Scanner(System.in);
		// 입력
		int[] array = new int[5];
		// 5칸 배열
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "번째 값: ");
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length - 1; i++) {
			// 배열의 0번이 가장 높다고 가정하고 시작한다.
			// int maxNum = array[i];
			// array[i] 값에 맥스 값을 지정해주지 않아도 됨.[1]번
			// 하나의 인덱스를 maxNumIndex로 저장
			int maxNumIndex = i;

			for (int j = i + 1; j < array.length; j++) { //단순히 큰 값의 인덱스를 찾는 과정
				// 지정한 인덱스의 값과 다른 값들을 비교
				if (array[i] < array[j]) {
					// 비교 중 큰 것을 j에 대입
					maxNumIndex = j; // 가장 큰 값의 인덱스를 maxNumIndex라 부른다.
					// maxNum = array[j];[1]번으로 인해 이 구문도 필요 없음.
				}
			}
			int temp = array[i]; // temp에 array[i] 값는 넣는다
			array[i] = array[maxNumIndex]; //array[i]에 array[maxNumIndex]를 넣는다
			array[maxNumIndex] = temp; // array[manNumIndex]에 temp 값을 넣는다.
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}

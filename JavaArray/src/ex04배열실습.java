import java.util.Random;

public class ex04배열실습 {

	public static void main(String[] args) {
		// 크기가 10인 1차원 정수형 배열을 선언한 후 임의의 값을 초기화 합니다.
		// 배열의 값 중 짝수인 값만 출력하는 프로그램을 작성.

		Random rd = new Random(); // 난수 구하기

		int[] numArray = new int[10]; // 크기가 10인 1차원 정수형 배열 numArray
		
		System.out.print("array에 들어있는 짝수는 ");
		
		for (int i = 0; i < numArray.length; i++) { // 반복문으로 짝수 구하기
			numArray[i] = rd.nextInt(100) + 1;
			if (numArray[i] % 2 == 0) {
				System.out.print(numArray[i] + " ");
			}
		}
		System.out.print("입니다.");
	}
}

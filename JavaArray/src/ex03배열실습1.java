import java.util.Random;

public class ex03배열실습1 {

	public static void main(String[] args) {
		// 크기가 10인 정수형 배열을 생성하고
		// 각각의 자리에 0-19사이의 랜덤한 값 넣기
		// 생성된 배열에 값 출력

		// 크기가 10인 정수형 배열을 생성하고
		int[] array1 = new int[10];
		Random rd = new Random();
		System.out.println("배열의 값은: ");
		// 각각의 자리에 0-19사이의 랜덤한 값 넣기
		for (int i = 0; i < array1.length; i++) {
			array1[i] = rd.nextInt(20);
			// 생성된 배열에 값 출력
			System.out.print(array1[i] + " ");
		}
		System.out.println("이고");
		System.out.println("배열의 크기는 " + array1.length + " 입니다.");

		System.out.println("4번 값: " + array1[4]);
		System.out.println("9번 값: " + array1[9]);
		System.out.println("합: " + (array1[4] + array1[9]));

		// 합 구하기

		// 누적 합을 계산 할 변수 total 만들기
		// 반복문을 통하여 배열에 있는 값을 하나씩 불러와서 total에 누적시키기
		// 반복문이 종료되는 시점에 total 출력.

		float total = 0;

		for (int i = 0; i < array1.length; i++) {
			total += array1[i];
			System.out.print(array1[i]);
			if (i < array1.length - 1) {
				System.out.print("+");
			} else {
				System.out.print("=" + total);
			}
		}
		System.out.println("\n숫자의 총 합은: " + total);

		System.out.println("그 평균은: " + total / array1.length);
	}

}

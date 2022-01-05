import java.util.Scanner;

public class JavaEx04 {

	public static void main(String[] args) {
		// 입력한 점수의 총합과 평균을 출력

		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "번째 수 입력: ");
			score[i] = sc.nextInt();
		}
		System.out.print("입력점수: ");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");

		}
		System.out.println();
		// max, min의 값을 0으로 주지 않는 이유는,
		// 입력 받은 값 중 0보다 작은 값이 없을 수 있기 때문에!!!!
		int max = score[0];
		int min = score[0];
		int total = 0;
		for (int i = 0; i < score.length; i++) {
			total = total + score[i];
			if (max < score[i]) {
				max = score[i];
			}
			if (total / score.length > score[i]) {
				min = score[i];
			}
		}

		System.out.println("최고 점수: " + max);
		System.out.println("최저 점수: " + min);
		System.out.println("총합: " + total);
		System.out.println("평균: " + (double) total / score.length);

	}

}

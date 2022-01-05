import java.util.Scanner;

public class 이차원실습01 {

	public static void main(String[] args) {

		// 3행 5열의 배열 answer를 만들고 다음과 같이 초기화

		// 이클립스에서는
//		int[] num = new int[3];
//		System.out.println(num[0]);

		Scanner sc = new Scanner(System.in);
		int answer[][] = { { 4, 5, 4, 1, 2 }, { 0, 0, 0, 0, 0 }, { 10, 20, 30, 20, 20 } };
		
		int sum = 0;

		for (int i = 0; i < answer[0].length; i++) {
			System.out.print((i + 1) + "번째 답: ");
			answer[1][i] = sc.nextInt();
		}
		System.out.print("정답확인: ");
		for (int i = 0; i < answer[0].length; i++) {
			if (answer[1][i] == answer[0][i]) {
				sum += answer[2][i];
				System.out.print("O ");
			} else {
				System.out.print("X ");
			}
		}
		
		System.out.println();
		System.out.print("총점: " + sum);

	}

}

import java.util.Scanner;

public class �������ǽ�01 {

	public static void main(String[] args) {

		// 3�� 5���� �迭 answer�� ����� ������ ���� �ʱ�ȭ

		// ��Ŭ����������
//		int[] num = new int[3];
//		System.out.println(num[0]);

		Scanner sc = new Scanner(System.in);
		int answer[][] = { { 4, 5, 4, 1, 2 }, { 0, 0, 0, 0, 0 }, { 10, 20, 30, 20, 20 } };
		
		int sum = 0;

		for (int i = 0; i < answer[0].length; i++) {
			System.out.print((i + 1) + "��° ��: ");
			answer[1][i] = sc.nextInt();
		}
		System.out.print("����Ȯ��: ");
		for (int i = 0; i < answer[0].length; i++) {
			if (answer[1][i] == answer[0][i]) {
				sum += answer[2][i];
				System.out.print("O ");
			} else {
				System.out.print("X ");
			}
		}
		
		System.out.println();
		System.out.print("����: " + sum);

	}

}

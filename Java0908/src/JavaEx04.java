import java.util.Scanner;

public class JavaEx04 {

	public static void main(String[] args) {
		// �Է��� ������ ���հ� ����� ���

		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];

		for (int i = 0; i < score.length; i++) {
			System.out.print(i + 1 + "��° �� �Է�: ");
			score[i] = sc.nextInt();
		}
		System.out.print("�Է�����: ");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");

		}
		System.out.println();
		// max, min�� ���� 0���� ���� �ʴ� ������,
		// �Է� ���� �� �� 0���� ���� ���� ���� �� �ֱ� ������!!!!
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

		System.out.println("�ְ� ����: " + max);
		System.out.println("���� ����: " + min);
		System.out.println("����: " + total);
		System.out.println("���: " + (double) total / score.length);

	}

}

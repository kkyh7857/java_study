import java.util.Random;
import java.util.Scanner;

public class ex04�迭�ǽ�02 {

	public static void main(String[] args) {
		// 1���� ������ �迭 ���� �� ������ �� �ʱ�ȭ
		// �迭�� �� �� Ȧ���� ���� ����� ��� �ϴ� ���α׷� �ۼ�

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("��? ");
		int num = sc.nextInt();
		int[] array1 = new int[num];
		int count = 0;
		System.out.print("array�� ����ִ� Ȧ���� ");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = rd.nextInt(100) + 1;
			if (array1[i] % 2 == 1) {
				System.out.print(array1[i] + " ");
				count++;
			}

		}
		System.out.print("�̸�,\n�� " + count + "�� �Դϴ�.");
	}

}

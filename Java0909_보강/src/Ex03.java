import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 1���� ���ڿ��� �迭�� ������ �� '��', '��'���� �ʱ�ȭ.
		// ���ڸ� �Է� �޾� ¦���� ��� "���ڼ���"
		// Ȧ���� ��� "���ڼ��ڼ�"�� ��� �ϴ� ���α׷�

		System.out.println("==== ���� ���� Start! ====");
		System.out.print("���ڸ� �Է����ּ���>> ");
		// ��ĳ�ʸ� ���� �Է� ����
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 1���� ���ڿ��� �迭�� ���� ���� �ʱ�ȭ
		String[] waterMelon = { "��", "��" };

		// �Է� ���� ���ڸ�ŭ �ݺ� �ؾ� �ϱ� ������
		for (int i = 0; i < num; i++) {
			System.out.print(waterMelon[i%2]);//�ε��� Ȱ��
			
			// Ȧ�� �� ��
//			if (i % 2 == 1) {
//				System.out.print(waterMelon[0]);
//			} else { // ¦�� �� ��
//				System.out.print(waterMelon[1]);
//			}
		}
	}
}

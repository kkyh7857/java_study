import java.util.Scanner;

public class While�ǽ�02 {

	public static void main(String[] args) {
		// �� ���� �Է� �޾�
		// �� ���� ���� ����ϴ� ���α׷�
		// �� ���� ��� 0�� �Է� �Ǹ� ���α׷� ����

		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;

		while (true) {
			System.out.print("A ����: ");
			num1 = sc.nextInt();
			System.out.print("B ����: ");
			num2 = sc.nextInt();

			if (num1 == 0 && num2 == 0) {
				System.out.println("���α׷� ����");
				break;
			}
			System.out.println("���: " + (num1 - num2));

		}

	}

}

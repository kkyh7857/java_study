import java.util.Scanner;

public class �޼ҵ�Ex01 {

	public static void main(String[] args) {
		// Ű����κ��� �Է¹��� �� ���� ���� ���ڸ� �Ű������� �Ѱܹ޾�
		// num1���� num2�� �� ������� ���밪���� �ٲپ� ����ϴ�
		// getValue()�޼ҵ带 ����

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է�: ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ���� �Է�: ");
		int num2 = sc.nextInt();
		// �޼ҵ� ȣ��
		int result = getValue(num1, num2);
		System.out.println("���Ȯ��: " + result);
		sc.close();
	}

	// �޼ҵ� ����
	public static int getValue(int num1, int num2) {
		int result = num1 - num2;

		if (result < 0) {
			result = -result;
		}

		// int result = Math.abs(num1-num2);
		return result;

	}
}

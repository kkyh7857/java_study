import java.util.Scanner;

public class While�ǽ�01 {

	public static void main(String[] args) {
		// Ű����κ��� �Է� ���� ���� 10���� ���� ���� ���
		// 10���� ũ�� ���� �Ǿ����ϴ�. ���
		Scanner sc = new Scanner(System.in);
		int num = 0;

		while (num < 10) {
			System.out.print("���� �Է�: ");
			num = sc.nextInt();
		}
		System.out.println("���� �Ǿ����ϴ�.");
		// while���� �� �� �ݺ��ؾ� �ϴ� �� �� �� ����Ѵ�.
//		while (true) {
//			System.out.print("���� �Է�: ");
//			num = sc.nextInt();
//			if (num > 10) {
//				break;
//			}
//		}
		System.out.println("���� �Ǿ����ϴ�.");

	}

}

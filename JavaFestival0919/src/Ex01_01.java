import java.util.Scanner;

public class Ex01_01 {

	public static void main(String[] args) {
		// 8�ڸ� ������ �Է� �޾�, �� �ڸ��� ���� ���϶�

		Scanner sc = new Scanner(System.in);
		System.out.println("8�ڸ� ���� �Է� >> ");
		int eightNum = sc.nextInt();
		int remainder = 0;
		int sum = 0;
		for (int i = 0; i < 8; i++) {
			remainder = eightNum % 10;
			sum += remainder;
			eightNum = eightNum / 10;
		}
		System.out.println("�հ� >> " + sum);
	}

}

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� ���� ���ڸ����� �޾� ���� �ϱ�

		Scanner sc = new Scanner(System.in);
		System.out.print("ù ���� ���� �Է�>> ");
		int num1 = sc.nextInt();
		System.out.print("�� ���� ���� �Է�>> ");
		int num2 = sc.nextInt();
		
		int total = num1 * num2;
		
		for (int j = 0; j < 1; j++) {
			System.out.println(num1 * (num2 % 10));
			num2 = num2 / 10;
		}
		System.out.print(total);
		sc.close();
	}

}

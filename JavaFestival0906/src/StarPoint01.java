import java.util.Scanner;

public class StarPoint01 {

	public static void main(String[] args) {
		// �� ������ �Է� �޾� ������ ���� �ﰢ���� ���.

		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �Է�: ");
		int v = sc.nextInt();
		
		for (int i = 1; i <= v; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
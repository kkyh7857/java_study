import java.util.Scanner;

public class JavaFestival01 {

	public static void main(String[] args) {
		// ���� n�� �Է� �޾� 1 2 4 7 11�� ���� ������ n��° �ױ��� ���

		Scanner sc = new Scanner(System.in);
		System.out.print("n ���� �Է�: ");
		int n = sc.nextInt();
		int num = 1;
		for (int i = 0; i < n; i++) {
			num = num + i;
			System.out.print(num + " ");
		}

	}

}

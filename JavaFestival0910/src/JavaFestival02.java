import java.util.Scanner;

public class JavaFestival02 {

	public static void main(String[] args) {
		// 1���� ū ���� n�� �Է� �Ͽ� n!�� ���� ���϶�

		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�: ");
		int n = sc.nextInt();
		long total = 1;
		for (int i = 1; i <= n; i++) {
			total = total*i;
		}
		System.out.print("���: " + total);
	}

}

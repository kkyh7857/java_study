import java.util.Scanner;

public class ForEx������� {

	public static void main(String[] args) {
		// 2~30������ ����� ���ϼ���.

		Scanner sc = new Scanner(System.in);
		sc.close();
		
		
		
		for (int num = 2; num <= 30; num++) {
			System.out.print(num + "�� ���: ");
			for (int i = 1; i <= num; i++) {
				if (num%i == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

	}

}

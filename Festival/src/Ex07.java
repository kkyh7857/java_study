import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// �� ���� �Է� �޾� �����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� : ");
		int row = sc.nextInt();
		
		for(int i = 0; i<row; i++) {
			for(int st = row; st>i; st--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}

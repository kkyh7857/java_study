import java.util.Scanner;

public class StarPoint03 {

	public static void main(String[] args) {
		// �� ������ �Է� �ް� �Ʒ� �ﰢ�� �����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �� �Է�: ");
		int v = sc.nextInt();
		
		for(int i = v-1, j = 1; j<=v; i--, j++) {
			for(int k = 1; k<=i; k++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

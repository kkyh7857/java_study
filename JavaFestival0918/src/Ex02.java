import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// ����ڿ��� �Է� �޾� �迭�� �ε����� �� ��ŭ ���� ���
		// 1~5��° ���� �� �� �޴´�.
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		

		for (int i = 0; i < array.length; i++) {
			System.out.print(i + "��° ���� �� : ");
			array[i] = sc.nextInt();
			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ": ");
			for (int j = 0; j < array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

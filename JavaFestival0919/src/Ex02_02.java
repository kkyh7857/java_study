import java.util.Scanner;

public class Ex02_02 {

	public static void main(String[] args) {
		// ���ڸ� �Է� �޾� 2�������� ǥ�� �϶�.

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int num = sc.nextInt();
		int num2 = num;
		int count = 0;
		while (true) { // 2�� �� �� �������� �� �˾ƺ���.
						// �̴�, 2�������� ���ڸ����� �˾ƺ��� �����̴�.
			num /= 2;
			count++;
			if (num == 0) {
				break;
			}
		}
		int[] arr = new int[count];
		for (int i = arr.length - 1; i >= 0; i--) {
			arr[i] = num2 % 2;
			num2 = num2 / 2;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

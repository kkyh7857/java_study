import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// ���ڸ� �Է� �޾� n �������� ǥ�� �϶�.
		// 1. Ǯ�� ���, 2. ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�: ");
		int num = sc.nextInt();
		int num2 = num;
		System.out.print("�� ����: ");
		int notation = sc.nextInt();
		int count = 0;
		while (true) {
			num = num / notation;
			count++;
			if (num == 0) {
				break;
			}
		}
		int[] array = new int[count];
		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = num2 % notation;
			num2 = num2 / notation;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

//		String num2 = Integer.toBinaryString(num); 2����
//		String num8 = Integer.toHexString(num); 8����
//		String num10 = Integer.toOctalString(num); 10����
//		System.out.println(num1);
	}

}

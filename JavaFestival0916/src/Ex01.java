import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// �Է� ���� �� ��, 3�� ��� ���

		int[] num = new int[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print(i + 1 + "��° �� �Է�: ");
			num[i] = sc.nextInt();
			if (num[i] % 2 == 0) {
				num[count] = num[i];
				count++;
			}
		}
		System.out.print("3�� �����: " + Arrays.toString(Arrays.copyOf(num, count)));
		// Arrays.toString = �迭�� ���;
		// Arrays.copyOf(num, count) = num �迭���� index�� count�� �ٲ� ���ο� �迭�� ī�� �Ѵ�. 
		// �ܼ��� �ּҰ��� ī���ϴ� ���̱� ������, toString�� �Բ� ���Ǳ⵵ �Ѵ�.

	}

}

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// ũ�Ⱑ 5�� ������ �迭 array�� �����
		// ����ڰ� �Է��� ������ �ʱ�ȭ �����ּ���

		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "��° ��: ");
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		// Arrays.sort(array);<�����ϰ� �ϴ� ����� ����!!!!
		// ���� ����
		// ���� ����>>��� ���� �ѹ��̻� �񱳸� �Ѵ�.
		System.out.println();
		System.out.print("��������: ");
		for (int i = 0; i < array.length; i++) {
			// �迭�� ũ�Ⱑ 5�� �� 5���� ���ڸ� �����ؾ� �Ѵ�.
			for (int j = 0; j < array.length -1; j++) {
				// ���� ���� �� �������� ���ؾ� �ϴ�, 4�� �񱳸� �ϰ� �ȴ�.
				if (array[j] > array[j + 1]) {
					// �� ���� ���� ū ���� temp�� �����Ѵ�.
					//ġȯ  -> ���� �� �ٲٱ�!!
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}

		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}

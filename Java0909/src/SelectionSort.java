import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// ���� ����

		Scanner sc = new Scanner(System.in);
		// �Է�
		int[] array = new int[5];
		// 5ĭ �迭
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "��° ��: ");
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length - 1; i++) {
			// �迭�� 0���� ���� ���ٰ� �����ϰ� �����Ѵ�.
			// int maxNum = array[i];
			// array[i] ���� �ƽ� ���� ���������� �ʾƵ� ��.[1]��
			// �ϳ��� �ε����� maxNumIndex�� ����
			int maxNumIndex = i;

			for (int j = i + 1; j < array.length; j++) { //�ܼ��� ū ���� �ε����� ã�� ����
				// ������ �ε����� ���� �ٸ� ������ ��
				if (array[i] < array[j]) {
					// �� �� ū ���� j�� ����
					maxNumIndex = j; // ���� ū ���� �ε����� maxNumIndex�� �θ���.
					// maxNum = array[j];[1]������ ���� �� ������ �ʿ� ����.
				}
			}
			int temp = array[i]; // temp�� array[i] ���� �ִ´�
			array[i] = array[maxNumIndex]; //array[i]�� array[maxNumIndex]�� �ִ´�
			array[maxNumIndex] = temp; // array[manNumIndex]�� temp ���� �ִ´�.
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}

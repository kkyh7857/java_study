import java.util.Random;

public class ex04�迭�ǽ� {

	public static void main(String[] args) {
		// ũ�Ⱑ 10�� 1���� ������ �迭�� ������ �� ������ ���� �ʱ�ȭ �մϴ�.
		// �迭�� �� �� ¦���� ���� ����ϴ� ���α׷��� �ۼ�.

		Random rd = new Random(); // ���� ���ϱ�

		int[] numArray = new int[10]; // ũ�Ⱑ 10�� 1���� ������ �迭 numArray
		
		System.out.print("array�� ����ִ� ¦���� ");
		
		for (int i = 0; i < numArray.length; i++) { // �ݺ������� ¦�� ���ϱ�
			numArray[i] = rd.nextInt(100) + 1;
			if (numArray[i] % 2 == 0) {
				System.out.print(numArray[i] + " ");
			}
		}
		System.out.print("�Դϴ�.");
	}
}

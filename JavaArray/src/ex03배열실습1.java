import java.util.Random;

public class ex03�迭�ǽ�1 {

	public static void main(String[] args) {
		// ũ�Ⱑ 10�� ������ �迭�� �����ϰ�
		// ������ �ڸ��� 0-19������ ������ �� �ֱ�
		// ������ �迭�� �� ���

		// ũ�Ⱑ 10�� ������ �迭�� �����ϰ�
		int[] array1 = new int[10];
		Random rd = new Random();
		System.out.println("�迭�� ����: ");
		// ������ �ڸ��� 0-19������ ������ �� �ֱ�
		for (int i = 0; i < array1.length; i++) {
			array1[i] = rd.nextInt(20);
			// ������ �迭�� �� ���
			System.out.print(array1[i] + " ");
		}
		System.out.println("�̰�");
		System.out.println("�迭�� ũ��� " + array1.length + " �Դϴ�.");

		System.out.println("4�� ��: " + array1[4]);
		System.out.println("9�� ��: " + array1[9]);
		System.out.println("��: " + (array1[4] + array1[9]));

		// �� ���ϱ�

		// ���� ���� ��� �� ���� total �����
		// �ݺ����� ���Ͽ� �迭�� �ִ� ���� �ϳ��� �ҷ��ͼ� total�� ������Ű��
		// �ݺ����� ����Ǵ� ������ total ���.

		float total = 0;

		for (int i = 0; i < array1.length; i++) {
			total += array1[i];
			System.out.print(array1[i]);
			if (i < array1.length - 1) {
				System.out.print("+");
			} else {
				System.out.print("=" + total);
			}
		}
		System.out.println("\n������ �� ����: " + total);

		System.out.println("�� �����: " + total / array1.length);
	}

}

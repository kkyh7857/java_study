
public class ex02�迭����2 {

	public static void main(String[] args) {

		// �迭 ����, ����, �� ����ֱ⸦ �ѹ��� ����!

		// �迭 ���� �� ��, �迭�� �� ���� �˰� �ִ� ���
		int[] array1 = { 10, 20, 30, 40 };

		// �迭 ���� �� ��, �迭�� �� ���� ��ȣ�� ���
		// int[] array1 = new int[4];

		// �迭�� ũ�� ���
		System.out.println("�迭�� ũ���: " + array1.length);

		// �迭 �ȿ� �ִ� �� ���
		System.out.print("�迭�� ��: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		// �̷��� ��� �� ���� ����.
//		for (int i = 0; i <=array1.length; i++) {
//			if(i == array1.length) {
//				System.out.println("���� ����");
//			}else {
//				System.out.print(array1[i] + " ");
//			}
//		}
		// 4��° �ε����� �ִ� ���� 9��° �ε����� �ִ� �� ���ؼ� ��� ����ϱ�.

	}

}


public class ForExam03 {

	public static void main(String[] args) {
		// 1��~ 9�ܱ��� ���.

		for (int i = 2; i <= 9; i++) { // ù��° ���� �ø�, ���� ���� �ϳ��� ������.
			System.out.print(i + "��: "); // �� ���
			for (int j = 1; j < 10; j++) // �ι�° ���� �ø�
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			System.out.println();

		}
//		int i = 1;
//		while (true) {
//			i++;
//			System.out.print(i + "��: ");
//			int j = 1;
//			while (true) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//				if (j >= 10) {
//					break;
//				}
//			}
//			System.out.println();
//			if (i >= 9) {
//				break;
//			}
//		}
	}
}

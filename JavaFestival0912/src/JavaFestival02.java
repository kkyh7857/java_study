
public class JavaFestival02 {

	public static void main(String[] args) {
		// 5*5 2���� �迭�� ���󿡼� 90�� ������

		int[][] array = new int[5][5];
		int count = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = count;
				count++;
			}
		}
		System.out.println("����");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}System.out.println();
		}
		System.out.println();
		System.out.println("90�� ȸ��");
		for (int j = 4; j >= 0; j--) {
			for (int i = 0; i < array[0].length; i++) {
				System.out.print(array[i][j] + "\t");
			}System.out.println();
		}

	}

}

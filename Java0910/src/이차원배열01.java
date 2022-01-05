
public class 이차원배열01 {

	public static void main(String[] args) {

		int[][] array = new int[5][5]; //5X5배열

		int data = 21;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = data;
				data++;
			}
		}
		for (int j = 0; j < array[0].length; j++) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

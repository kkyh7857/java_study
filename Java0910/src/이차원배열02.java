
public class 이차원배열02 {

	public static void main(String[] args) {
		
		int[][] array = new int[3][4];

		int data = 13;

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				array[row][col] = data;
				data++;
			}
		}
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[0].length; col++) {
				System.out.print(array[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int row = 0; row < array[0].length; row++) {
			for (int col = 2; col >= 0; col--) {
				System.out.print(array[col][row] + "\t");
			}
			System.out.println();
		}
	}
}

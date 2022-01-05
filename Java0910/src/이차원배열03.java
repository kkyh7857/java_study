
public class 이차원배열03 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int data = 21;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = data;
				data++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[j][i] + "\t");
			}System.out.println();
		}
		for(int i = 0; i<17; i++) {
			System.out.print("==");
		}
		System.out.println();
		
		for (int i = 4; i >= 0; i--) {
			for (int j = 4; j >= 0; j--) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}
	}
}
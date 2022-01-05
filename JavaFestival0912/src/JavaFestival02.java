
public class JavaFestival02 {

	public static void main(String[] args) {
		// 5*5 2차원 배열을 정상에서 90도 돌리기

		int[][] array = new int[5][5];
		int count = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = count;
				count++;
			}
		}
		System.out.println("원본");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}System.out.println();
		}
		System.out.println();
		System.out.println("90도 회전");
		for (int j = 4; j >= 0; j--) {
			for (int i = 0; i < array[0].length; i++) {
				System.out.print(array[i][j] + "\t");
			}System.out.println();
		}

	}

}

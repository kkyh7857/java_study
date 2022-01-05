
public class 이차원배열hw {

	public static void main(String[] args) {
		// 5*5배열 만들기
		// 0열에 1,2,3,4,5
		// 1열에 6,7,8,9,10 ... 이렇게
		// 5열까지 뽑기
		int[][] array = new int[5][5];

		int data = 1;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = data;
				data++;
			}
			System.out.println();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

//		int[][] array = new int[5][5];
//
//		int data = 1;
//
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(i + "열: ");
//			for (int j = 0; j < array[0].length; j++) {
//				System.out.print(data + " ");
//				data++;
//			}
//			System.out.println();
//		}
//	}
//}


public class Ex20 {

	public static void main(String[] args) {
		// 2차원 배열 90도 회전
		int num = 1;
		int[][] arr = new int[5][5];
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[0].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		System.out.println("원본");
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("90도 회전");
			for(int j = 4; j>=0; j--) {
				for(int i = 0; i<arr.length; i++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}

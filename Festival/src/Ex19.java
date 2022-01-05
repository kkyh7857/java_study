import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int num = 1;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[0].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		for(int i = 0; i<arr.length; i++) {
			if(i%2==0) {
				for(int j = 0; j<arr[0].length; j++) {
					System.out.print(arr[i][j]+"\t");
				}
			}else {
				for(int j = n-1; j>=0; j-- ) {
					System.out.print(arr[i][j]+"\t");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}

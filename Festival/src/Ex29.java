import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i<arr.length; i++) {
			System.out.print(i+ "번째 별의 수 : ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+": ");
			for(int j = 0; j<arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}

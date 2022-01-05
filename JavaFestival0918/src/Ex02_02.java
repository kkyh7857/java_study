import java.util.Scanner;

public class Ex02_02 {

	public static void main(String[] args) {
		// 사용자에게 입력 받아 배열의 인덱스의 수 만큼 별을 출력
		// 1~5번째 별의 수 를 한번에 받고 출력한다.
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(i+1 + "번째 정수: ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " : ");
			for(int j = 0; j<arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

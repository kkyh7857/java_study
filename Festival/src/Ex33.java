import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int n = sc.nextInt();
		System.out.print("X 입력 >> ");
		int x = sc.nextInt();
		int[] arr = new int[10];
		int count = 0;
		for(int i = 0; i<n; i++) {
			System.out.println(i+1 + "번째 정수 입력 >> ");
			arr[i] = sc.nextInt();
			if(arr[i]<x) {
				arr[count] = arr[i];
				count++;
			}
		}
		System.out.print("결과 >> ");
		for(int i = 0; i<count; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}

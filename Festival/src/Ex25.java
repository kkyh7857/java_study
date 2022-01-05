import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			System.out.print(i+1 + "번째 정수 입력: ");
			arr[i] = sc.nextInt();
			if(arr[i]%3==0) {
				arr[count] = arr[i];
				count++;
			}
		}
		System.out.print("3의 배수: ");
		for(int i = 0; i<count; i++) {
			System.out.print(arr[i] +" ");
		}
		sc.close();
	}

}

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		int num2 = num;
		int count = 0;
		while (true) {
			num = num / 2;
			count++;
			if (num == 0) {
				break;
			}
		}
		int[] arr = new int[count];
		for (int i = count - 1; i >= 0; i--) {
			arr[i] = num2 % 2;
			num2 = num2 / 2;
		}
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}

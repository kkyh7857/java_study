import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 8자리 정수를 입력 받아. 반복문을 활용하여 
		// 입력받은 정수의 합을 구하여 출력하는 
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] array = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
		System.out.print("8자리 정수 입력: ");
		int num = sc.nextInt();
		for(int i = array.length-1; i>=0; i--) {
			int num2 = num/array[i];
			num = num - (num2*array[i]);
			sum += num2;
		}
		System.out.println("합은 " + sum + "입니다.");
	}

}

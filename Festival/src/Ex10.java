import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두 개의 세자리수를 받아 곱셈 하기

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번쨰 숫자 입력>> ");
		int num1 = sc.nextInt();
		System.out.print("두 번쨰 숫자 입력>> ");
		int num2 = sc.nextInt();
		
		int total = num1 * num2;
		
		for (int j = 0; j < 1; j++) {
			System.out.println(num1 * (num2 % 10));
			num2 = num2 / 10;
		}
		System.out.print(total);
		sc.close();
	}

}

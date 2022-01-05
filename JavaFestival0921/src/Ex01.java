import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 입력 받은 숫자를,
		// 대시 문자로 출력하고 싶을 때, 사용되는 대시의 합을 구하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리에 0을 제외한 숫자 입력>> ");
		int num = sc.nextInt();
		
		int[] dasi = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		int sum = 0;
		
		while(true) {
			int num2 = num%10;
			num/=10;
			sum = sum + dasi[num2];
			if(num == 0) {
				break;
			}
		}
		System.out.println("대시(-)의 총 합: " + sum);
	}

}

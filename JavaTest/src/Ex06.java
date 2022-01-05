import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 정수를 입력 받고 각 자리수의 합을 구하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
			
		int sum = 0;
		int num = sc.nextInt();
		while(num!=0) {
			sum += num%10;
			num /= 10;
			}
		System.out.print("각 자리수의 합은 "+sum+"입니다.");
	}

}

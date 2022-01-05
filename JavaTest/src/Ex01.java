import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// 숫자를 입력 받아 10으로 나눈 몫과 나머지
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		
		System.out.println("10으로 나눈 몫: " + num/10);
		System.out.print("10으로 나눈 나머지: " + num%10);
		
		
	}

}

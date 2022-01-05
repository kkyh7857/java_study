import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		// 숫자를 입력받아 10으로 나눈 몫과 나머지를 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		System.out.println("10으로 나눈 몫: " + num/10);
		System.out.print("10으로 나눈 나머지: " + num%10);
		
		
	}

}

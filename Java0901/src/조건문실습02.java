import java.util.Scanner;

public class 조건문실습02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int number = sc.nextInt();
		
		if(number%2 == 0) {
			System.out.print(number + "는 짝수입니다.");
		}
		else {
			System.out.print(number + "는 홀수입니다.");
		}
	}

}

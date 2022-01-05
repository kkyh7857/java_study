import java.util.Scanner;

public class 조건문실습03 {

	public static void main(String[] args) {
		
		//Q. 일의 자리 수에서 반올림 하세요.(반올림->일의 자리 수)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력하세요 ");
//		int number = sc.nextInt();
//		int num2 = number%10;//일의 자리 수
//		if(num2>=5) {
//			number = number - num2 + 10;//일의 자리 반올림
//		}
//		else {
//			number = number - num2;
//		}
//		System.out.println("반올림 수 : " + number);
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력>> ");
		int num1 = sc.nextInt();
		int num2 = num1%10;
		if(num2>=5) {
			num1 = num1 - num2 + 10;
		}
		else {
			num1 = num1 - num2;
		}
		System.out.print("반올림 수>> " + num1);
		
	}

}
		
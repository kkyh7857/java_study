import java.util.Scanner;

public class JavaFestivalEx02 {

	public static void main(String[] args) {
		// 세자리 수 * 세자리 수 
		// 세자리 수 * 세자리 수 중 일의자리
		// 세자리 수 * 세자리 수 중 십의자리
		// 세자리 수 * 세자리 수 중 백의자리
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번 째 숫자 입력: ");
		int firstNum = sc.nextInt();
		System.out.print("두번 째 숫자 입력: ");
		int secondNum = sc.nextInt();
		int total = firstNum*secondNum;
//		if(firstNum>100 && secondNum>100) {
//			System.out.println(firstNum*(secondNum%10));
//			System.out.println(firstNum*(secondNum%100/10));
//			System.out.println(firstNum*(secondNum/100));
//			System.out.println(firstNum*secondNum);
//		}
		for(int i = 0; i<3; i++) {
			System.out.println(firstNum*(secondNum%10));
			secondNum = secondNum/10;
		}
		System.out.println(total);
	}

}

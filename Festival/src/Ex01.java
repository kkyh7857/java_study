import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 반올림 문제
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		if(num%10>5) {
			num = num-num%10+10;
		}else {
			num = num-num%10;
		}
		System.out.println("반올림 수 : " + num);
		sc.close();
	}

}

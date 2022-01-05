import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// 정수를 입력 받아 1의 자리에서 반올림 한 결과 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		if(num%10>=5) {
			num = num - num%10 + 10;
		} else {
			num = num - num%10;
		}
		System.out.println("반올림 수: " + num);

	}

}

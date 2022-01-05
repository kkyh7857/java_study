import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 일한 시간을 입력하고 
		// 8시간 초과 근무는 시급의 1.5배를 준다.
		// 시급은 5000원이다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일 한 시간 입력: ");
		int workTime = sc.nextInt();
		int result = 0;
		if(workTime>8) {
			result = 8*5000+(workTime-8)*7500;  
		}else {
			result = workTime*5000;
		}
		System.out.print("일당: " + result);
	}

}

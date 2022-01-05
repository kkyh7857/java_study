import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		// 시급 계산기
		// 시급:5000원(8시간)
		// 8시간 초과 근무 5000원 *1.5배
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간 입력: ");
		int workTime = sc.nextInt();
		int result = 0;
		if(workTime>8) {
			result = (workTime-8)*7500+40000;
		}else {
			result = workTime*5000;
		}
		System.out.println("총임금은 "+result+"원 입니다.");
	
		
	}

}

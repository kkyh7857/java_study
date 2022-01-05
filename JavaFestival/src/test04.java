import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		// 일한 시간을 입력 받아 총 임금을 시급으로 계산
		// 시급: 5000원 8시간 초과 근무 시 1.5배 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간: ");
		int workTime = sc.nextInt();
		int result;
		if(workTime<=8) {
			result = workTime * 5000;
		}else {
			result = (workTime-8) * 7500 + 40000; 
		}
		System.out.println("총 임금은 " + result + "원 입니다.");
	}

}

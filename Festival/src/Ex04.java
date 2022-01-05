import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 시급
		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간을 입력하세요 :");
		int time = sc.nextInt();
		int result = 0;
		if(time > 8) {
			result = (int) ((time-8)*5000*1.5 + 40000);
			
		}else {
			result = time * 5000;
		}
		System.out.print("총 임금은 " + result + "원 입니다.");
		sc.close();
	}
}

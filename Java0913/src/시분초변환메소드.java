import java.util.Scanner;

public class 시분초변환메소드 {

	public static void main(String[] args) {
		// 메소드 이름 secondToHMS
		// 정수 타입의 초를 입력 받아
		// 시간 분 초의 문자열로 알려주세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력: ");
		int secondTime = sc.nextInt();
		String time = secondToHMS(secondTime);
		System.out.print(time);
	}
	
	public static String secondToHMS(int second) {
		int H = second/3600;
		int M = second%3600/60;
		int S = second%60;
		
		String result = H + "시간 " + M + "분 " + S + "초";
		
		return result;
	}

}

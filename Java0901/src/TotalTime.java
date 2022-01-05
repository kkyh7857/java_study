import java.util.Scanner;

public class TotalTime {

	public static void main(String[] args) {
		
		//초를 입력 받아[시, 분, 초] 형태로 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 : ");
		int totalSecond = sc.nextInt();
		
		int h = totalSecond/3600;
		int m = totalSecond%3600/60;
		int s = totalSecond%60;
		System.out.println(h + "시 " + m + "분 " + s + "초");
		
	}

}

import java.util.Scanner;

public class 조건문01_1 {

	public static void main(String[] args) {
		
		//가위 바위 보
		//1. 가위, 바위, 보 입력-> Scanner로 String 변수인 user라는 변수에 담는다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 입력>> ");
		String user = sc.next();
		
		String cmp ="가위";
		if(user.equals("주먹")) {  //만약 사용자가 주먹을 입력했다면 '승리!'라고 출력! int형 등호 == string형 등호 .equals
			System.out.println("승리!");
		}else if(user.equals("가위")){
			System.out.println("비겼어요");
		}else if(user.equals("보")){
			System.out.println("졌어요ㅜㅜ");
		}
		
	}

}

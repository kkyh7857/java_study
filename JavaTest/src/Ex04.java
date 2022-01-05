import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 로그인 프로그램
		// 아이디 : dldmsql
		// 패스워드 : 1234
		// 일치 할때까지 계속해서 로그인 시도
		// 성공시 종료

		Scanner sc = new Scanner(System.in);

		String id = "dldmsql";
		int pw = 1234;

		while (true) {
			System.out.print("id: ");
			String input_Id = sc.next();
			if(input_Id.equals(id)) {
				System.out.print("pw: ");
				int input_Pw = sc.nextInt();
				if (input_Pw == pw) {
					System.out.println("로그인 성공");
					System.out.print("dldmsql님 환영");
					break;
				} else {
					System.out.println("pw오류");
				}
			} else {
				System.out.println("id 오류");
			}
		}
	}

}
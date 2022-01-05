import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		// id: dldmsql, pw: 1234
		// 일치하지 않을 때 '다시확인하세요'
		// 일치시 dldmsql님 환영합니다. 출력
		Scanner sc = new Scanner(System.in);

		String id = "dldmsql";
		int pw = 1234;

		while (true) {
			System.out.print("id : ");
			String input_id = sc.next();
			System.out.print("pw : ");
			int input_pw = sc.nextInt();
			
			if (input_pw ==pw && input_id.equals(id)) {
				System.out.println("dldmsql님 환영합니다.");
				break;
			} else {
				System.out.println("다시 확인하세요");
			}
		}

	}

}

import java.util.Scanner;

public class 쪽지시험풀이5번 {

	public static void main(String[] args) {
		String id = "dldmsql"; 
		String pw = "1214";
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id: ");
			String input_id = sc.next();
			if(input_id.equals(id)) {
				System.out.println("pw: ");
				String input_pw = sc.next();
				if(input_pw.equals(pw)) {
					System.out.println("dldmsql님 환영합니다.");
					break;
				}else {
					System.out.println("비밀번호를 확인하세요");
				}
			}else {
				System.out.println("id를 다시 확인하세요.");
			}
		}
		sc.close();
	}
}

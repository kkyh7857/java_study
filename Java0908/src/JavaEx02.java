import java.util.Scanner;

public class JavaEx02 {

	public static void main(String[] args) {
		// 회원가입, 로그인, 종료

		Scanner sc = new Scanner(System.in);
		System.out.println("==== 회원관리 시스템 ====");
		//횟수가 정해져 있지 않음
		for(int i = 0; i<1;) { 
			System.out.println("1.회원가입 2.로그인 3.종료");
			int num = sc.nextInt();
					 
			if (num == 1) {
				System.out.println("===회원가입===");
			
			} else if (num == 2) {
				System.out.println("===로그인===");
			
			} else if (num == 3) {
				System.out.println("===종료===");
				break;
			} else {
				System.out.println("===잘못입력===");
			}
		}
		
		while(true) {
			System.out.println("1.회원가입 2.로그인 3.종료");
			int num = sc.nextInt();
					 
			if (num == 1) {
				System.out.println("===회원가입===");
			
			} else if (num == 2) {
				System.out.println("===로그인===");
			
			} else if (num == 3) {
				System.out.println("===종료===");
				break;
			} else {
				System.out.println("===잘못입력===");
			}
		}
	
	}

}

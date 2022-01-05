import java.util.Scanner;

public class 조건문실습04_1 {

	public static void main(String[] args) {
		// 식사시간 1-2시까지
		// 식사시간('시'면 입력) 입력 받아서
		// 1-2사이라면 '식사시간입니다'를 출력
		// 열공, 빡공, 화이팅!을 출력하는 프로그램을 만들어라
		System.out.println("지금은 몇시인가요?");
		
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		
		if(time<2) {
			System.out.println("지금은 식사시간입니다.");
		}else {
			System.out.println("열공 빡공 화이팅!");
		}
	}

}

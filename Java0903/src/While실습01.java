import java.util.Scanner;

public class While실습01 {

	public static void main(String[] args) {
		// 키보드로부터 입력 받은 수가 10보다 작을 때만 출력
		// 10보다 크면 종료 되었습니다. 출력
		Scanner sc = new Scanner(System.in);
		int num = 0;

		while (num < 10) {
			System.out.print("숫자 입력: ");
			num = sc.nextInt();
		}
		System.out.println("종료 되었습니다.");
		// while문은 몇 번 반복해야 하는 지 모를 때 사용한다.
//		while (true) {
//			System.out.print("숫자 입력: ");
//			num = sc.nextInt();
//			if (num > 10) {
//				break;
//			}
//		}
		System.out.println("종료 되었습니다.");

	}

}

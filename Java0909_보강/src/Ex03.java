import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 1차원 문자열형 배열을 선언한 후 '수', '박'으로 초기화.
		// 숫자를 입력 받아 짝수의 경우 "수박수박"
		// 홀수의 경우 "수박수박수"를 출력 하는 프로그램

		System.out.println("==== 수박 게임 Start! ====");
		System.out.print("숫자를 입력해주세요>> ");
		// 스캐너를 통해 입력 받음
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 1차원 문자열형 배열에 수박 으로 초기화
		String[] waterMelon = { "수", "박" };

		// 입력 받은 숫자만큼 반복 해야 하기 때문에
		for (int i = 0; i < num; i++) {
			System.out.print(waterMelon[i%2]);//인덱스 활용
			
			// 홀수 일 때
//			if (i % 2 == 1) {
//				System.out.print(waterMelon[0]);
//			} else { // 짝수 일 때
//				System.out.print(waterMelon[1]);
//			}
		}
	}
}

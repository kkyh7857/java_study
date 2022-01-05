import java.util.Scanner;

public class 조건문실습06 {

	public static void main(String[] args) {

		// 자판기 프로그램
		// 금액을 입력하고 메뉴를 고른 뒤 잔돈을 출력해보세요.

		System.out.println("금액을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt(); // money는 사용자가 넣은 금액

		System.out.println("메뉴를 고르세요");
		System.out.println("1.콜라(800원) 2.생수(500원) 3.비타민워터(1500원)");
		int num = sc.nextInt(); // num사용자가 선택한 메뉴 번호

		int coka = 800;
		int water = 500;
		int vitaWater = 1500;

		if (num == 1) {
			if (money >= coka) { // 돈이 충분한가?
				money = money - coka;// 충분하면
			} else {
				System.out.println("돈이 부족합니다. 잔돈:" + money);// 충분하지 않으면
			}
		} else if (num == 2) {
			if (money >= water) {
				money = money - water;
			} else {
				System.out.println("돈이 부족합니다. 잔돈:" + money);
			}
		} else if (num == 3) {
			if (money >= vitaWater) {
				money = money - vitaWater;
			} else {
				System.out.println("돈이 부족합니다.잔돈:" + money);
			}
		} else {
			System.out.println("잘못 입력 하셨습니다.");
			System.out.println("잔돈: " + money + "원");
		}
		System.out.println("잔돈: " + money);
		// 잔돈 중 천원 오백원 백원으로 나눠주기??
		int chun= money/1000;
		int oh = money%1000/500;
		int beak = money%1000%500/100;
		System.out.println("천원: " + chun + "개");
		System.out.println("오백원: " + oh + "개");
		System.out.println("백원: " + beak + "개");

	}

}

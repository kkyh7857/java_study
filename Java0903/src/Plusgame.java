import java.util.Random;
import java.util.Scanner;

public class Plusgame {

	public static void main(String[] args) {

		// 1~100 사이의 난수 2개를 뽑아 덧셈을 하는 게임.
//		System.out.println("== PLUS GAME ==");
//
//		Random random = new Random();// 난수 뽑기
//		Scanner sc = new Scanner(System.in);
//
//		int num1 = random.nextInt(100) + 1;
//		int num2 = random.nextInt(100) + 1;
//		
//		System.out.print(num1 + "+" + num2 + "=");
//
//		int ans = sc.nextInt(); //정답 입력
//
//		if (ans == num1 + num2) {
//			System.out.println("Success");
//		} else {
//			System.out.println("Fail");
//		}

//		System.out.println("== PLUS GAME ==");
//		Scanner sc = new Scanner(System.in);
//		Random random = new Random();// 난수 뽑기
//		
//		int i = 0;
//		while (true) {
//			int num1 = random.nextInt(100) + 1;
//			int num2 = random.nextInt(100) + 1;
//			
//			System.out.print(num1 + "+" + num2 + ":");
//			int ans = sc.nextInt();
//			if (ans == num1 + num2) {
//				System.out.println("Success");
//			} else {
//				System.out.println("Fail");
//			}
//			++i;
//			if (i == 3) {
//				break;
//			}
//		}
//		System.out.println("끝");

		System.out.println("== PLUS & MINUS GAME ==");

		Random random = new Random();// 난수 뽑기
		Scanner sc = new Scanner(System.in);
		String ans2;

		do {
			System.out.print("1.덧셈 2.뺄셈 ");
			int choice = sc.nextInt();
			int num1 = random.nextInt(100) + 1;
			int num2 = random.nextInt(100) + 1;

			if (choice == 1) {
				System.out.print(num1 + "+" + num2 + "=");
				int ans = sc.nextInt(); // 정답 입력

				if (ans == num1 + num2) {
					System.out.println("Success");
				} else {
					System.out.println("Fail");
				}
			} else if (choice == 2) {
				System.out.print(num1 + "-" + num2 + "=");
				int ans = sc.nextInt(); // 정답 입력

				if (ans == num1 - num2) {
					System.out.println("Success");
				} else {
					System.out.println("Fail");
				}
			}
			System.out.print("계속 하시겠습니까?(Y/N) ");
			ans2 = sc.next();
		} while (ans2.equals("Y") || ans2.equals("y"));
		System.out.println("끝");
	}

}

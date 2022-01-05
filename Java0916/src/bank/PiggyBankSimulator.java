package bank;

import java.util.Scanner;

public class PiggyBankSimulator {

	public static void main(String[] args) {
		
		System.out.println("===== 돼지 저금통 시뮬레이터 =====");
		PiggyBank piggy = new PiggyBank();
		while(true) {
		System.out.println("1.입금하기 2.출금하기 3.잔액확인");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("입금할 금액 입력: ");
				int input_money = sc.nextInt();
				int result_money = piggy.deposit(input_money);
				System.out.println("현재 누적된 금액: " + result_money);
				System.out.println("현재 잔액:" + piggy.getMoney());
			}else if(choice == 2) {
				System.out.println("출금할 금액 입력: ");
				int out_money = sc.nextInt();
				boolean result_money = piggy.withdraw(out_money);
				if(result_money) {
					System.out.println("출금 성공!!");
				}else {
					System.out.println("출금 실패!!");
				}
				System.out.println("현재 잔액:" + piggy.getMoney());
			}else if(choice == 3) {
				int result_money = piggy.getMoney();
				System.out.println("현재 잔액: " + result_money);
			}
			System.out.println("1.처음으로 2.종료");
			int choice2 = sc.nextInt();
			if(choice2 == 2) {
				System.out.println("종료");
				break;
			}
		}

	}

}

package bank;

import java.util.Scanner;

public class PiggyBankSimulator {

	public static void main(String[] args) {
		
		System.out.println("===== ���� ������ �ùķ����� =====");
		PiggyBank piggy = new PiggyBank();
		while(true) {
		System.out.println("1.�Ա��ϱ� 2.����ϱ� 3.�ܾ�Ȯ��");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("�Ա��� �ݾ� �Է�: ");
				int input_money = sc.nextInt();
				int result_money = piggy.deposit(input_money);
				System.out.println("���� ������ �ݾ�: " + result_money);
				System.out.println("���� �ܾ�:" + piggy.getMoney());
			}else if(choice == 2) {
				System.out.println("����� �ݾ� �Է�: ");
				int out_money = sc.nextInt();
				boolean result_money = piggy.withdraw(out_money);
				if(result_money) {
					System.out.println("��� ����!!");
				}else {
					System.out.println("��� ����!!");
				}
				System.out.println("���� �ܾ�:" + piggy.getMoney());
			}else if(choice == 3) {
				int result_money = piggy.getMoney();
				System.out.println("���� �ܾ�: " + result_money);
			}
			System.out.println("1.ó������ 2.����");
			int choice2 = sc.nextInt();
			if(choice2 == 2) {
				System.out.println("����");
				break;
			}
		}

	}

}

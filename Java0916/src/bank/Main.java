package bank;

public class Main {

	public static void main(String[] args) {
		// ���� ������ ����(Object)
		// Ŭ������ ������  = new Ŭ������();
		PiggyBank p1 = new PiggyBank();
		PiggyBank p2 = new PiggyBank();

		int result = p1.deposit(5000);
		System.out.println("p1 ���� �ܾ�: " + result);	
		result = p2.deposit(5000);
		System.out.println("p2 ���� �ܾ�: " + result);
		
		boolean isSussess = p2.withdraw(5000);
		if(isSussess) {
			System.out.println("��� ����!!");
		}else {
			System.out.println("��� ����!!");
		}
		result = p1.getMoney();
		System.out.println("���� �ܾ�: " + result);
		
	}
}

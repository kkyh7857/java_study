package bank;

public class Main {

	public static void main(String[] args) {
		// 돼지 저금통 생성(Object)
		// 클래스명 변수명  = new 클래스명();
		PiggyBank p1 = new PiggyBank();
		PiggyBank p2 = new PiggyBank();

		int result = p1.deposit(5000);
		System.out.println("p1 현재 잔액: " + result);	
		result = p2.deposit(5000);
		System.out.println("p2 현재 잔액: " + result);
		
		boolean isSussess = p2.withdraw(5000);
		if(isSussess) {
			System.out.println("출금 성공!!");
		}else {
			System.out.println("출금 실패!!");
		}
		result = p1.getMoney();
		System.out.println("현재 잔액: " + result);
		
	}
}

package bank;
// 설계팁!
// 메소드는 단순하게 설계! 하나에 하나!
// 스캐너나 프린트는 쓰지 않는 걸 권장한다.-> 다른 곳에서 사용할 때 제약이 생기게 된다.
// 유연하고 가동성 높은 설계

public class PiggyBank {
	// 필드(class)= 기본적으로 private으로 하고 상황에 따라 바꾸자.(데이터 보호) 
	private int money;

	// 메소드(method)
	// 1. 돈을 넣는 기능(deposit)
	// 입력 인자는 정수형 1개 (입력된 돈)
	// 반환타입: 정수형 1개 (현재 저금통에 들어 있는 누적된 금액)
	// public 반환타입 메소드명(입력인자)
	public int deposit(int input_money) {
		money += input_money;
		return money;
	}

	// 2. 돈을 빼내는 기능(withdraw)
	// 입력인자 : 정수 1개(빼고 싶은 금액)
	// 반환타입 : boolean타입(출금에 성공하면 true, 실패하면 false)

	public boolean withdraw(int out_money) {
		if(money-out_money>=0) {
			money -= out_money;
			return true; 			
		}else {
			money = money;
			return false;
		}
	}
	
	// 3. 현재 잔액 확인 기능(getMoney)
	// 입력인자: 필요없음.
	// 반환타입: 정수형 1개 (현재 잔액)
	
	public int getMoney() {
		return money;
	}
}





















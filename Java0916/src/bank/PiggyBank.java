package bank;
// ������!
// �޼ҵ�� �ܼ��ϰ� ����! �ϳ��� �ϳ�!
// ��ĳ�ʳ� ����Ʈ�� ���� �ʴ� �� �����Ѵ�.-> �ٸ� ������ ����� �� ������ ����� �ȴ�.
// �����ϰ� ������ ���� ����

public class PiggyBank {
	// �ʵ�(class)= �⺻������ private���� �ϰ� ��Ȳ�� ���� �ٲ���.(������ ��ȣ) 
	private int money;

	// �޼ҵ�(method)
	// 1. ���� �ִ� ���(deposit)
	// �Է� ���ڴ� ������ 1�� (�Էµ� ��)
	// ��ȯŸ��: ������ 1�� (���� �����뿡 ��� �ִ� ������ �ݾ�)
	// public ��ȯŸ�� �޼ҵ��(�Է�����)
	public int deposit(int input_money) {
		money += input_money;
		return money;
	}

	// 2. ���� ������ ���(withdraw)
	// �Է����� : ���� 1��(���� ���� �ݾ�)
	// ��ȯŸ�� : booleanŸ��(��ݿ� �����ϸ� true, �����ϸ� false)

	public boolean withdraw(int out_money) {
		if(money-out_money>=0) {
			money -= out_money;
			return true; 			
		}else {
			money = money;
			return false;
		}
	}
	
	// 3. ���� �ܾ� Ȯ�� ���(getMoney)
	// �Է�����: �ʿ����.
	// ��ȯŸ��: ������ 1�� (���� �ܾ�)
	
	public int getMoney() {
		return money;
	}
}





















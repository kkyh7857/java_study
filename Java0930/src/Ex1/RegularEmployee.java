package Ex1;

public class RegularEmployee extends Employee{
	protected String empno; //���
	protected String name;  //�̸�
	protected int pay;  //����
	protected int bonus;  //���ʽ�
	
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}
	public int getMoneyPay() {
		return (pay+bonus)/12;
	}
	public void print() {
		System.out.println(this.empno +":"+ this.name +":"+ this.pay);
	}
}

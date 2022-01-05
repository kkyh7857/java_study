package Ex1;

public class RegularEmployee extends Employee{
	protected String empno; //사번
	protected String name;  //이름
	protected int pay;  //연봉
	protected int bonus;  //보너스
	
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

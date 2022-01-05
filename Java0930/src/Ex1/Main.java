package Ex1;

public class Main {

	public static void main(String[] args) {
		RegularEmployee Regular = new RegularEmployee("SMHRD001", "홍O동", 4000, 400);
		Regular.print();
		System.out.println(Regular.getMoneyPay()+"만원");
		TempEmployee Temp = new TempEmployee("SMHRD002", "박O수", 3000); 
		Temp.print();
		System.out.println(Temp.getMoneyPay()+"만원");
	}
}

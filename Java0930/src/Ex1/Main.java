package Ex1;

public class Main {

	public static void main(String[] args) {
		RegularEmployee Regular = new RegularEmployee("SMHRD001", "ȫO��", 4000, 400);
		Regular.print();
		System.out.println(Regular.getMoneyPay()+"����");
		TempEmployee Temp = new TempEmployee("SMHRD002", "��O��", 3000); 
		Temp.print();
		System.out.println(Temp.getMoneyPay()+"����");
	}
}

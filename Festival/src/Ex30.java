import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("8�ڸ� �����Է�: ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 0; i<8; i++) {
			sum += num%10;
			num = num/10;
		}
		System.out.println("���� " + sum + "�Դϴ�.");
		sc.close();
		
	}

}
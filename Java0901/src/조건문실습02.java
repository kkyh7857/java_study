import java.util.Scanner;

public class ���ǹ��ǽ�02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int number = sc.nextInt();
		
		if(number%2 == 0) {
			System.out.print(number + "�� ¦���Դϴ�.");
		}
		else {
			System.out.print(number + "�� Ȧ���Դϴ�.");
		}
	}

}

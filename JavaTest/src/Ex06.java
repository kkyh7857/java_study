import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// ������ �Է� �ް� �� �ڸ����� ���� ���Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
			
		int sum = 0;
		int num = sc.nextInt();
		while(num!=0) {
			sum += num%10;
			num /= 10;
			}
		System.out.print("�� �ڸ����� ���� "+sum+"�Դϴ�.");
	}

}

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// �Է� ���� ���ڸ�,
		// ��� ���ڷ� ����ϰ� ���� ��, ���Ǵ� ����� ���� ���ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		System.out.print("ù�ڸ��� 0�� ������ ���� �Է�>> ");
		int num = sc.nextInt();
		
		int[] dasi = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };
		int sum = 0;
		
		while(true) {
			int num2 = num%10;
			num/=10;
			sum = sum + dasi[num2];
			if(num == 0) {
				break;
			}
		}
		System.out.println("���(-)�� �� ��: " + sum);
	}

}

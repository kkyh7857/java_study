import java.util.Scanner;

public class �޼ҵ�Ex02 {

	public static void main(String[] args) {

		// 2���� ������ �޾� 2���� ���� �� 10�� �� ����� ���� ��ȯ�ϴ� �޼ҵ� close10�� ������
		// (���� �� ���� ��� 10���� ���̰� ���ٸ� 0�� ��ȯ)

		int num1 = 8;
		int num2 = 12;
		int result = close10(num1, num2);
		System.out.println("10�� ����� ��: " + result);
	}

	public static int close10(int num1, int num2) {
		
		int resultNum1 = 10-num1;
		// int resultNum1 = Math.abs(10-num1);
		int resultNum2 = 10-num2;
		// int resultNum2 = Math.abs(10-num2);
		if(resultNum1<0) {
			resultNum1= -resultNum1;
		}
		if(resultNum2<0) {
			resultNum2= -resultNum2;
		}
		if(resultNum1>resultNum2) {
			return num2;
		}else if(resultNum1<resultNum2) {
			return num1;
		}else {
			return 0;
		}
		
	}
}

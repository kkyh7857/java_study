import java.util.Scanner;

public class ���ǹ��ǽ�03 {

	public static void main(String[] args) {
		
		//Q. ���� �ڸ� ������ �ݿø� �ϼ���.(�ݿø�->���� �ڸ� ��)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������ �Է��ϼ��� ");
//		int number = sc.nextInt();
//		int num2 = number%10;//���� �ڸ� ��
//		if(num2>=5) {
//			number = number - num2 + 10;//���� �ڸ� �ݿø�
//		}
//		else {
//			number = number - num2;
//		}
//		System.out.println("�ݿø� �� : " + number);
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�>> ");
		int num1 = sc.nextInt();
		int num2 = num1%10;
		if(num2>=5) {
			num1 = num1 - num2 + 10;
		}
		else {
			num1 = num1 - num2;
		}
		System.out.print("�ݿø� ��>> " + num1);
		
	}

}
		
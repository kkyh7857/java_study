import java.util.Scanner;

public class ���ǹ��ǽ�04 {

	public static void main(String[] args) {
		
		//��ǻ�;� �ʴ� ���� �ð� �Է� �̶�� ���ϸ� ���� ���� �ð��� �Է��Ҳ�
		//�׷� �ʴ� �� ���� workTime�̶�� ������ �����
		//�׸��� workTime�� ��� ���� 8���� ũ�ٸ� 
		//8�ð� ���� ���� �ð� ���ʹ� 5000���� 1.5���� 7500������ �ñ��� �������
		//�� �Ŀ� �� �ϴ��� ������ָ� ��!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ð� �Է�>>");
		int hour = sc.nextInt();
		int hourdon = 5000;	
		int chohourdon = 7500;
		int ildang = 0;
		if(hour>8) {
			ildang=chohourdon*(hour-8)+hourdon*8;
		}
		else {
			ildang = hourdon*8;
		}
		System.out.println("�� �ӱ��� " + ildang +" �Դϴ�.");
		//������ȯ (int)(5000*1.5);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�ð�>> ");
//		int workTime = sc.nextInt();
//		System.out.print("�ñ�?? ");
//		int hourMoney = sc.nextInt();
//
//		int resultMoney;
//		if(workTime>8) {
//			resultMoney = (int)(hourMoney*8 + (workTime-8)*(hourMoney*1.5));//������ȯ>>����*�Ǽ�->���������� ��ȯ
//		}
//		else {
//			resultMoney = workTime * hourMoney;
//		}
//		System.out.println("����� �� �ӱ��� " + resultMoney + "�� �Դϴ�.");
	}
}

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		// �ѱݾ��� �Է� �޾�
		// ����, ��õ��, õ��, �����, ���  ������ ������
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �ݾ� �Է�: ");
		int money = sc.nextInt();
		System.out.println();
		System.out.println("�ܵ� : " + money + "��");
		System.out.println("10,000�� :" + money/10000 + "��");
		System.out.println("5,000�� : " + money%10000/5000 + "��");
		System.out.println("1,000�� : " + money%5000/1000 + "��");
		System.out.println("500�� : " + money%10000%1000/500 + "��");
		System.out.println("100�� : " + money%500/100 + "��");
	}

}

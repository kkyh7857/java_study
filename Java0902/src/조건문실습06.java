import java.util.Scanner;

public class ���ǹ��ǽ�06 {

	public static void main(String[] args) {

		// ���Ǳ� ���α׷�
		// �ݾ��� �Է��ϰ� �޴��� �� �� �ܵ��� ����غ�����.

		System.out.println("�ݾ��� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt(); // money�� ����ڰ� ���� �ݾ�

		System.out.println("�޴��� ������");
		System.out.println("1.�ݶ�(800��) 2.����(500��) 3.��Ÿ�ο���(1500��)");
		int num = sc.nextInt(); // num����ڰ� ������ �޴� ��ȣ

		int coka = 800;
		int water = 500;
		int vitaWater = 1500;

		if (num == 1) {
			if (money >= coka) { // ���� ����Ѱ�?
				money = money - coka;// ����ϸ�
			} else {
				System.out.println("���� �����մϴ�. �ܵ�:" + money);// ������� ������
			}
		} else if (num == 2) {
			if (money >= water) {
				money = money - water;
			} else {
				System.out.println("���� �����մϴ�. �ܵ�:" + money);
			}
		} else if (num == 3) {
			if (money >= vitaWater) {
				money = money - vitaWater;
			} else {
				System.out.println("���� �����մϴ�.�ܵ�:" + money);
			}
		} else {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			System.out.println("�ܵ�: " + money + "��");
		}
		System.out.println("�ܵ�: " + money);
		// �ܵ� �� õ�� ����� ������� �����ֱ�??
		int chun= money/1000;
		int oh = money%1000/500;
		int beak = money%1000%500/100;
		System.out.println("õ��: " + chun + "��");
		System.out.println("�����: " + oh + "��");
		System.out.println("���: " + beak + "��");

	}

}

package Ex02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ���� ���� ��� ���α׷�
		// 1. ��ü������ �����ؼ� ����
		// 2. ��� ������ ����
		// 3. �������� �̿��ؼ� Ȯ���� ���� ���α׷����� ����
		// ������
		// ���� ���(�޼ҵ�)�� ȣ���ϴ��� ��ü�� ���� �ٸ��� �����ϴ� ��
		// ���� Ŭ������ ������ ����Ŭ�������� �ٽ� �����Ͽ� ����ϴ� �� ���� ���������� �� �� �ִ�.

		System.out.println("====���� ���� ����====");
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("[1]�ﰢ�� [2]�簢�� [3]����");
			int chioce = sc.nextInt();
			if (chioce == 1) {
				// 1. ������ �Է�
				System.out.print(Triangle.getName() + "�غ� >> ");
				double base = sc.nextDouble();
				System.out.print(Triangle.getName() + "���� >> ");
				double height = sc.nextDouble();
				// 2. �ﰢ�� ��ü ����
				Triangle Tri = new Triangle(base, height);
				// 3. �ﰢ���� ���� ��� �� ���
				System.out.println(Triangle.getName() + "�� ���̴�: " + Tri.calArea());

			} else if (chioce == 2) {
				// 1. ������ �Է�
				System.out.print(Renctangle.getName()+"���� >> ");
				double width = sc.nextDouble();
				System.out.print(Renctangle.getName()+"���� >> ");
				double height = sc.nextDouble();
				// 2. �簢�� ��ü ����
				Renctangle Renc = new Renctangle(width, height);
				// 3. �簢���� ���� ��� �� ���
				System.out.println(Renctangle.getName()+"�� ���̴�: " + Renc.calArea());

			} else if (chioce == 3) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}
	}
}

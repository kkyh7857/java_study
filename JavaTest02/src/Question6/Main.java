package Question6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StoreController s = new StoreController();
		
		while (true) {
			System.out.println("[1]���������� [2]�̿�Ǻ��� [3]�󼼺��� [4]�������� [5����]");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("====����������====");
				s.printRest();
			} else if (choice == 2) {
				System.out.println("====�̿�Ǻ���====");
				s.printSal();
			} else if (choice == 3) {
				System.out.println("====�󼼺���====");
				System.out.println("���Ը� �Է� :");
				String name = sc.next();
				s.getStore(name);
			} else if (choice == 4) {
				s.getGrade();
			} else if (choice == 5) {
				break;
			} else {
				System.out.println("��Ȯ�� ���ڸ� �Է����ּ���");
			}

		}
	}

}

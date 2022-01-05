package VendingMachine;

import java.util.Scanner;

public class VendingMachineSimulator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		VendingMachine vm = new VendingMachine(); // VendingMachine ��ü ����

		
		System.out.println("==== �ڵ��������'s ���Ǳ� ====");

		while (true) {

			System.out.println("[1]manager [else]customer");
			int user = sc.nextInt();

			if (user == 1) {
				System.out.println("-----manager-----");

				while (true) {
					System.out.println("[1]���ᱳü [2]���ݺ��� [3]����");
					int manager_choice = sc.nextInt();
					if (manager_choice == 1) {
						System.out.println("--------  ���� ��ü  --------");
						System.out.println(vm.printMenu());

						System.out.print("��ü �Ͻ� ������ ��ȣ�� ������ �ּ���: ");
						int index = sc.nextInt();
						System.out.println("������ �̸��� �Է��� �ּ���: ");
						String new_drink = sc.next();
						vm.drink[index - 1] = new_drink;
						System.out.println("���� ������ �Է��� �ּ���: ");
						int new_price = sc.nextInt();
						vm.price[index - 1] = new_price;
						System.out.println(">>");
						System.out.println(vm.printMenu() + "\n--------  ���� ��ü �Ϸ� --------\n");

					} else if (manager_choice == 2) {
						System.out.println("--------  ���� ����  --------");
						System.out.println(vm.printMenu());
						System.out.print("��ü �Ͻ� ������ ��ȣ�� ������ �ּ���: ");
						int index = sc.nextInt();
						System.out.println("���ο� ������ �Է��� �ּ���: ");
						int new_price = sc.nextInt();
						vm.price[index - 1] = new_price;
						System.out.println(">>");
						System.out.println(vm.printMenu() + "\n--------  ���� ���� ��ü �Ϸ� --------\n");

					} else {
						System.out.println("�ٽ� �������ּ���.");
					}
				}
			} else {
				System.out.println("-----custemor-----");

				System.out.println("���� �־��ּ���.");
				int money = sc.nextInt();

				while (true) {
					boolean tOrF = vm.showMenu(money);
					// �Աݾ��� 1500�� �̻� �� ��
					if (tOrF) {
						System.out.print("���Ḧ �������ּ���: ");
						int choice = sc.nextInt();

						if (choice <= 4 && choice >= 1) {
							if (money - vm.drinkPrice(choice) >= 0) {
								System.out.println(vm.drinkName(choice));
								money = money - vm.drinkPrice(choice);
								System.out.println("�ܾ�: " + money);
							}
						} //1~4�̿��� ������ �� ��� 
						else {
							System.out.println("���Ǳ⿡ �������� �ʴ� ��ȣ �Դϴ�. �ٽ� �������ּ���.");
						}
					}
					// �Աݾ��� 1500�� �̸� �� ��
					else {
						System.out.println("�ݾ��� �����մϴ�.");
					}
					// �ǻ縦 ���
					System.out.println("\n��ȯ�� ���Ͻø� 0, ");
					if(money>1500){
						System.out.println("�߰� ������ �Ͻ÷��� 1,");
					}
					System.out.println("�߰� �Ա��� ���Ͻø� �ݾ��� �Է����ּ���.\n"); 

					// �����Ͽ� �Է�
					int re_money = sc.nextInt();
					if(re_money == 0) {
						System.out.println("�ܾ� "+money+"�� ��ȯ�մϴ�.");
						break;
					}else if(re_money == 1) {
						System.out.println();
					}else {
						money += re_money;
						System.out.println("���� �ܾ� "+money+"�� ��ȯ�մϴ�.");

					}
					System.out.println();
				}

			}
			System.out.println("---- [0]�׸��ϱ� [else]����ϱ� ----");
			int continu_vending = sc.nextInt();
			if(continu_vending == 0) {
				break;
			}
			sc.close();
		}

	}

}

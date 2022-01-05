package VendingMachine;

import java.util.Scanner;

public class VendingMachineSimulator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		VendingMachine vm = new VendingMachine(); // VendingMachine 객체 생성

		
		System.out.println("==== 코딩어떻게하조's 자판기 ====");

		while (true) {

			System.out.println("[1]manager [else]customer");
			int user = sc.nextInt();

			if (user == 1) {
				System.out.println("-----manager-----");

				while (true) {
					System.out.println("[1]음료교체 [2]가격변경 [3]종료");
					int manager_choice = sc.nextInt();
					if (manager_choice == 1) {
						System.out.println("--------  음료 교체  --------");
						System.out.println(vm.printMenu());

						System.out.print("교체 하실 음료의 번호를 선택해 주세요: ");
						int index = sc.nextInt();
						System.out.println("음료의 이름을 입력해 주세요: ");
						String new_drink = sc.next();
						vm.drink[index - 1] = new_drink;
						System.out.println("음료 가격을 입력해 주세요: ");
						int new_price = sc.nextInt();
						vm.price[index - 1] = new_price;
						System.out.println(">>");
						System.out.println(vm.printMenu() + "\n--------  음료 교체 완료 --------\n");

					} else if (manager_choice == 2) {
						System.out.println("--------  가격 변경  --------");
						System.out.println(vm.printMenu());
						System.out.print("교체 하실 음료의 번호를 선택해 주세요: ");
						int index = sc.nextInt();
						System.out.println("새로운 가격을 입력해 주세요: ");
						int new_price = sc.nextInt();
						vm.price[index - 1] = new_price;
						System.out.println(">>");
						System.out.println(vm.printMenu() + "\n--------  음료 가격 교체 완료 --------\n");

					} else {
						System.out.println("다시 선택해주세요.");
					}
				}
			} else {
				System.out.println("-----custemor-----");

				System.out.println("돈을 넣어주세요.");
				int money = sc.nextInt();

				while (true) {
					boolean tOrF = vm.showMenu(money);
					// 입금액이 1500원 이상 일 때
					if (tOrF) {
						System.out.print("음료를 선택해주세요: ");
						int choice = sc.nextInt();

						if (choice <= 4 && choice >= 1) {
							if (money - vm.drinkPrice(choice) >= 0) {
								System.out.println(vm.drinkName(choice));
								money = money - vm.drinkPrice(choice);
								System.out.println("잔액: " + money);
							}
						} //1~4이외의 선택을 할 경우 
						else {
							System.out.println("자판기에 존재하지 않는 번호 입니다. 다시 선택해주세요.");
						}
					}
					// 입금액이 1500원 미만 일 때
					else {
						System.out.println("금액이 부족합니다.");
					}
					// 의사를 물어봄
					System.out.println("\n반환을 원하시면 0, ");
					if(money>1500){
						System.out.println("추가 선택을 하시려면 1,");
					}
					System.out.println("추가 입금을 원하시면 금액을 입력해주세요.\n"); 

					// 선택하여 입력
					int re_money = sc.nextInt();
					if(re_money == 0) {
						System.out.println("잔액 "+money+"을 반환합니다.");
						break;
					}else if(re_money == 1) {
						System.out.println();
					}else {
						money += re_money;
						System.out.println("현재 잔액 "+money+"을 반환합니다.");

					}
					System.out.println();
				}

			}
			System.out.println("---- [0]그만하기 [else]계속하기 ----");
			int continu_vending = sc.nextInt();
			if(continu_vending == 0) {
				break;
			}
			sc.close();
		}

	}

}

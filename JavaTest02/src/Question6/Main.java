package Question6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StoreController s = new StoreController();
		
		while (true) {
			System.out.println("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5종료]");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("====음식점보기====");
				s.printRest();
			} else if (choice == 2) {
				System.out.println("====미용실보기====");
				s.printSal();
			} else if (choice == 3) {
				System.out.println("====상세보기====");
				System.out.println("가게명 입력 :");
				String name = sc.next();
				s.getStore(name);
			} else if (choice == 4) {
				s.getGrade();
			} else if (choice == 5) {
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요");
			}

		}
	}

}

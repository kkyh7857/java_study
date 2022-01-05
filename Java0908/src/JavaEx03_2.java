import java.util.Scanner;

public class JavaEx03_2 {

	public static void main(String[] args) {
		// 1.회원가입 2.로그인 3.종료
		// id, pw배열을 만들어 회원가입을 하고, 로그인 할 수 있게 만들기

		Scanner sc = new Scanner(System.in);
		System.out.println("====회원관리 시스템====");

		String[] id_array = new String[3];
		String[] pw_array = new String[3];

		int i = 0;
		while (true) {
			System.out.println("1.회원가입 2.로그인 3.종료");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println("====회원가입====");
				System.out.print("id 입력: ");
				id_array[i] = sc.next();
				
				System.out.print("pw 입력: ");
				pw_array[i] = sc.next();
				
				i++;
				
				System.out.println("====가입 성공====");
				
			} else if (choice == 2) {
				
				System.out.println("====로그인====");

				System.out.print("id 입력: ");
				String input_id = sc.next();

				System.out.print("pw 입력: ");
				String input_pw = sc.next();

				int count = 0;

				for (int j = 0; j < id_array.length; j++) {
					if (id_array[j].equals(input_id) && pw_array[j].equals(input_pw)) {
						System.out.println("====로그인 성공====");
						count++;
					}
				}
				if (count == 0) {
					System.out.println("====로그인 실패====");
				}

			} else if (choice == 3) {
				System.out.println("====종료====");
				break;
			} else {
				System.out.println("잘못 입력");
				
			}
		}

	}

}

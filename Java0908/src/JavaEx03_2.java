import java.util.Scanner;

public class JavaEx03_2 {

	public static void main(String[] args) {
		// 1.ȸ������ 2.�α��� 3.����
		// id, pw�迭�� ����� ȸ�������� �ϰ�, �α��� �� �� �ְ� �����

		Scanner sc = new Scanner(System.in);
		System.out.println("====ȸ������ �ý���====");

		String[] id_array = new String[3];
		String[] pw_array = new String[3];

		int i = 0;
		while (true) {
			System.out.println("1.ȸ������ 2.�α��� 3.����");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println("====ȸ������====");
				System.out.print("id �Է�: ");
				id_array[i] = sc.next();
				
				System.out.print("pw �Է�: ");
				pw_array[i] = sc.next();
				
				i++;
				
				System.out.println("====���� ����====");
				
			} else if (choice == 2) {
				
				System.out.println("====�α���====");

				System.out.print("id �Է�: ");
				String input_id = sc.next();

				System.out.print("pw �Է�: ");
				String input_pw = sc.next();

				int count = 0;

				for (int j = 0; j < id_array.length; j++) {
					if (id_array[j].equals(input_id) && pw_array[j].equals(input_pw)) {
						System.out.println("====�α��� ����====");
						count++;
					}
				}
				if (count == 0) {
					System.out.println("====�α��� ����====");
				}

			} else if (choice == 3) {
				System.out.println("====����====");
				break;
			} else {
				System.out.println("�߸� �Է�");
				
			}
		}

	}

}

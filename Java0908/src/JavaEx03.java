import java.util.Scanner;

public class JavaEx03 {

	public static void main(String[] args) {
		// 1.ȸ������ 2.�α��� 3.����
		// id, pw�迭�� ����� ȸ�������� �ϰ�, �α��� �� �� �ְ� �����

		Scanner sc = new Scanner(System.in);
		System.out.println("====ȸ������ �ý���====");
		String[] id_array = new String[3];
		String[] pw_array = new String[3];

		int i = 0; // �迭�� �ʱⰪ�� 0;
		
		while (true) {
			System.out.println("1.ȸ������ 2.�α��� 3.����");
			int choice = sc.nextInt();
			
			if (choice == 1) { // 1.ȸ������
				System.out.print("id �Է�: ");
				id_array[i] = sc.next(); //0~�迭�� ũ����� �ε����� id�� �Է�

				System.out.print("pw �Է�: ");
				pw_array[i] = sc.next(); //0~�迭�� ũ����� �ε����� pw�� �Է�
				
				i++; //0~ �ε��� ��ȣ ����
				
				System.out.println("====ȸ������ ����====");

			} else if (choice == 2) { // 2.�α���

				System.out.print("id �Է�: ");
				String input_id = sc.next();

				System.out.print("pw �Է�: ");
				String input_pw = sc.next();
				
				int count = 0;
				// �ε��� j�� id_array�� ũ�⸸ŭ for������ �ݺ��� ������, if������ ������ �����.
				// �ǹ�: �� ������, ���� �Է��� ���� id_array�� pw_array�� �ִ��� ã�� �����̴�. 
				for (int j = 0; j < id_array.length; j++) { //�� �κ��� �ſ� �߿��ϴ�.�ڡڡڡڡ�
					if (id_array[j].equals(input_id) && pw_array[j].equals(input_pw)) {
						System.out.println("====�α��� ����====");
						count++;
					} 
				}
			
				if( count == 0) { //count�� 0�̶�� -> ���� if���� �������� �ʾҴٸ�, �� �α��� ������ ����.
					System.out.println("�α��� ���� ����");
				}
			} else if (choice == 3) { // 3.����
				System.out.println("====���α׷� ����====");
				break;
			} else {
				System.out.println("�߸� �Է�");
			}
		}
	}
}










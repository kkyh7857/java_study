import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// �α��� ���α׷�
		// ���̵� : dldmsql
		// �н����� : 1234
		// ��ġ �Ҷ����� ����ؼ� �α��� �õ�
		// ������ ����

		Scanner sc = new Scanner(System.in);

		String id = "dldmsql";
		int pw = 1234;

		while (true) {
			System.out.print("id: ");
			String input_Id = sc.next();
			if(input_Id.equals(id)) {
				System.out.print("pw: ");
				int input_Pw = sc.nextInt();
				if (input_Pw == pw) {
					System.out.println("�α��� ����");
					System.out.print("dldmsql�� ȯ��");
					break;
				} else {
					System.out.println("pw����");
				}
			} else {
				System.out.println("id ����");
			}
		}
	}

}
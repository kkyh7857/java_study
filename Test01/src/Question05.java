import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		// id: dldmsql, pw: 1234
		// ��ġ���� ���� �� '�ٽ�Ȯ���ϼ���'
		// ��ġ�� dldmsql�� ȯ���մϴ�. ���
		Scanner sc = new Scanner(System.in);

		String id = "dldmsql";
		int pw = 1234;

		while (true) {
			System.out.print("id : ");
			String input_id = sc.next();
			System.out.print("pw : ");
			int input_pw = sc.nextInt();
			
			if (input_pw ==pw && input_id.equals(id)) {
				System.out.println("dldmsql�� ȯ���մϴ�.");
				break;
			} else {
				System.out.println("�ٽ� Ȯ���ϼ���");
			}
		}

	}

}

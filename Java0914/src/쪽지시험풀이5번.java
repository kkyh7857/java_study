import java.util.Scanner;

public class ��������Ǯ��5�� {

	public static void main(String[] args) {
		String id = "dldmsql"; 
		String pw = "1214";
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id: ");
			String input_id = sc.next();
			if(input_id.equals(id)) {
				System.out.println("pw: ");
				String input_pw = sc.next();
				if(input_pw.equals(pw)) {
					System.out.println("dldmsql�� ȯ���մϴ�.");
					break;
				}else {
					System.out.println("��й�ȣ�� Ȯ���ϼ���");
				}
			}else {
				System.out.println("id�� �ٽ� Ȯ���ϼ���.");
			}
		}
		sc.close();
	}
}

import java.util.Scanner;

public class ���ǹ�01_1 {

	public static void main(String[] args) {
		
		//���� ���� ��
		//1. ����, ����, �� �Է�-> Scanner�� String ������ user��� ������ ��´�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� �Է�>> ");
		String user = sc.next();
		
		String cmp ="����";
		if(user.equals("�ָ�")) {  //���� ����ڰ� �ָ��� �Է��ߴٸ� '�¸�!'��� ���! int�� ��ȣ == string�� ��ȣ .equals
			System.out.println("�¸�!");
		}else if(user.equals("����")){
			System.out.println("�����");
		}else if(user.equals("��")){
			System.out.println("�����̤�");
		}
		
	}

}

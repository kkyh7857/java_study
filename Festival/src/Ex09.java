import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		// �� ���� �Է� �ް�, ��������� ����� ���� �Է� �޾� �׷��� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �� �Է�: ");
		int dan = sc.nextInt();
		System.out.println("��� ������ ���: ");
		int wantNum = sc.nextInt();
		
		System.out.println(dan + "��");
		for(int i = 1; i<=wantNum; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		sc.close();
	}

}

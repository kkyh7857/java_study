import java.util.Scanner;

public class JavaFestivalEx01 {

	public static void main(String[] args) {
		// ���ϴ� ���� �Է� �ϰ� �� ���� ���ϴµ�
		// �� �� �� �Է��� �������� ������ ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ܼ� ����: ");
		int dan = sc.nextInt();
		System.out.print("���ϴ� �� �Է�: ");
		int wantNum = sc.nextInt();
		
		System.out.println(dan+"��");
		
		for(int j = 1; j<=wantNum; j++) {
			System.out.println(dan+"*"+j+"="+dan*j);
		}
	}

}

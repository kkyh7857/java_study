import java.util.Scanner;

public class ���ǹ��ǽ�04_1 {

	public static void main(String[] args) {
		// �Ļ�ð� 1-2�ñ���
		// �Ļ�ð�('��'�� �Է�) �Է� �޾Ƽ�
		// 1-2���̶�� '�Ļ�ð��Դϴ�'�� ���
		// ����, ����, ȭ����!�� ����ϴ� ���α׷��� ������
		System.out.println("������ ����ΰ���?");
		
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		
		if(time<2) {
			System.out.println("������ �Ļ�ð��Դϴ�.");
		}else {
			System.out.println("���� ���� ȭ����!");
		}
	}

}

import java.util.Scanner;

public class switch01 {

	public static void main(String[] args) {
		
		//���� �Է� �޾� ��, ����, ����, �ܿ� �߿� �´� ������ ���
		// �ܿ� 12,1,2
		// �� 3,4,5
		// ���� 6,7,8
		// ���� 9,10,11
		
		System.out.print("���� �Է����ּ���>>");
		Scanner sc = new Scanner(System.in);
		int month =sc.nextInt();
		//������ �κ� �巹�� ctrl + alt + ����Ű: ���� 
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ�");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;
		default:
			System.out.println("1~12������ ���ڸ� �Է����ּ���!");
			break;
		}
		
	}

}

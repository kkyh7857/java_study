import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// ���� �����Կ� ��ǥ �����Ը� �Է� �޾�
		// �� �� ���� �����Ը� �Է� �޾� 
		// ��ǥ �޼� �� ���� �޽��� �Է� �� ����
	
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ : ");
		int nowkg = sc.nextInt();
		System.out.print("��ǥ ������ : ");
		int wantkg = sc.nextInt();
		
		int week = 1;
//		do {
//			System.out.print(week + "���� ���� ������ : ");
//			int losskg = sc.nextInt();
//			nowkg = nowkg - losskg;
//			week++;
//			
//		}while(nowkg > wantkg);
//		
//		System.out.println(nowkg + "kg �޼�!! �����մϴ�!");
		
		while(true) {
			System.out.print(week + "���� ���� ������ : ");
			int losskg = sc.nextInt();
			nowkg = nowkg - losskg;
			week++;
			if(nowkg <= wantkg) {
				break;
			}
		}
		System.out.println(nowkg + "kg �޼�!! �����մϴ�!");	
	}

}

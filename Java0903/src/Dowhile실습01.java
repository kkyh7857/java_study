import java.util.Scanner;

public class Dowhile�ǽ�01 {

	public static void main(String[] args) {

		// ���� �����Կ� ��ǥ�����Ը� �Է� �ް� 
		// ���� �� ���� �����Ը� �Է� �޾�.
		// ��ǥ�����Ը� �޼��ϸ� �����Ѵٴ� ������ ���. ���α׷� ����.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������: ");
		int weight = sc.nextInt();
		System.out.print("��ǥ ������: ");
		int goalWeight = sc.nextInt();
		int n = 1;//�� �������� �˱� ���� ����
		do {//�� ���� ����
			
			System.out.print(n+"���� ���� ������: ");
			int gam = sc.nextInt();//����
			weight = weight - gam;//���� ������ ����
			n++;

		}while(weight>goalWeight);
			
		System.out.println(weight+"kg �޼�!! �����մϴ�!");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("���� ������: ");
//		int nowkg = sc.nextInt();
//		System.out.print("��ǥ ������: ");
//		int wantkg = sc.nextInt();
//		int week = 1;
//		
//		while(true) {
//			System.out.println(week+"���� ���� ������: ");
//			int losskg = sc.nextInt();
//			nowkg = nowkg - losskg;
//			week++;
//			if(nowkg<wantkg) {
//				break;
//			}
//		}
//		System.out.println(nowkg+"�޼�!! �����մϴ�!");
	}

}

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// ������ ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��������� : ");
		int nowkg = sc.nextInt();
		System.out.print("��ǥ������ : ");
		int wantkg = sc.nextInt();
		int i = 0;
		while(true) {
			System.out.print(i+1 + "���� ���� ������: ");
			int losskg = sc.nextInt();
			nowkg = nowkg - losskg;
			if(nowkg <= wantkg) {
				System.out.print(nowkg + "kg �޼�!! �����մϴ�!");
				break;
			}else {
				i++;
			}
		}
		sc.close();
	}

}

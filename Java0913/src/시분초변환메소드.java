import java.util.Scanner;

public class �ú��ʺ�ȯ�޼ҵ� {

	public static void main(String[] args) {
		// �޼ҵ� �̸� secondToHMS
		// ���� Ÿ���� �ʸ� �Է� �޾�
		// �ð� �� ���� ���ڿ��� �˷��ּ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է�: ");
		int secondTime = sc.nextInt();
		String time = secondToHMS(secondTime);
		System.out.print(time);
	}
	
	public static String secondToHMS(int second) {
		int H = second/3600;
		int M = second%3600/60;
		int S = second%60;
		
		String result = H + "�ð� " + M + "�� " + S + "��";
		
		return result;
	}

}

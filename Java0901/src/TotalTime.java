import java.util.Scanner;

public class TotalTime {

	public static void main(String[] args) {
		
		//�ʸ� �Է� �޾�[��, ��, ��] ���·� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int totalSecond = sc.nextInt();
		
		int h = totalSecond/3600;
		int m = totalSecond%3600/60;
		int s = totalSecond%60;
		System.out.println(h + "�� " + m + "�� " + s + "��");
		
	}

}

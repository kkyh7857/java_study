import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// �ñ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ð��� �Է��ϼ��� :");
		int time = sc.nextInt();
		int result = 0;
		if(time > 8) {
			result = (int) ((time-8)*5000*1.5 + 40000);
			
		}else {
			result = time * 5000;
		}
		System.out.print("�� �ӱ��� " + result + "�� �Դϴ�.");
		sc.close();
	}
}

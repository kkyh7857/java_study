import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		// �ñ� ����
		// �ñ�:5000��(8�ð�)
		// 8�ð� �ʰ� �ٹ� 5000�� *1.5��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ð� �Է�: ");
		int workTime = sc.nextInt();
		int result = 0;
		if(workTime>8) {
			result = (workTime-8)*7500+40000;
		}else {
			result = workTime*5000;
		}
		System.out.println("���ӱ��� "+result+"�� �Դϴ�.");
	
		
	}

}

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// ���� �ð��� �Է��ϰ� 
		// 8�ð� �ʰ� �ٹ��� �ñ��� 1.5�踦 �ش�.
		// �ñ��� 5000���̴�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �� �ð� �Է�: ");
		int workTime = sc.nextInt();
		int result = 0;
		if(workTime>8) {
			result = 8*5000+(workTime-8)*7500;  
		}else {
			result = workTime*5000;
		}
		System.out.print("�ϴ�: " + result);
	}

}

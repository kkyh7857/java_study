import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		// ���� �ð��� �Է� �޾� �� �ӱ��� �ñ����� ���
		// �ñ�: 5000�� 8�ð� �ʰ� �ٹ� �� 1.5�� 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ð�: ");
		int workTime = sc.nextInt();
		int result;
		if(workTime<=8) {
			result = workTime * 5000;
		}else {
			result = (workTime-8) * 7500 + 40000; 
		}
		System.out.println("�� �ӱ��� " + result + "�� �Դϴ�.");
	}

}

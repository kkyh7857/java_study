import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		// ���̸� �Է� �޾� 
		// �ʳ�(0~40), �߳�(41~60), ���(61~)���� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�: ");
		int age = sc.nextInt();
		
		if(age<=40) {
			System.out.print("�ʳ�");
		}else if(age<=60) {
			System.out.print("�߳�");
		}else {
			System.out.print("���");
		}
		
	}
}

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// ���ڸ� �Է� �޾� 10���� ���� ��� ������
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է�: ");
		int num = sc.nextInt();
		
		System.out.println("10���� ���� ��: " + num/10);
		System.out.print("10���� ���� ������: " + num%10);
		
		
	}

}

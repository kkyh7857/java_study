import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		// ������ �Է� �޾� 1�� �ڸ����� �ݿø� �� ��� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�: ");
		int num = sc.nextInt();
		if(num%10>=5) {
			num = num - num%10 + 10;
		} else {
			num = num - num%10;
		}
		System.out.println("�ݿø� ��: " + num);

	}

}

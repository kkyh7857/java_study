import java.util.Scanner;

public class ���ڿ��ּ� {

	public static void main(String[] args) {
		// ���ͷ� ���
		int num = 10;
		float f = 3.14f;
		// String Ÿ���� ���۷��� ���� >> �ּ� ���� ���� ��.
		String s = "�ٳ���"; //s�� �ٳ������ �ּҰ�
		String s2 = "�ٳ���";//s2�� �ٳ������ �ּҰ�

		System.out.println(s == s2);//�׷��� ������ ���� ���� true�� ���´�.
		Scanner sc = new Scanner(System.in);
		String s3 = sc.next();
		//������ s3�� ��ĳ�ʷ� �޴� ���̱� ������ ���� ������ ���� ���ο� �ּҰ��� �Ҵ��ϰ� �ȴ�. 
		System.out.println(s == s3);
		System.out.println(s.equals(s3));
		//�׷��� ���� ������ �Ǻ��ϴ� equals�� ����ϰ� �ȴ�.
		
	}

}


public class ��������� {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 7;
		float num3 = 10.0f;
		double num4 = 7.0;
		
		System.out.println(num1/num2);
		System.out.println(num3/num4);
		System.out.println(num1/num4);
		// ����, �Ǽ� -> �Ǽ�  : �ຯȯ
		// ���ڿ� Ÿ�� �ٷ��
		
		String str1 = "10";
		String str2 = "7";
		
		System.out.println(str1 + str2);
		System.out.println(num1 + str1);
		// ����ȯ -> ���� num1�� ���ڿ��� ��ȯ
		
		int num = 456;
		System.out.println(num-num%100);
		System.out.println(num/100*100);
		System.out.println(num/100 + "00");
		// �ຯȯ ���� + ���ڿ� -> ���ڿ�
		
		//������ �ڽ� ���ϱ�
		int orange = 3729;
		int number = 52;
		
		System.out.println("��𾾰� �� �ڽ��� �� �� �ִ� ����?" + orange/number);
		
		//���մ��Կ�����
		int num5 = 29;
		num5 -= 2 + 3 * 4; // ���Կ����ڴ� ������ ���� �ʴ�.
		System.out.println(num5);
		
		//����������
		int i = 3;
		System.out.println(++i); //1+3=4���
		System.out.println(i++); //4��� �� 4+1
		System.out.println(i);   //5
		
		//�񱳿�����
		int a = 3;
		int b = 10;
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		
		
					
	}

}

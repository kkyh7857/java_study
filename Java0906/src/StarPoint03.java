
public class StarPoint03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int space = 4, star = 1; space >= 1; space--, star+=2) {
			// ó�� ������ �� ĭ 4ĭ�� �� 1ĭ���� ���� �Ѵ�. 
			// ���� �ٿ��� �� ĭ�� 3ĭ�� �ǰ� ���� 3ĭ�� �ȴ�.
			// �� ĭ�� 1ĭ�� �پ��� ���� 2ĭ�� �þ��.
			// ���������� ��ĭ�� 1ĭ�� �ǰ�, ���� 7ĭ�� �ȴ�.
			for (int i = 0; i < space; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < star; i++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int space = 2, star = 5; star>=1; space++, star-=2) {
			// ó�� ������ �� ĭ 2ĭ�� �� 5ĭ���� ���� �Ѵ�. 
			// ���� �ٿ��� �� ĭ�� 3ĭ�� �ǰ� ���� 3ĭ�� �ȴ�.
			// �� ĭ�� 1ĭ�� �þ�� ���� 2ĭ�� �پ���.
			// ���������� ��ĭ�� 4ĭ�� �ǰ�, ���� 1ĭ�� �ȴ�.
			for(int i = 0; i< space; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < star; i++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}


public class Ex02 {

	public static void main(String[] args) {
		// �� ���� ������ �Ű������� �޾�
		// ���� ������ ���� ������ �������� ���� �Ǻ��ϴ� �޼ҵ� isDivide()
		// �������� true, �ȳ������� false
		int base = 10, divide = 2;
		boolean result = isDivide(base, divide);
		System.out.print("��� Ȯ��: " + result);
	}

	private static boolean isDivide(int base, int divide) {
		return base%divide==0;
	}


	

}

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 2���� ������ �Է� �޾�, base, n ���� �ϴ� �޼ҵ� powerN()
		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("���Ȯ��: " + result);

	}

	private static int powerN(int base, int n) {
		int result = 1;
		for (int i = 0; i < n; i++) {
			result *= base;
		}
		return result;

//		int result = (int) Math.pow(base, n);
	}

}

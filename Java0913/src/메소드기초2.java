
public class �޼ҵ����2 {
	public static void main(int[] args) {

		// ���� �� ���� �Է��ϸ� 10�� �ڸ� ���ϴ� �����ϴ� �޼ҵ�
		// 444-> 400, 111 -> 100

		// �޼ҵ� ȣ��
		remove10(444);
		remove10(111);

		int rs1 = kill10(444); // 400
		int rs2 = kill10(111); // 100
		
		System.out.println("rs1: " + rs1);
		System.out.println("rs2: " + rs2);
		
	}

	// �޼ҵ� ����
	public static void remove10(int num) {
		int result = (num / 100)*100;

		System.out.println(result);
	}

	// �޼ҵ��� ���� ���ο��� ����� �� �ִ�.
	public static int kill10(int num) { // void -> int
		int result = (num / 100)*100;

		return result;
	}
	
}

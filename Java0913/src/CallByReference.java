
public class CallByReference {

	public static void main(String[] args) {
		// callByValue : ���� ������ �޼ҵ带 ȣ��, ���� ���� ����
		// ������ number�� print�� number�� ���� �ٸ� number�̴�.
		int number = 3;
		print(number);
		System.out.println(number);
		
		// callByReference : ���۷����� ������ �޼ҵ带 ȣ��, �ٷΰ��� ���� ����
		// ������ array�� print�� number�� ���� number�̴�.
		int[] array = {1,2,3};
		print(array);
	}

	public static void print(int number) {
		number++;
		System.out.println(number);
	}
	public static void print(int[] array) {
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
	}
}

import java.util.Arrays;

public class �޼ҵ�����2 {

	public static void main(String[] args) {
		// �޼ҵ带 ����ϸ� �ǿ뼺�� �ö󰣴�.
		// 1. ������� �˷��ִ� �޼ҵ�
		// �޼ҵ� �̸��� isDivisor
		// �Է�����(�Ű�����) : ���� 2��(����, ���)
		// ��ȯŸ��(����Ÿ��) : ��(boolean) Ÿ��
		// 1. �޼ҵ� ȣ�� -> 2. �޼ҵ� ���Ǹ� �ڵ� ����
		// �޼ҵ� ȣ��
		int base = 10, divide = 2;
		boolean result = isDivisor(base, divide);
		System.out.println(result);
		// 2. �Է� �� ������ ������� �˷��ִ� �޼ҵ�
		// �޼ҵ� �̸� : getDivisors
		// �Է�����(�Ű�����) : ���� 1��
		// ��ȯŸ��(����Ÿ��) : �迭 Ÿ��

		base = 10;
		int[] result_array = getDivisors(base);
		for(int i = 0; i<result_array.length; i++) {
			System.out.print(result_array[i]+" ");
		}
//		System.out.print(Arrays.toString(result_array));
	}

	private static int[] getDivisors(int base) {
		int[] array = new int[base];
		int index = 0;
		for (int i = 1; i <= base; i++) {
			if (base % i == 0) {
				array[index] = i;
				index++;
			}
		}
		return Arrays.copyOf(array, index);
//		return Arrays.copyOf(array, index);
	}

	private static boolean isDivisor(int base, int divide) {
		return base % divide == 0;
//		if(base%divide==0) {
//			return true;
//		}else {
//			return false;
//		}
	}

}

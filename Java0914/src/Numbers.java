import java.util.Arrays;

public class Numbers {
	// ���������� : ��ɿ� ���� �� �� �ִ� ������ �����ϴ� Ű����
	// private: �޼ҵ尡 ���ǵ� ���� �ȿ����� ��밡�� : �����ڰ� ����.
	// public: �ܺ� ���Ͽ��� ��� ����(�޼ҵ尡 ���� ���� ���� ���Ͽ����� ��� ����) : ����

	public static boolean isPrime(int base) { // �Ҽ� ���ϴ� �޼ҵ�
		return getDivisors(base).length == 2;
//		return result == 2;
	}

	public static int[] getDivisors(int base) {// ��� ���ϴ� �޼ҵ�
		int[] array = new int[base];
		int index = 0; // ����� �� ������ �˷��ִ� ����

		for (int i = 1; i <= base; i++) {
			if (isDivisor(base, i)) {
				array[index++] = i; // array[0]�� ���� �����ϰ� array[1]�� �ö󰣴�.
			}
		}
//		return array;
		// return Arrays.copyOf(original: ���� �� �迭, newLength: ���°����);
		return Arrays.copyOf(array, index); // ���� ���ϴ� �ε������� �迭�� �� �� �ִ�.
	}

	public static boolean isDivisor(int base, int divInt) { // ����� �ִ��� ���ϴ� �޼ҵ�
		return base % divInt == 0;
		// return base%divInt==0; �� ��ü�� boolean ���̴�!! �X!
//		if (base % divInt == 0) {
//			return true;
//		} else {
//			return false;
//		}
	}
}

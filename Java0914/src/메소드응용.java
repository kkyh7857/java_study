import java.util.Arrays;

public class �޼ҵ����� {

	public static void main(String[] args) {
		// �޼ҵ带 ����ϸ� �ǿ뼺�� �ö󰣴�.
		// 1. ������� �˷��ִ� �޼ҵ�
		// �޼ҵ� �̸��� isDivisor
		// �Է�����(�Ű�����) : ���� 2��(����, ���)
		// ��ȯŸ��(����Ÿ��) : ��(boolean) Ÿ��
		// 1. �޼ҵ� ȣ�� -> 2. �޼ҵ� ���Ǹ� �ڵ� ����

		// �޼ҵ� ȣ��
		int base = 10, divInt = 2;
		boolean result = isDivisor(base, divInt);
		System.out.println(result);

		// 2. �Է� �� ������ ������� �˷��ִ� �޼ҵ�
		// �޼ҵ� �̸� : getDivisors
		// �Է�����(�Ű�����) : ���� 1��
		// ��ȯŸ��(����Ÿ��) : �迭 Ÿ��

		// �޼ҵ� ȣ��
		base = 10;
		int[] result_array = getDivisors(base);
		// Arrays.toString() : �迭�� 0��°���� ����°���� ���ڿ��� �������.
		System.out.println(Arrays.toString(result_array));
		
		// 3. �Էµ� ���ڰ� �Ҽ����� �˷��ִ� �޼ҵ�
		// �޼ҵ� �̸�: isPrime
		// �Է����� : 1���� ū ���� 1��
		// ��ȯŸ�� : boolean
		
		base = 17;
		// �޼ҵ� ȣ��
		boolean result_prime = isPrime(base); 
		//�޼ҵ� ��ü�� boolean Ÿ���̱� ������ , boolean result_prime�κе� ��������
		System.out.println(result_prime);
		System.out.println(isPrime(base));//�ٷ� �޼ҵ带 ȣ�� �� �� �ִ�.
		System.out.println(getDivisors(base).length==2);// �̷��Ե� ����� �� ����.
	}
	
		// �޼ҵ� ����
	private static boolean isPrime(int base) { // �Ҽ� ���ϴ� �޼ҵ�
		return getDivisors(base).length == 2;
//		return result == 2;
	}

	private static int[] getDivisors(int base) {// ��� ���ϴ� �޼ҵ�
		int[] array = new int[base];
		int index = 0; //����� �� ������ �˷��ִ� ����
		
		for (int i = 1; i <= base; i++) {
			if (isDivisor(base,i)) {
				array[index++] = i; //array[0]�� ���� �����ϰ� array[1]�� �ö󰣴�.
			}
		}
//		return array;
		//return Arrays.copyOf(original: ���� �� �迭, newLength: ���°����);
		return Arrays.copyOf(array, index); // ���� ���ϴ� �ε������� �迭�� �� �� �ִ�.
	}

	private static boolean isDivisor(int base, int divInt) { // ����� �ִ��� ���ϴ� �޼ҵ�
		return base % divInt == 0;
		// return base%divInt==0; �� ��ü�� boolean ���̴�!! �X!
//		if (base % divInt == 0) {
//			return true;
//		} else {
//			return false;
//		}

	}

}

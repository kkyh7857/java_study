
public class �޼ҵ���� {

	
	// main �޼ҵ� : ���α׷��� ������(���� ��ų �� �ִ� ����)
	// �������main -> addNumber -> main
	public static void main(String[] args) {
		// �޼ҵ� ȣ��(����)�ϴ� ���: �޼ҵ��̸�();
		addNumber(10, 20); 
		
		subThreeFloatNumber(3.5f, 0.2f, 1.4f);
		System.out.println("Main ��");
	}

	// addNumber �޼ҵ�
	// �޼ҵ� ����
	public static void addNumber(int num1, int num2) {
		
		int result = num1 + num2;

		System.out.println(result);
	}
	// subNumber �޼ҵ� ���� : 3���� �Ǽ��� �Է¹޾Ƽ� ����
	public static void subThreeFloatNumber(float num1, float num2, float num3) {
		float result = num1 - num2 - num3;
		
		System.out.println(result);
	}
	
	
	
	
}

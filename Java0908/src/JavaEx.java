import java.util.Scanner;

public class JavaEx {

	public static void main(String[] args) {
		// ������ ���� �� ����ڷκ��� ���� �Է� �޾� ����� ����ϰ�
		// ������ ����ϴ� ���α׷�

		
		// �迭�� ��ȣ�� �� �˾ƾ� �Ѵ�.�ڡڡ�
		// �迭�� ��ȣ�� 0������ �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("==ä���ϱ�==");
		int total = 0;
		int[] ans = { 1, 2, 3, 4, 5 }; //ans�� ��ȣ�� 0~4��
		int[] input = new int[5];

		System.out.println("���� �Է��ϼ���");
		
		// 1. ����ڿ��� ������ �Է� �޴� ����
		for (int i = 0; i < 5; i++) {
			System.out.print(i+1 + "�� ��: ");
			input[i] = sc.nextInt(); // input�� 0~4������
		}
		
		// 2. �Է¹��� ���� ���� ������ ���ϴ� ����
		System.out.print("����Ȯ��: ");
		for (int j = 0; j < ans.length; j++) { // 0~4������ ���;� �Ѵ�.
			if (input[j] == ans[j]) {  
				total += 20;
				System.out.print("0 ");
			} else {
				System.out.print("X ");
			}
		}
		
		// 3. ��ü ������ ����ϴ� ����
		System.out.print("����: " + total);

	}

}














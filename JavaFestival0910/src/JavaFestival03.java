import java.util.Random;

public class JavaFestival03 {

	public static void main(String[] args) {
		
		// 8ĭ�� ũ�� �迭�� �����ϰ� 
		// ������ �ʱ�ȭ �� ��
		// ���� ū ���� ���� ���� �� ���
			
		int[] num = new int[8];
		Random rd = new Random();
		int max = num[0];
		int min = num[0];
		System.out.print("������: ");
		for(int i = 0; i<num.length; i++) {
			num[i] = rd.nextInt(100)+1;
			System.out.print(num[i] + " ");
			if(num[i]>num[max]) {
				max = i;
			}
			if(num[min]>num[i]) {
				min = i;
			}
		}
		System.out.println();
		System.out.println("�ִ밪: " + num[max]);
		System.out.print("�ּҰ�: " + num[min]);
	}

}

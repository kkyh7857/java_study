import java.util.Random;

public class Ex16 {

	public static void main(String[] args) {
		// 8ĭ �迭 ���� �ʱ�ȭ ���� ū ��, ���� ��
		
		Random rd = new Random();
		int[] array = new int[8];
		System.out.print("�迭�� �ִ� ��: ");
		for(int i = 0; i<array.length; i++) {
			array[i] = rd.nextInt(100);
			System.out.print(array[i]+" ");
		}
		int max = array[0]; 
		int min = array[0];
		for(int i = 0; i<array.length; i++) {
			if(array[i]<min) {
				min = array[i];
			}
			if(array[i]>max) {
				max = array[i];
			}
		}
		System.out.println();
		System.out.println("���� ū ��: " + max);
		System.out.print("���� ���� ��: " + min);
	}
}

import java.util.Random;

public class ex05�迭�ǽ� {

	public static void main(String[] args) {
		// 1���� ������ ������ ������ �� ����
		// ���� ū �� ã��
		
		int[] array1 = new int[10];
		
		Random rd = new Random();
		
		int max = 0;
		for(int i = 0; i<array1.length; i++) {
			array1[i]=rd.nextInt(100)+1;
			System.out.print(array1[i]+" ");
			if(array1[i]>max) {
				max = array1[i];
			}
		}System.out.println();
		System.out.print("���� ū ���� " +max+" �Դϴ�.");
		
	}

}

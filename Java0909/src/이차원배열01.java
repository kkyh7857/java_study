import java.util.Random;
import java.util.Scanner;

public class �������迭01 {

	public static void main(String[] args) {

		int[][] array = new int[4][4];
		// 4ĭ���� �̷��� �迭�� ������ ĭ�� 4ĭ���� �̷���� ����̴�.
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);	
		
		System.out.println(array.length);
		// ���� ����
		System.out.println(array[0].length);
		// 0���� ���� ����
		
		
		int data = 0;
		// �࿡ ���� �ݺ���
		for(int i = 0; i<array.length; i++) {
			// ���� ���� �κ�
			for(int j = 0; j<array[0].length; j++) {
				data++;
				System.out.println("array["+i+"]["+j+"]: " + data);
				
			}
		}
	}
}

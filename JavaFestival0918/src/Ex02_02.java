import java.util.Scanner;

public class Ex02_02 {

	public static void main(String[] args) {
		// ����ڿ��� �Է� �޾� �迭�� �ε����� �� ��ŭ ���� ���
		// 1~5��° ���� �� �� �ѹ��� �ް� ����Ѵ�.
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(i+1 + "��° ����: ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " : ");
			for(int j = 0; j<arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

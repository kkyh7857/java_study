import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 8�ڸ� ������ �Է� �޾�. �ݺ����� Ȱ���Ͽ� 
		// �Է¹��� ������ ���� ���Ͽ� ����ϴ� 
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] array = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000};
		System.out.print("8�ڸ� ���� �Է�: ");
		int num = sc.nextInt();
		for(int i = array.length-1; i>=0; i--) {
			int num2 = num/array[i];
			num = num - (num2*array[i]);
			sum += num2;
		}
		System.out.println("���� " + sum + "�Դϴ�.");
	}

}

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// �Ž�����
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �ݾ� �Է�: ");
		int money = sc.nextInt();
		System.out.println();
		System.out.println("�ܵ�: " + money + "��");
		int[] array = {10000, 5000, 1000, 500, 100};
		for(int i = 0; i<array.length; i++) {
			 
			int count = money/array[i];
			money = money - array[i]*count;
			
			System.out.println(array[i] + "�� : " + count + "��");
		}
		sc.close();
	}

}

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// n�� x�� �Է� �޴´�.
		// n���� ������ �Է��Ѵ�.
		// �Է� ���� ���� �� x ���� ���� ���� ����Ѵ�.	
		Scanner sc = new Scanner(System.in);
		System.out.print("N �Է�: ");
		int Nnum = sc.nextInt();
		System.out.print("X �Է�: ");
		int Xnum = sc.nextInt();
		int[] array = new int[Nnum];
		int count = 0;
		for(int i = 0; i<array.length; i++) {
			System.out.print(i+1 + "��° ���� �Է�: ");
			array[i] = sc.nextInt();
			if(array[i]<Xnum) {
				array[count]=array[i];
				count++;
			}
			
		}
		System.out.print("��� >> ");
		for(int i = 0; i<count; i++) {
			System.out.print(array[i] + " ");	
		}
		// array�迭�� ���ο� �ε��� count�� ������ �迭 ���� print �żҵ尡 ����Ѵ�.
		System.out.println(Arrays.toString(Arrays.copyOf(array, count)));
		
	}

}

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("N �Է� >> ");
		int n = sc.nextInt();
		System.out.print("X �Է� >> ");
		int x = sc.nextInt();
		int[] arr = new int[10];
		int count = 0;
		for(int i = 0; i<n; i++) {
			System.out.println(i+1 + "��° ���� �Է� >> ");
			arr[i] = sc.nextInt();
			if(arr[i]<x) {
				arr[count] = arr[i];
				count++;
			}
		}
		System.out.print("��� >> ");
		for(int i = 0; i<count; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}

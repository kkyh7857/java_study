import java.util.Arrays;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i<arr.length; i++) {
			System.out.print(i+1 + "��° �� �Է�: ");
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("���� �� \n" + Arrays.toString(arr));
		sc.close();
	}

}

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է� >> ");
		String[] num = sc.next().split("");
		int[] dasi = { 6, 2, 5, 5, 4, 5, 6, 4, 7, 6 };
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < dasi.length; j++) {
				if (num[i].equals(""+j)) {
					sum = sum + dasi[j];
				}
			}
		}
		System.out.print("���'-'�� �� �� >> " + sum);
		sc.close();
	}

}

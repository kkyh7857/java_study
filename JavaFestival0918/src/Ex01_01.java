import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01_01 {

	public static void main(String[] args) {
		// �ߺ� ���� ����� ���� 6�� �̱�

		int[] lotto = new int[6];
		Random rd = new Random();
		System.out.println("== Lotto ���α׷�  ==");
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ��: ");
		int game = sc.nextInt();
		for(int h = 0; h< game; h++) { // ����
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = rd.nextInt(45)+1;
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
					
				}
			}			
			Arrays.sort(lotto);
			System.out.print(h+1 + "��° ����� ���� : ");
			System.out.println(Arrays.toString(lotto));
		}
	}

}

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// ���� ���� �Է� �޾�
		// 1~45������ ���� �� 6���� �����ϰ�
		// ���� �� ��ŭ ����� �ִ� ���α׷�

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		System.out.println("== lotto~ ==");

		System.out.print("���� ��: ");
		int game = sc.nextInt();
		int[] num = new int[6];
		int gameNum=0;
		while (true) {
			for (int i = 0; i < num.length; i++) {
				num[i] = random.nextInt(45) + 1;
				System.out.print(num[i] + " ");
			}
			gameNum++;
			System.out.println();
			if(game<=gameNum) {
				break;
			}
		}

	}

}
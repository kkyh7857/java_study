import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// 게임 수를 입력 받아
		// 1~45까지의 숫자 중 6개를 랜덤하게
		// 게임 수 만큼 만들어 주는 프로그램

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		System.out.println("== lotto~ ==");

		System.out.print("게임 수: ");
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
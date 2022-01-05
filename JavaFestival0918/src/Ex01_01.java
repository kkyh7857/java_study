import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01_01 {

	public static void main(String[] args) {
		// 중복 없는 행운의 숫자 6개 뽑기

		int[] lotto = new int[6];
		Random rd = new Random();
		System.out.println("== Lotto 프로그램  ==");
		Scanner sc = new Scanner(System.in);
		System.out.print("게임 수: ");
		int game = sc.nextInt();
		for(int h = 0; h< game; h++) { // 게임
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
			System.out.print(h+1 + "번째 행운의 숫자 : ");
			System.out.println(Arrays.toString(lotto));
		}
	}

}

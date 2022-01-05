import java.util.Scanner;

public class ForEx약수문제 {

	public static void main(String[] args) {
		// 2~30까지의 약수를 구하세요.

		Scanner sc = new Scanner(System.in);
		sc.close();
		
		
		
		for (int num = 2; num <= 30; num++) {
			System.out.print(num + "의 약수: ");
			for (int i = 1; i <= num; i++) {
				if (num%i == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

	}

}

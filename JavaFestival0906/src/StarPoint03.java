import java.util.Scanner;

public class StarPoint03 {

	public static void main(String[] args) {
		// 행 개수를 입력 받고 아래 삼각형 만들기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행 수 입력: ");
		int v = sc.nextInt();
		
		for(int i = v-1, j = 1; j<=v; i--, j++) {
			for(int k = 1; k<=i; k++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

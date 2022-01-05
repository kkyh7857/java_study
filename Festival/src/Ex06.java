import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 입력 받은 수에 따라 별 찍기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int row = sc.nextInt();
		
		for(int i = 0; i<row; i++) {
			for(int st = 0; st<=i; st++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}

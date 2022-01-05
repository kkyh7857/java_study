import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		// 정수 n 입력, 1,2,4,7,11
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력: ");
		int num = sc.nextInt();
		for(int i = 0, j = 1; i<num; i++) {
			System.out.print((j+=i) + " ");
		}	
		sc.close();
	}

}

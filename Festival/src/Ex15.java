import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// n!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ют╥б: ");
		int num = sc.nextInt();
		float factorial = 1;
		for(int i = 1; i<=num; i++){
			factorial = factorial * i;
		}
		System.out.print(factorial);
		sc.close();
	}

}

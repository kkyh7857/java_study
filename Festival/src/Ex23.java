import java.util.Random;
import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {
			int num1 = rd.nextInt(10);
			int num2 = rd.nextInt(10);
			System.out.print(num1 + " + " + num2 + " = ");
			int ans = sc.nextInt();
			if (ans != num1 + num2) {
				System.out.println("Fail...");
				count++;
			} else {
				System.out.println("Success");
			}
			if (count == 5) {
				System.out.println("GAME OVER");
				break;
			}
		}
		sc.close();
	}

}

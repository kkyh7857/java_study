import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// °Å½º¸§µ·
		Scanner sc = new Scanner(System.in);
		System.out.print("ÃÑ ±Ý¾× ÀÔ·Â: ");
		int money = sc.nextInt();
		System.out.println();
		System.out.println("ÀÜµ·: " + money + "¿ø");
		int[] array = {10000, 5000, 1000, 500, 100};
		for(int i = 0; i<array.length; i++) {
			 
			int count = money/array[i];
			money = money - array[i]*count;
			
			System.out.println(array[i] + "¿ø : " + count + "°³");
		}
		sc.close();
	}

}

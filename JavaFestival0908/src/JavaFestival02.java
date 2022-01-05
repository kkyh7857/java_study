
public class JavaFestival02 {

	public static void main(String[] args) {
		// (77*1)+(76*2)+(75*3)+(74*4)+...+(1*77)을 계산하여 출력

		int total = 0;
		for (int i = 77, j = 1; i >= 1; i--, j++) {
			total = total + i * j;
		}
		System.out.print(total);
	}

}

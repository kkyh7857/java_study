
public class JavaFestivalEx {

	public static void main(String[] args) {
		// 1+-2+3+-4+ ... -98+99-100

		int total = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 1) {
				System.out.print(i + " ");
				total += i;
			} else {
				System.out.print(-1 * i + " ");
				total += i * -1;
			}

		}
		System.out.println();
		System.out.print("°á°ú: " + total);

	}

}

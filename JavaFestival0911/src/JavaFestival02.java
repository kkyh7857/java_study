
public class JavaFestival02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String score = "A, A, B, C, D, A, C, D, D, D, F";
		String[] scoresplit = score.split(", ");
		String[] num = { "A", "B", "C", "D", "F" };

		for (int j = 0; j < num.length; j++) {
			System.out.print(num[j] + ":");
			int count = 0;
			for (int i = 0; i < scoresplit.length; i++) {
				if (num[j].equals(scoresplit[i])) {
					count++;
				}
			}
			System.out.println(count + "Έν");
		}

	}
}
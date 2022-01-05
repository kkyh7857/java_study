
public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] scoreSplit = score.split(",");
		String[] alpa = { "A", "B", "C", "D", "F" };
		for (int i = 0; i < alpa.length; i++) {
			int count = 0;
			System.out.print(alpa[i] + ": ");
			for (int j = 0; j < scoreSplit.length; j++) {
				if (scoreSplit[j].equals(alpa[i])) {
					count++;
				}

			}
			System.out.println(count+"Έν");
		}

	}

}


public class Ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "01001101";
		String[] strSp = str.split("");
		int num = 0;
		int sum = 0;
		for (int i = strSp.length - 1, j = 0; i >= 0; i--, j++) {
			if (strSp[i].equals("1")) {
				num = (int) Math.pow(2, j);
				sum += num;
			}
		}
		System.out.print(str + "(2)" + " = " + sum + "(10)");
	}
}
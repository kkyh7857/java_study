
public class Ex02 {

	public static void main(String[] args) {
		// ���ڿ� ������ 2������ �Է¹޾�
		// 10 ������ �ٲٴ� ���α׷�

		String str = "00101000";
		String[] strarr = str.split("");
//		String str2 = "00101000";01001101
//		String[] str2arr = str2.split("");
		double num = 0;
		int sum = 0;
		for (int i = strarr.length - 1, j = 0; i >= 0; i--, j++) {
			if (strarr[i].equals("1")) {
				num = Math.pow(2, j);
				sum += num;
			}

		}
		System.out.println(str + "(2) = " + sum + "(10)");
	}

}

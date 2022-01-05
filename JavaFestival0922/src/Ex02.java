
public class Ex02 {

	public static void main(String[] args) {
		// 문자열 형태의 2진수를 입력받아
		// 10 진수로 바꾸는 프로그램

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

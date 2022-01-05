
public class Ex01 {

	public static void main(String[] args) {
		// num1, num2, op를 매개 변수로 받아
		// num1, num2를 op에 맞게 연산한 결과 값을 반환해주는 cal메소드 만들기

		int num1 = 50;
		int num2 = 15;
		char op = '+';
		System.out.println(cal(num1, num2, op));

	}

	private static int cal(int num1, int num2, char op) {
		int result = 0;
		if (op == '+') {
			result = num1 + num2;
		} else if (op == '-') {
			result = Math.abs(num1-num2);
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/') {
			result = num1 / num2;
		}
		return result;
	}

}

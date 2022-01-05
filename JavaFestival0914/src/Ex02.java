
public class Ex02 {

	public static void main(String[] args) {
		// 두 개의 정수를 매개변수로 받아
		// 앞의 정수가 뒤의 정수로 나눠지는 지를 판별하는 메소드 isDivide()
		// 나눠지면 true, 안나눠지면 false
		int base = 10, divide = 2;
		boolean result = isDivide(base, divide);
		System.out.print("결과 확인: " + result);
	}

	private static boolean isDivide(int base, int divide) {
		return base%divide==0;
	}


	

}

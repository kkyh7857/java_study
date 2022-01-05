
public class Ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 2;
		int n = 3; 
		int result = powerN(base, n);
		System.out.println("결과 확인: " + result);
	}

	private static int powerN(int base, int n) {
		int result = (int) Math.pow(base, n);
		return result;
	}

}

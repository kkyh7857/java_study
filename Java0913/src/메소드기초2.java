
public class 메소드기초2 {
	public static void main(int[] args) {

		// 정수 한 개를 입력하면 10의 자리 이하는 제거하는 메소드
		// 444-> 400, 111 -> 100

		// 메소드 호출
		remove10(444);
		remove10(111);

		int rs1 = kill10(444); // 400
		int rs2 = kill10(111); // 100
		
		System.out.println("rs1: " + rs1);
		System.out.println("rs2: " + rs2);
		
	}

	// 메소드 정의
	public static void remove10(int num) {
		int result = (num / 100)*100;

		System.out.println(result);
	}

	// 메소드의 값을 메인에서 사용할 수 있다.
	public static int kill10(int num) { // void -> int
		int result = (num / 100)*100;

		return result;
	}
	
}

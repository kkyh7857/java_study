
public class 메소드기초 {

	
	// main 메소드 : 프로그램의 시작점(실행 시킬 수 있는 지점)
	// 실행순서main -> addNumber -> main
	public static void main(String[] args) {
		// 메소드 호출(실행)하는 방법: 메소드이름();
		addNumber(10, 20); 
		
		subThreeFloatNumber(3.5f, 0.2f, 1.4f);
		System.out.println("Main 끝");
	}

	// addNumber 메소드
	// 메소드 정의
	public static void addNumber(int num1, int num2) {
		
		int result = num1 + num2;

		System.out.println(result);
	}
	// subNumber 메소드 정의 : 3개의 실수를 입력받아서 뺄샘
	public static void subThreeFloatNumber(float num1, float num2, float num3) {
		float result = num1 - num2 - num3;
		
		System.out.println(result);
	}
	
	
	
	
}

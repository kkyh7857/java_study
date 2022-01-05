
public class For문 {
	// 프로그램의 시작점(프로그램을 만들 때 꼭 하나는 만들어야 함, 한 프로그램에 하나만 가능)
	public static void main(String[] args) {

		// for문(초기화 구문(지역변수);검사조건(비교작업);반복후 작업)
		//1~10까지 출력
		for (int num = 1; num <= 10; num++) {
			System.out.print(" "+num);
		}
		System.out.println();
		for (int num = 2; num <= 10; num+=2 ) {
			System.out.print(" "+num);
		}
		System.out.println();
		for (int num = 1; num <= 10; num+=2 ) {
			System.out.print(" "+num);
		}
		
	}

}

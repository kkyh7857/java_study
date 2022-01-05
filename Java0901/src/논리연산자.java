import java.util.Scanner;

public class 논리연산자 {

	public static void main(String[] args) {
		
		boolean isTvOn = false;
		// not 연산
		System.out.println(!isTvOn);
		
		// and 연산 : 둘 다 true면 true
		System.out.println(true && true); 
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		// or 연산 : 하나라도 true면 true
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		
	}

}

import java.util.Scanner;

public class 문자열주소 {

	public static void main(String[] args) {
		// 리터럴 상수
		int num = 10;
		float f = 3.14f;
		// String 타입은 래퍼런스 변수 >> 주소 값이 저장 됨.
		String s = "바나나"; //s는 바나나라는 주소값
		String s2 = "바나나";//s2는 바나나라는 주소값

		System.out.println(s == s2);//그렇기 때문에 실행 값이 true가 나온다.
		Scanner sc = new Scanner(System.in);
		String s3 = sc.next();
		//하지만 s3은 스캐너로 받는 값이기 때문에 뭐가 들어올지 몰라서 새로운 주소값을 할당하게 된다. 
		System.out.println(s == s3);
		System.out.println(s.equals(s3));
		//그래서 값만 가지고 판별하는 equals를 사용하게 된다.
		
	}

}

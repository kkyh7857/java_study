import java.util.Scanner;

public class 평균메소드오버로딩 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("국어: ");
//		int kor = sc.nextInt();
//		System.out.print("영어: ");
//		int eng = sc.nextInt();
//		System.out.print("수학: ");
//		int math = sc.nextInt();
//
//		double are = mean(kor, eng, math);
//		System.out.println(are);
		double are = mean(80, 70, 61, 90);
		System.out.println(are);
	}

	// 메소드 정의 : kor, eng, math
	public static double mean(int kor, int eng, int math) {
		double result = (kor + eng + math) / 3.0;

		return result;
	}

	// 메소드 중복 정의 : 같은 이름의 메소드를 정의하는 것(method overloading)
	// 매개변수의 데이터 타입이나 갯수가 다르게 작성해야 성립
	public static double mean(int kor, int eng, int math, int java) {
		double result = (kor + eng + math + java) / 4.0;

		return result;
	}
	// 각 과목 점수를 실수로 입력
	public static double mean(double kor, double eng, double math) {
		double result = (kor + eng + math) / 3.0;

		return result;
	}
	
	
}
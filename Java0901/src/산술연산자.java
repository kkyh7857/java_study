
public class 산술연산자 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 7;
		float num3 = 10.0f;
		double num4 = 7.0;
		
		System.out.println(num1/num2);
		System.out.println(num3/num4);
		System.out.println(num1/num4);
		// 정수, 실수 -> 실수  : 행변환
		// 문자열 타입 다루기
		
		String str1 = "10";
		String str2 = "7";
		
		System.out.println(str1 + str2);
		System.out.println(num1 + str1);
		// 형변환 -> 숫자 num1의 문자열로 변환
		
		int num = 456;
		System.out.println(num-num%100);
		System.out.println(num/100*100);
		System.out.println(num/100 + "00");
		// 행변환 정수 + 문자열 -> 문자열
		
		//오렌지 박스 구하기
		int orange = 3729;
		int number = 52;
		
		System.out.println("김모씨가 귤 박스를 줄 수 있는 수는?" + orange/number);
		
		//복합대입연산자
		int num5 = 29;
		num5 -= 2 + 3 * 4; // 대입연산자는 순서가 가장 늦다.
		System.out.println(num5);
		
		//증감연산자
		int i = 3;
		System.out.println(++i); //1+3=4출력
		System.out.println(i++); //4출력 후 4+1
		System.out.println(i);   //5
		
		//비교연산자
		int a = 3;
		int b = 10;
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		
		
					
	}

}

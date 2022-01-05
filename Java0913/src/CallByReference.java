
public class CallByReference {

	public static void main(String[] args) {
		// callByValue : 값을 가지고 메소드를 호출, 복사 같은 느낌
		// 메인의 number와 print의 number는 서로 다른 number이다.
		int number = 3;
		print(number);
		System.out.println(number);
		
		// callByReference : 래퍼런스를 가지고 메소드를 호출, 바로가기 같은 느낌
		// 메인의 array와 print의 number는 같은 number이다.
		int[] array = {1,2,3};
		print(array);
	}

	public static void print(int number) {
		number++;
		System.out.println(number);
	}
	public static void print(int[] array) {
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
	}
}

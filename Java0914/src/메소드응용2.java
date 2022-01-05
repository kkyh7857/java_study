import java.util.Arrays;

public class 메소드응용2 {

	public static void main(String[] args) {
		// 메소드를 사용하면 실용성이 올라간다.
		// 1. 약수인지 알려주는 메소드
		// 메소드 이름은 isDivisor
		// 입력인자(매개변수) : 정수 2개(정수, 약수)
		// 반환타입(리턴타입) : 논리(boolean) 타입
		// 1. 메소드 호출 -> 2. 메소드 정의를 자동 생성
		// 메소드 호출
		int base = 10, divide = 2;
		boolean result = isDivisor(base, divide);
		System.out.println(result);
		// 2. 입력 된 숫자의 약수들을 알려주는 메소드
		// 메소드 이름 : getDivisors
		// 입력인자(매개변수) : 정수 1개
		// 반환타입(리턴타입) : 배열 타입

		base = 10;
		int[] result_array = getDivisors(base);
		for(int i = 0; i<result_array.length; i++) {
			System.out.print(result_array[i]+" ");
		}
//		System.out.print(Arrays.toString(result_array));
	}

	private static int[] getDivisors(int base) {
		int[] array = new int[base];
		int index = 0;
		for (int i = 1; i <= base; i++) {
			if (base % i == 0) {
				array[index] = i;
				index++;
			}
		}
		return Arrays.copyOf(array, index);
//		return Arrays.copyOf(array, index);
	}

	private static boolean isDivisor(int base, int divide) {
		return base % divide == 0;
//		if(base%divide==0) {
//			return true;
//		}else {
//			return false;
//		}
	}

}

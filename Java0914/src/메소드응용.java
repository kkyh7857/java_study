import java.util.Arrays;

public class 메소드응용 {

	public static void main(String[] args) {
		// 메소드를 사용하면 실용성이 올라간다.
		// 1. 약수인지 알려주는 메소드
		// 메소드 이름은 isDivisor
		// 입력인자(매개변수) : 정수 2개(정수, 약수)
		// 반환타입(리턴타입) : 논리(boolean) 타입
		// 1. 메소드 호출 -> 2. 메소드 정의를 자동 생성

		// 메소드 호출
		int base = 10, divInt = 2;
		boolean result = isDivisor(base, divInt);
		System.out.println(result);

		// 2. 입력 된 숫자의 약수들을 알려주는 메소드
		// 메소드 이름 : getDivisors
		// 입력인자(매개변수) : 정수 1개
		// 반환타입(리턴타입) : 배열 타입

		// 메소드 호출
		base = 10;
		int[] result_array = getDivisors(base);
		// Arrays.toString() : 배열의 0번째부터 끝번째까지 문자열로 만들어줌.
		System.out.println(Arrays.toString(result_array));
		
		// 3. 입력된 숫자가 소수인지 알려주는 메소드
		// 메소드 이름: isPrime
		// 입력인자 : 1보다 큰 정수 1개
		// 반환타입 : boolean
		
		base = 17;
		// 메소드 호출
		boolean result_prime = isPrime(base); 
		//메소드 자체가 boolean 타입이기 때문에 , boolean result_prime부분도 생략가능
		System.out.println(result_prime);
		System.out.println(isPrime(base));//바로 메소드를 호출 할 수 있다.
		System.out.println(getDivisors(base).length==2);// 이렇게도 사용할 수 있음.
	}
	
		// 메소드 정의
	private static boolean isPrime(int base) { // 소수 구하는 메소드
		return getDivisors(base).length == 2;
//		return result == 2;
	}

	private static int[] getDivisors(int base) {// 약수 구하는 메소드
		int[] array = new int[base];
		int index = 0; //약수가 들어갈 공간을 알려주는 변수
		
		for (int i = 1; i <= base; i++) {
			if (isDivisor(base,i)) {
				array[index++] = i; //array[0]에 값을 저장하고 array[1]로 올라간다.
			}
		}
//		return array;
		//return Arrays.copyOf(original: 복제 할 배열, newLength: 몇번째까지);
		return Arrays.copyOf(array, index); // 내가 원하는 인덱스까지 배열을 볼 수 있다.
	}

	private static boolean isDivisor(int base, int divInt) { // 약수가 있는지 구하는 메소드
		return base % divInt == 0;
		// return base%divInt==0; 값 자체가 boolean 값이다!! 췟!
//		if (base % divInt == 0) {
//			return true;
//		} else {
//			return false;
//		}

	}

}

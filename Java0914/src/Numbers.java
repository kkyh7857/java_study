import java.util.Arrays;

public class Numbers {
	// 접근제한자 : 기능에 접근 할 수 있는 범위를 설정하는 키워드
	// private: 메소드가 정의된 파일 안에서만 사용가능 : 소유자가 있음.
	// public: 외부 파일에서 사용 가능(메소드가 정의 되지 않은 파일에서도 사용 가능) : 공용

	public static boolean isPrime(int base) { // 소수 구하는 메소드
		return getDivisors(base).length == 2;
//		return result == 2;
	}

	public static int[] getDivisors(int base) {// 약수 구하는 메소드
		int[] array = new int[base];
		int index = 0; // 약수가 들어갈 공간을 알려주는 변수

		for (int i = 1; i <= base; i++) {
			if (isDivisor(base, i)) {
				array[index++] = i; // array[0]에 값을 저장하고 array[1]로 올라간다.
			}
		}
//		return array;
		// return Arrays.copyOf(original: 복제 할 배열, newLength: 몇번째까지);
		return Arrays.copyOf(array, index); // 내가 원하는 인덱스까지 배열을 볼 수 있다.
	}

	public static boolean isDivisor(int base, int divInt) { // 약수가 있는지 구하는 메소드
		return base % divInt == 0;
		// return base%divInt==0; 값 자체가 boolean 값이다!! 췟!
//		if (base % divInt == 0) {
//			return true;
//		} else {
//			return false;
//		}
	}
}

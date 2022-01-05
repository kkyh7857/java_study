
public class 메소드Ex03 {

	public static void main(String[] args) {
		// array에 들어 있는 데이터를 출력하는 arrayToString() 메소드 구현
		
		int[] array = {1,3,4,8,7,9,10};
		arrayToString(array);

	}
	public static void arrayToString(int[] array2) {
		for(int i = 0; i<array2.length; i++) {
			System.out.print(array2[i]+" ");
		}
	}
}

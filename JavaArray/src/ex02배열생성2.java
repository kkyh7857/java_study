
public class ex02배열생성2 {

	public static void main(String[] args) {

		// 배열 선언, 생성, 값 집어넣기를 한번에 진행!

		// 배열 생성 할 때, 배열에 들어갈 값을 알고 있는 경우
		int[] array1 = { 10, 20, 30, 40 };

		// 배열 생성 할 때, 배열에 들어갈 값이 모호한 경우
		// int[] array1 = new int[4];

		// 배열의 크기 출력
		System.out.println("배열의 크기는: " + array1.length);

		// 배열 안에 있는 값 출력
		System.out.print("배열의 값: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		// 이렇게 사용 할 수도 있음.
//		for (int i = 0; i <=array1.length; i++) {
//			if(i == array1.length) {
//				System.out.println("내용 없음");
//			}else {
//				System.out.print(array1[i] + " ");
//			}
//		}
		// 4번째 인덱스에 있는 값과 9번째 인덱스에 있는 값 더해서 결과 출력하기.

	}

}

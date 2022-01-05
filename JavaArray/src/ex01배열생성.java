
public class ex01배열생성 {

	public static void main(String[] args) {
		// 배열타입 [배열선언] 배열 이름 = 배열 생성 배열타입[배열의 크기];
		// int[] numbers = new int[4]; 
		// int타입의 배열 생성
		// 배열의 이름은 array1이고 그 크기는 4;
		int [] array1 = new int[4];

		// 배열에 값 집어넣기
		// 배열[인덱스번호(0번~시작함!!)] = 값;
		array1[0] = 10 ;
		array1[1] = 8 ;
		array1[2] = 6 ;
		array1[3] = 4 ;
		
		//선언한 배열의 크기 값을 출력
		System.out.println("배열의 길이: " + array1.length);
		
		//값 출력하기
		//반복문for
		System.out.println("배열 값 불러오기: ");
		for(int i = 0; i<array1.length; i++) {
			//i가 0 ~ 3 까지 증가함.
			System.out.print(array1[i]+" ");
		}
				
	}

}

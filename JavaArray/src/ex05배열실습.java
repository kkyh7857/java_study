import java.util.Random;

public class ex05배열실습 {

	public static void main(String[] args) {
		// 1차원 정수형 변수에 임의의 값 선언
		// 가장 큰 값 찾기
		
		int[] array1 = new int[10];
		
		Random rd = new Random();
		
		int max = 0;
		for(int i = 0; i<array1.length; i++) {
			array1[i]=rd.nextInt(100)+1;
			System.out.print(array1[i]+" ");
			if(array1[i]>max) {
				max = array1[i];
			}
		}System.out.println();
		System.out.print("가장 큰 값은 " +max+" 입니다.");
		
	}

}

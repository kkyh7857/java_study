import java.util.Random;
import java.util.Scanner;

public class 이차원배열01 {

	public static void main(String[] args) {

		int[][] array = new int[4][4];
		// 4칸으로 이뤄진 배열에 각각의 칸이 4칸으로 이루어진 모습이다.
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);	
		
		System.out.println(array.length);
		// 행의 길이
		System.out.println(array[0].length);
		// 0행의 열의 길이
		
		
		int data = 0;
		// 행에 대한 반복문
		for(int i = 0; i<array.length; i++) {
			// 열에 대한 부분
			for(int j = 0; j<array[0].length; j++) {
				data++;
				System.out.println("array["+i+"]["+j+"]: " + data);
				
			}
		}
	}
}

import java.util.Arrays;

import java.util.Collections;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 5개의 정수를 입력 받아 오름차순으로 출력

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int temp = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "번째 수 입력: ");
			array[i] = sc.nextInt();
		}
		
		for(int i = 0; i<array.length-1; i++) {
			int maxNum = i;
	
			for(int j = 1; j<array.length; j++) {
				if(array[i]<array[j]) {
					maxNum = j;
				}
			} 
			temp = array[i];
			array[i] = array[maxNum];
			array[maxNum] = temp;
			
		}
		
		System.out.print(Arrays.toString(array));
		// 오름차순
//		System.out.println("정렬 후 "); 
//		Arrays.sort(array); // <<이렇게 하는 방법도 있네요 
//		for(int i = 0; i<array.length; i++) {
//			System.out.print(array[i]+" ");
//		}
		
//		System.out.println("정렬 후 ");	
//		for (int i = 0; i<array.length; i++) {
//			for (int j = 0; j<array.length-1; j++) {
//				if(array[j]>array[j+1]) {
//					temp = array[j];
//					array[j] = array[j+1];
//					array[j+1] = temp;
//				}
//			}
//		}
//		for(int i = 0; i<array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
		
	}

}

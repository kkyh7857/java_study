import java.util.Arrays;

import java.util.Collections;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 5���� ������ �Է� �޾� ������������ ���

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		int temp = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "��° �� �Է�: ");
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
		// ��������
//		System.out.println("���� �� "); 
//		Arrays.sort(array); // <<�̷��� �ϴ� ����� �ֳ׿� 
//		for(int i = 0; i<array.length; i++) {
//			System.out.print(array[i]+" ");
//		}
		
//		System.out.println("���� �� ");	
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

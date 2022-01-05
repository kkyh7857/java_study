import java.util.Random;

public class Ex16 {

	public static void main(String[] args) {
		// 8칸 배열 랜덤 초기화 가장 큰 수, 작은 수
		
		Random rd = new Random();
		int[] array = new int[8];
		System.out.print("배열에 있는 값: ");
		for(int i = 0; i<array.length; i++) {
			array[i] = rd.nextInt(100);
			System.out.print(array[i]+" ");
		}
		int max = array[0]; 
		int min = array[0];
		for(int i = 0; i<array.length; i++) {
			if(array[i]<min) {
				min = array[i];
			}
			if(array[i]>max) {
				max = array[i];
			}
		}
		System.out.println();
		System.out.println("가장 큰 값: " + max);
		System.out.print("가장 작은 값: " + min);
	}
}

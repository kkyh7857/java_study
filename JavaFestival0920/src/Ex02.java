import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// n과 x를 입력 받는다.
		// n개의 정수를 입력한다.
		// 입력 받은 숫자 중 x 보다 작은 수만 출력한다.	
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력: ");
		int Nnum = sc.nextInt();
		System.out.print("X 입력: ");
		int Xnum = sc.nextInt();
		int[] array = new int[Nnum];
		int count = 0;
		for(int i = 0; i<array.length; i++) {
			System.out.print(i+1 + "번째 정수 입력: ");
			array[i] = sc.nextInt();
			if(array[i]<Xnum) {
				array[count]=array[i];
				count++;
			}
			
		}
		System.out.print("결과 >> ");
		for(int i = 0; i<count; i++) {
			System.out.print(array[i] + " ");	
		}
		// array배열의 새로운 인덱스 count를 대입한 배열 값을 print 매소드가 출력한다.
		System.out.println(Arrays.toString(Arrays.copyOf(array, count)));
		
	}

}

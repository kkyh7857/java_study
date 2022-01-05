import java.util.Random;

public class JavaFestival03 {

	public static void main(String[] args) {
		
		// 8칸의 크기 배열을 선언하고 
		// 난수로 초기화 한 후
		// 가장 큰 수와 가장 작은 수 출력
			
		int[] num = new int[8];
		Random rd = new Random();
		int max = num[0];
		int min = num[0];
		System.out.print("데이터: ");
		for(int i = 0; i<num.length; i++) {
			num[i] = rd.nextInt(100)+1;
			System.out.print(num[i] + " ");
			if(num[i]>num[max]) {
				max = i;
			}
			if(num[min]>num[i]) {
				min = i;
			}
		}
		System.out.println();
		System.out.println("최대값: " + num[max]);
		System.out.print("최소값: " + num[min]);
	}

}

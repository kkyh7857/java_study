import java.util.Arrays;
import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		// 중복 없는 행운의 숫자 6개 뽑기
		int[] lotto = new int[6];
		Random rd = new Random();
		
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = rd.nextInt(45)+1;
			for(int j = 0; j<i; j++) {
				if(lotto[i] == lotto[j]) { // 만약 배열에 중복 값이 있다면, 
					i--; // i를 하나 빼서 다시 번호를 받아라!!
				}
			}
		}
		Arrays.sort(lotto);
		System.out.println("행운의 숫자: "+Arrays.toString(lotto));
	}
}

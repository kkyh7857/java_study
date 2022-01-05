import java.util.Arrays;
import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		// �ߺ� ���� ����� ���� 6�� �̱�
		int[] lotto = new int[6];
		Random rd = new Random();
		
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = rd.nextInt(45)+1;
			for(int j = 0; j<i; j++) {
				if(lotto[i] == lotto[j]) { // ���� �迭�� �ߺ� ���� �ִٸ�, 
					i--; // i�� �ϳ� ���� �ٽ� ��ȣ�� �޾ƶ�!!
				}
			}
		}
		Arrays.sort(lotto);
		System.out.println("����� ����: "+Arrays.toString(lotto));
	}
}

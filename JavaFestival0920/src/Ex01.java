import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// ���ڰ� ��� 1���� �迭�� �־����� ��, �ΰ��� ���ڸ� �̾�, ������ �Ÿ��� ��
		// �Ÿ��� ���� ���� ������ ��ġ(index)�� ���.
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		// ���� �� �����
		int min = Math.abs(point[0] - point[1]);
		// point! ���밪�� ���� ���� Math�Լ��� abs�żҵ带 Ȱ���Ѵ�.!!
		// ��ǥ �����ϱ�
		int a = 0;
		int b = 0;
		// �迭�� �Ÿ����� ����ϱ�, �ݺ����� �۾�.
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {
				if (i != j) {
					if(min>Math.abs(point[i]-point[j])) {
						min = Math.abs(point[i] - point[j]);
						a = i;
						b = j;						
					}
				}
			}
		}
		// ��� �� ���.
		System.out.println("result = [" + a + "," + b + "]");
	}

}

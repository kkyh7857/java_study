import java.util.ArrayList;

public class foreach {

	public static void main(String[] args) {
//		for_each
//		�迭, ArrayList�� ��ĭ�� ����Ʈ�ϴ�
//			for(���� :�迭�� ���۷��� ����) {
//				�ݺ��۾���;
//			}
		int arr[] = {1,2,3,4,5,6};
		int sum = 0;
//		for(int �ӽ� ����: �迭�̸�)
//			�ݺ��۾���;
		for(int x: arr) {
			sum += x;			
		}
		System.out.println("�հ�: "+sum);

		int arr2[] = {1,2,3,4,5,6};
		int sum2 = 0;
		for(int x: arr2) {
			System.out.print(x+" ");
			sum2 += x; 
		}
		System.out.println("�հ�"+sum2);
	}

}

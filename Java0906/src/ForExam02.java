
public class ForExam02 {

	public static void main(String[] args) {
		// 1~20���� ���ڸ� ���.
		// Ȧ���� ����� ����ϰ�, ¦���� ������ ���.

//		for(int num = 1; num<=20; num++) {
//		���ǹ� Ǯ��
//			if(num%2==1) {
//				System.out.print(num+" ");
//			}else {
//				System.out.print(-num+" ");
//			}
//		}
//		���׿����� Ǯ��
//			int c = (num%2==1)?num:-num;
//			System.out.print(c + " ");
//		for�� ���� �߰��� Ǯ�� �ϴ� ��.
		for (int even = 2, odd = 1; even <= 20 || odd <= 20; even += 2, odd += 2) {
			System.out.print(odd + " " + -even + " ");
		}
//		for(int num = 1, i = -1; num<=20;num++) {
//			i*=-1;
//			System.out.print(i*num+" ");
//		}

	}

}

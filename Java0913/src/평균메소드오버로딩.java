import java.util.Scanner;

public class ��ո޼ҵ�����ε� {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("����: ");
//		int kor = sc.nextInt();
//		System.out.print("����: ");
//		int eng = sc.nextInt();
//		System.out.print("����: ");
//		int math = sc.nextInt();
//
//		double are = mean(kor, eng, math);
//		System.out.println(are);
		double are = mean(80, 70, 61, 90);
		System.out.println(are);
	}

	// �޼ҵ� ���� : kor, eng, math
	public static double mean(int kor, int eng, int math) {
		double result = (kor + eng + math) / 3.0;

		return result;
	}

	// �޼ҵ� �ߺ� ���� : ���� �̸��� �޼ҵ带 �����ϴ� ��(method overloading)
	// �Ű������� ������ Ÿ���̳� ������ �ٸ��� �ۼ��ؾ� ����
	public static double mean(int kor, int eng, int math, int java) {
		double result = (kor + eng + math + java) / 4.0;

		return result;
	}
	// �� ���� ������ �Ǽ��� �Է�
	public static double mean(double kor, double eng, double math) {
		double result = (kor + eng + math) / 3.0;

		return result;
	}
	
	
}
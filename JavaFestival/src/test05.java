import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		// A, B �� ���� �Է� �޾�
		// A-B�� ���
		// A, B ��� 0 �Է� �� ���α׷� ����
		
		Scanner sc = new Scanner(System.in);
		int numA, numB;
		while(true) {
			System.out.print("A �Է�: ");
			numA = sc.nextInt();
			System.out.print("B �Է�: ");
			numB = sc.nextInt();
			int ans = numA - numB ;
			if(numA == 0 && numB == 0) {
				break;
			}
			System.out.println("���: " + ans);
			
		}
//		do{
//			System.out.print("A �Է�: ");
//			numA = sc.nextInt();
//			System.out.print("B �Է�: ");
//			numB = sc.nextInt();
//			int ans = numA - numB ;
//			System.out.println("���: " + ans);
//		}while(numA != 0 && numB != 0);
		
		

	}

}

import java.util.Scanner;

public class JavaEx02 {

	public static void main(String[] args) {
		// ȸ������, �α���, ����

		Scanner sc = new Scanner(System.in);
		System.out.println("==== ȸ������ �ý��� ====");
		//Ƚ���� ������ ���� ����
		for(int i = 0; i<1;) { 
			System.out.println("1.ȸ������ 2.�α��� 3.����");
			int num = sc.nextInt();
					 
			if (num == 1) {
				System.out.println("===ȸ������===");
			
			} else if (num == 2) {
				System.out.println("===�α���===");
			
			} else if (num == 3) {
				System.out.println("===����===");
				break;
			} else {
				System.out.println("===�߸��Է�===");
			}
		}
		
		while(true) {
			System.out.println("1.ȸ������ 2.�α��� 3.����");
			int num = sc.nextInt();
					 
			if (num == 1) {
				System.out.println("===ȸ������===");
			
			} else if (num == 2) {
				System.out.println("===�α���===");
			
			} else if (num == 3) {
				System.out.println("===����===");
				break;
			} else {
				System.out.println("===�߸��Է�===");
			}
		}
	
	}

}

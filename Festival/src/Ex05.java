import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// A, B���� �Է�, a-b���, a,b 0 ����
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("A�Է�>> ");
			int a = sc.nextInt();
			System.out.print("B�Է�>> ");
			int b = sc.nextInt();
			if(a==0 && b==0) {
				break;
			}
			System.out.println("��� >> " + (a-b));
		}
		sc.close();
	}

}

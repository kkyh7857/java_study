import java.util.Scanner;

public class switch02 {

	public static void main(String[] args) {
		
		System.out.println("�����Է�> ");
		Scanner sc = new Scanner(System.in);
		int totalScore = sc.nextInt();
		if(totalScore>100) {
			System.out.print("100�� �̻��� ...");
		}
		else {
		switch(totalScore/10) { // (�� ����� �� ��!)
		case 10:
		case 9:
			System.out.println("A�����Դϴ�.");
			break;
		case 8:
			System.out.println("B�����Դϴ�.");
			break;
		case 7:
			System.out.println("C�����Դϴ�.");
			break;
		default:
			System.out.println("D�����Դϴ�.");
		}
		}
		System.out.println("�����ϼ̽��ϴ�.");

	}

}

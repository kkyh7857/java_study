import java.util.Scanner;

public class ���ǹ��ǽ�05 {

	public static void main(String[] args) {
		// int Ÿ���� ���� grade�� �����ϰ� Ű����� ���� �Է�
		// grade�� 90�̻��̸� 'A�����Դϴ�.'
		// 80�� �̻� 90�� �̸��� ��� b�����Դϴ�.
		// 70�� �̻� 80�� �̸��� ��� c�����Դϴ�. 
		//�� �ܿ��� ȭ����! ���
		
		System.out.print("���� �Է�>> ");
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
				
		if(grade>=90) {
			System.out.println("A�����Դϴ�.");
		}else if(grade>=80) {
			System.out.println("B�����Դϴ�.");
		}else if(grade>=70) {
			System.out.println("C�����Դϴ�.");
		}
		if(grade>=60) {
			System.out.println("D");
		}
		if(grade>=50) {
			System.out.println("���Ф�");
		}
			
	}

}

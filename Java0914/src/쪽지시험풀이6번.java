import java.util.Scanner;

public class ��������Ǯ��6�� {

	public static void main(String[] args) {
		
		String[] f = {"���", "Ű��", "����", "�ڸ�", "����", "������", "����"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ã�� ���� ����: ");
		String input = sc.next();
		
		for(int i = 0; i<f.length; i++) {
			if(input.equals(f[i])) {
				System.out.println("����� ã�� ������ " + i+1 + " ���� �ֽ��ϴ�.");
				break;
			}
		}
		System.out.print("ã�� ������ �����ϴ�.");

	}

}

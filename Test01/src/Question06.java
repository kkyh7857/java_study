import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		// ���ڿ� �����͸� ������ �� �ִ� �迭 fruits
		// ���ϴ� ������ ���° �ִ��� ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		
		String[] fruits = {"�ڸ�", "����", "�ٳ���", "���"};
		
		System.out.print("ã�� ���� ����: ");
		String wantFruits = sc.next();
		
		for(int i = 0; i<fruits.length; i++) {
			if(wantFruits.equals(fruits[i])) {
				System.out.print(fruits[i]+"�� ��ġ�� " + (i+1) + "���� �ֽ��ϴ�.");
			}
		}
		System.out.println("ã�� ������ �����ϴ�.");
	}
}

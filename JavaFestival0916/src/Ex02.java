import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// �Էµ� ���忡 ���Ե� ���ĺ��� �󵵸� ��ҹ��� ���� ���� ���ϴ� ���α׷�

		System.out.println("==== ���ĺ� �󵵼� ���ϱ�====");
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�:");
		char[] chstr = sc.nextLine().toCharArray();
				
		for (char ch1 = 'a', ch2 = 'A'; ch1 <= 'z'; ch1++, ch2++) {
			
			int count = 0;
			for (int i = 0; i < chstr.length; i++) {
				if (chstr[i] == ch1 || chstr[i] == ch2) {				
					count++;
				}
			}
			System.out.println(ch1+":"+count);
		}
	}
}

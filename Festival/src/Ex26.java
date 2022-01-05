import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("ют╥б>>");
		char[] chstr = sc.nextLine().toCharArray();

		for (char ch = 'a', ch2 = 'A'; ch < 'z'; ch++, ch2++) {
			
			int count = 0;
			for (int i = 0; i < chstr.length; i++) {
				if (chstr[i] == ch || chstr[i] == ch2) {
					count++;
				}
			}
			System.out.println(ch + "=" + count);
		}
		sc.close();
	}

}

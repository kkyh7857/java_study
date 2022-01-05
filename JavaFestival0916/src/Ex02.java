import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 입력된 문장에 포함된 알파벳의 빈도를 대소문자 구별 없이 구하는 프로그램

		System.out.println("==== 알파벳 빈도수 구하기====");
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력:");
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

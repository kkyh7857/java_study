package jf0915;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.CHAR_ARRAY;

public class jf0915_2 {

	private static final String String = null;

	public static void main(String[] args) {
		// ��� ���� ���ϱ�
		// getMiddle�޼ҵ带 �ϳ� �߰� �ϰ� ����� �ܾ �Է� �޾�, ��� ���ڸ� ��ȯ
		// power �� w

		Scanner sc = new Scanner(System.in);
		
		String s = "world class";
		System.out.println(s.substring(2,4)); //  substring�� 2,4�� �Ǿ� ������ 2,3�� ����Ѵ�.
		System.out.print("�Է�: ");
		String str = sc.next();
		System.out.println(getMiddle(str));

	}

	private static String getMiddle(String str) {
		String result;
		if(str.length()%2==0) {
			result = str.substring(str.length()/2-1,str.length()/2+1);
		}else {
			result = str.substring(str.length()/2, str.length()/2+1);
		}
		return result;
		
		
		
		
		
//		String[] str2 = str.split("");
//		String result_str = str2[str2.length/2];
//		if(str2.length%2==0) {
//			result_str = str2[str2.length/2-1]+result_str;
//		}
//		return result_str;
		
		
		
		
		
		
	}
//		String result_str;
//		if(str.length()%2==0) {
//			result_str = str.substring(str.length()/2-1, str.length()/2+1);
//		}else {
//			result_str = str.substring(str.length()/2, str.length()/2+1);
//		}
//		
//		return result_str;
//	}

}

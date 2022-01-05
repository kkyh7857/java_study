import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		// 나이를 입력 받아 
		// 초년(0~40), 중년(41~60), 노년(61~)으로 구분
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이입력: ");
		int age = sc.nextInt();
		
		if(age<=40) {
			System.out.print("초년");
		}else if(age<=60) {
			System.out.print("중년");
		}else {
			System.out.print("노년");
		}
		
	}
}

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// A, B숫자 입력, a-b출력, a,b 0 종료
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("A입력>> ");
			int a = sc.nextInt();
			System.out.print("B입력>> ");
			int b = sc.nextInt();
			if(a==0 && b==0) {
				break;
			}
			System.out.println("결과 >> " + (a-b));
		}
		sc.close();
	}

}

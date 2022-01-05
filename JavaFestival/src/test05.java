import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		// A, B 두 수를 입력 받아
		// A-B를 출력
		// A, B 모두 0 입력 시 프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		int numA, numB;
		while(true) {
			System.out.print("A 입력: ");
			numA = sc.nextInt();
			System.out.print("B 입력: ");
			numB = sc.nextInt();
			int ans = numA - numB ;
			if(numA == 0 && numB == 0) {
				break;
			}
			System.out.println("결과: " + ans);
			
		}
//		do{
//			System.out.print("A 입력: ");
//			numA = sc.nextInt();
//			System.out.print("B 입력: ");
//			numB = sc.nextInt();
//			int ans = numA - numB ;
//			System.out.println("결과: " + ans);
//		}while(numA != 0 && numB != 0);
		
		

	}

}

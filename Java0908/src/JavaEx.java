import java.util.Scanner;

public class JavaEx {

	public static void main(String[] args) {
		// 정답이 있을 때 사용자로부터 답을 입력 받아 결과를 출력하고
		// 총점을 출력하는 프로그램

		
		// 배열의 번호를 잘 알아야 한다.★★★
		// 배열의 번호는 0번부터 시작한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("==채점하기==");
		int total = 0;
		int[] ans = { 1, 2, 3, 4, 5 }; //ans의 번호는 0~4번
		int[] input = new int[5];

		System.out.println("답을 입력하세요");
		
		// 1. 사용자에게 정답을 입력 받는 구간
		for (int i = 0; i < 5; i++) {
			System.out.print(i+1 + "번 답: ");
			input[i] = sc.nextInt(); // input은 0~4번까지
		}
		
		// 2. 입력받은 값과 실제 정답을 비교하는 구간
		System.out.print("정답확인: ");
		for (int j = 0; j < ans.length; j++) { // 0~4번으로 나와야 한다.
			if (input[j] == ans[j]) {  
				total += 20;
				System.out.print("0 ");
			} else {
				System.out.print("X ");
			}
		}
		
		// 3. 전체 총점을 출력하는 구간
		System.out.print("총점: " + total);

	}

}














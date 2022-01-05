import java.util.Scanner;

public class StarPoint03 {

	public static void main(String[] args) {
		// 4단 트리 만들기(힌트: 반복이 여러번 들어감)
		//      *   51
		
		//     ***  43
		//    ***** 35
		//     ***  43
		//    ***** 35
		//   *******27
		//     ***  43
		//    ***** 35
		//   *******27
		//  *********19
		//     ***   43
		//    *****  35
		//   ******* 27
		//  *********19
		// ***********011
		Scanner sc = new Scanner(System.in);
		System.out.println("트리 크기: ");
		int size = sc.nextInt();
		
		
		for (int i = 0; i < 5; i++) { //1단의 줄기
			System.out.print(" ");
		}
		for (int i = 0; i < 1; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		for (int dan = 5; dan <= size; dan += 2) { //2~4단까지 반복
			for (int up = 3, down = 4; up <= dan; up += 2, down--) { //각 단의 줄기 반복
				for (int i = 0; i < down; i++) { //공백 반복
					System.out.print(" ");
				}
				for (int i = 0; i < up; i++) { //별 반복
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}

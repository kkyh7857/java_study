import java.util.Scanner;

public class StarPoint03 {

	public static void main(String[] args) {
		// 4�� Ʈ�� �����(��Ʈ: �ݺ��� ������ ��)
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
		System.out.println("Ʈ�� ũ��: ");
		int size = sc.nextInt();
		
		
		for (int i = 0; i < 5; i++) { //1���� �ٱ�
			System.out.print(" ");
		}
		for (int i = 0; i < 1; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		for (int dan = 5; dan <= size; dan += 2) { //2~4�ܱ��� �ݺ�
			for (int up = 3, down = 4; up <= dan; up += 2, down--) { //�� ���� �ٱ� �ݺ�
				for (int i = 0; i < down; i++) { //���� �ݺ�
					System.out.print(" ");
				}
				for (int i = 0; i < up; i++) { //�� �ݺ�
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}

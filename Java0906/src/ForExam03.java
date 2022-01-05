
public class ForExam03 {

	public static void main(String[] args) {
		// 1단~ 9단까지 출력.

		for (int i = 2; i <= 9; i++) { // 첫번째 숫자 올림, 변위 변수 하나만 움직임.
			System.out.print(i + "단: "); // 단 출력
			for (int j = 1; j < 10; j++) // 두번째 숫자 올림
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			System.out.println();

		}
//		int i = 1;
//		while (true) {
//			i++;
//			System.out.print(i + "단: ");
//			int j = 1;
//			while (true) {
//				System.out.print(i + "*" + j + "=" + i * j + "\t");
//				j++;
//				if (j >= 10) {
//					break;
//				}
//			}
//			System.out.println();
//			if (i >= 9) {
//				break;
//			}
//		}
	}
}

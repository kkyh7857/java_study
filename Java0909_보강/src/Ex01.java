
public class Ex01 {

	public static void main(String[] args) {
		// 좋아하는 숫자 5번 출력하기

//		for(int i = 0; i<5; i++) {
//			System.out.println("5");
//		}
//		for (int i = 1; i <= 10; i++) {
//			System.out.print(i + " ");
//		}

		for (int i = 1; i <= 10; i++) {
			if (i % 3 != 0)
				System.out.print(i + " ");
		}
		System.out.println();
		int i = 0;
		while (true) {
			i++;
			if (i <= 10) {
				if (i % 3 != 0)
					System.out.print(i + " ");
			} else if (i > 10) {
				break;
			}
		}
//		System.out.println();

//		do {
//			i++;
//			if(i%3 != 0) {
//				System.out.print(i + " ");
//			}
//		}while(i<10);

	}

}

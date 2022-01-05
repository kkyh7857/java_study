import java.util.Scanner;

public class JavaFestivalEx {

	public static void main(String[] args) {
		// 입력 한 수에 따라 별점 모래시계 모양 만들기
		Scanner sc = new Scanner(System.in);
		System.out.print("행 수: ");
		int v = sc.nextInt();
		     //
		for(int space = 1, star = v; star>=1; star-=2, space++) {
			for(int i = 0; i<space; i++) {
				System.out.print(" ");
			}
			for(int i = 0; i<star; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int space = v-(v-v/2), star = 3; space>=1; star+=2, space--) {
			for(int i = 0; i<space; i++) {
				System.out.print(" ");
			}
			for(int i = 0; i<star; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

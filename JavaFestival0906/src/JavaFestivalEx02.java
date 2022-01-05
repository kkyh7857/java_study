import java.util.Scanner;

public class JavaFestivalEx02 {

	public static void main(String[] args) {
		//입력 받은 수에 맞는 마름모 만들기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int v = sc.nextInt();
		
		for(int space = v-v/2, star = 1; space>=1; star +=2, space--) {
			for(int i = 0; i<space; i++) {
				System.out.print(" ");
			}
			for(int i = 0; i<star; i++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int space = 2, star = v-2; star>=1; star-=2, space++) {
			for(int i = 0; i<space; i++) {
				System.out.print(" ");
			}
			for(int i = 0; i<star; i++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}

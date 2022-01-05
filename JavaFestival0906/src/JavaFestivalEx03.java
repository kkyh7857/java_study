
public class JavaFestivalEx03 {

	public static void main(String[] args) {
		// 하트 만들기
		for(int space = 2, star = 3; space<=5; space+=3) {
			for(int i = 0; i<space; i++)
				System.out.print(" ");
			for(int i = 0; i<star; i++)
				System.out.print("*");
		}
		System.out.println();
		for(int space = 1, star = 5; space<=3; space+=2) {
			for(int i = 0; i<space; i++)
				System.out.print(" ");
			for(int i = 0; i<star; i++)
				System.out.print("*");
		}	
		System.out.println();
		for(int i = 0; i<2; i++) {
			for(int star = 1; star<=15; star++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int space = 1, star = 13; star>=1; space+=2, star-=4) {
			for(int i = 0; i<space; i++)
				System.out.print(" ");
			for(int i = 0; i<star; i++)
				System.out.print("*");
			System.out.println();
		}
		
	}

}

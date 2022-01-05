
public class StarPoint03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int space = 4, star = 1; space >= 1; space--, star+=2) {
			// 처음 시작은 빈 칸 4칸과 별 1칸으로 시작 한다. 
			// 다음 줄에서 빈 칸은 3칸이 되고 별은 3칸이 된다.
			// 빈 칸은 1칸씩 줄어들고 별은 2칸씩 늘어난다.
			// 마지막으로 빈칸은 1칸이 되고, 별은 7칸이 된다.
			for (int i = 0; i < space; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < star; i++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int space = 2, star = 5; star>=1; space++, star-=2) {
			// 처음 시작은 빈 칸 2칸과 별 5칸으로 시작 한다. 
			// 다음 줄에서 빈 칸은 3칸이 되고 별은 3칸이 된다.
			// 빈 칸은 1칸씩 늘어나고 별은 2칸씩 줄어든다.
			// 마지막으로 빈칸은 4칸이 되고, 별은 1칸이 된다.
			for(int i = 0; i< space; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < star; i++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}

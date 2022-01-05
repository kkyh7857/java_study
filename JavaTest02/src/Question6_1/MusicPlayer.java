package Question6_1;

import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====뮤직플레이어====");
		MusicController controller = new MusicController(); 
		
		while (true) {
			System.out.print("1.등록 2.목록 3.실행 4.이전곡 5.다음곡 6.종료>>");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.print("제목: ");
				String title = sc.next();
				System.out.print("가수: ");
				String singer = sc.next();
				System.out.print("시간: ");
				int playTime = sc.nextInt();
				controller.music.add(new MusicVO(title, singer, playTime));
			} else if (choice == 2) {
				System.out.println("====노래 목록====");
				controller.printMusicList();
			} else if (choice == 3) {
				System.out.println("====실행====");
				controller.play();
			} else if (choice == 4) {
				System.out.println("====이전 곡====");
				controller.preplay();
			} else if (choice == 5) {
				System.out.println("====다음 곡====");
				controller.nextplay();
			} else if (choice == 6) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
			
		}
		sc.close();
	}

}

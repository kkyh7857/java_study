package View;

import java.util.Scanner;

import Controller.MusicPlayer;

// 화면 표현 + 프로그램 시작 점 >> view 역할
public class ConsolMain {
	public static void main(String[] args) {
		System.out.println("=======================");
		System.out.println("==== Young's Music ====");
		System.out.println("=======================");
		System.out.println("뮤직 플레이어 시작!!");
		
		Scanner sc = new Scanner(System.in);
		MusicPlayer player = new MusicPlayer();
		
		
		
		while(true) {
			System.out.println("[1]재생 [2]중지 [3]이전곡 [4]다음곡 [5]종료 ");
			int choice = sc.nextInt();
			
			if(choice == 1) { // 재생
				String musicinfo = player.play(); // 실제 동작하는 모습을 상상해 봐야한다. 입력인자: 재생을 누를 때 뭘 넣어야해?, 재생을 누르면 뭘 보여줘야해??   
				System.out.println("현재 "+ musicinfo +"가 재생중입니다.");
			}else if(choice == 2) { // 중지
				player.stop();
				System.out.println("음악이 중지 되었습니다.");
			}else if(choice == 3) { // 이전곡
				String musicinfo = player.prePlay();
				if(musicinfo == null) {
					System.out.println("재생 가능 한 이전 곡이 없습니다.");					
				}else {
					System.out.println("현재 "+ musicinfo +"가 재생중입니다.");
				}
			}else if(choice == 4) { // 다음곡
				String musicinfo = player.nextPlay();
				if(musicinfo == null) {
					System.out.println("재생 가능 한 다음 곡이 없습니다.");
				}else {
					System.out.println("현재 "+ musicinfo +"가 재생중입니다.");
				}
			}else if(choice == 5) { // 종료
				player.stop();
				System.out.println("프로그램이 종료 되었습니다. 즐거우셨나요?");
				System.out.println("좋으셨다면, 구독, 좋아요, 알림설정!!");
				System.out.println("다음에 또 만나요~ byebye~");
				break;
			}
			
		}
			
	}
}

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MusicController controller = new MusicController();
		ArrayList<MusicVO> MusicList = new ArrayList<MusicVO>();
		System.out.println("====뮤직플레이어====");
		while(true) {
		System.out.println("1.등록 2.목록 3.실행 4.이전곡 5.다름곡 6.종료>>");
		int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("====등록====");
				System.out.print("제목: ");
				String title = sc.next();
				System.out.print("가수: ");
				String singer = sc.next();
				System.out.print("시간: ");
				int playTime = sc.nextInt();
				MusicList.add(new MusicVO(title, singer, playTime));
			}else if(choice == 2) {
				if(MusicList.size()!=0) {
					
				}
			}else if(choice == 3) {
				
			}else if(choice == 4) {
				
			}else if(choice == 5) {
				
			}else if(choice == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
			
		}
	}

}

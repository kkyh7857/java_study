import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MusicController controller = new MusicController();
		ArrayList<MusicVO> MusicList = new ArrayList<MusicVO>();
		System.out.println("====�����÷��̾�====");
		while(true) {
		System.out.println("1.��� 2.��� 3.���� 4.������ 5.�ٸ��� 6.����>>");
		int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("====���====");
				System.out.print("����: ");
				String title = sc.next();
				System.out.print("����: ");
				String singer = sc.next();
				System.out.print("�ð�: ");
				int playTime = sc.nextInt();
				MusicList.add(new MusicVO(title, singer, playTime));
			}else if(choice == 2) {
				if(MusicList.size()!=0) {
					
				}
			}else if(choice == 3) {
				
			}else if(choice == 4) {
				
			}else if(choice == 5) {
				
			}else if(choice == 6) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else {
				System.out.println("��Ȯ�� ���ڸ� �Է����ּ���.");
			}
			
		}
	}

}

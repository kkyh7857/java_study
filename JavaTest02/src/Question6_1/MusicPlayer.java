package Question6_1;

import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====�����÷��̾�====");
		MusicController controller = new MusicController(); 
		
		while (true) {
			System.out.print("1.��� 2.��� 3.���� 4.������ 5.������ 6.����>>");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.print("����: ");
				String title = sc.next();
				System.out.print("����: ");
				String singer = sc.next();
				System.out.print("�ð�: ");
				int playTime = sc.nextInt();
				controller.music.add(new MusicVO(title, singer, playTime));
			} else if (choice == 2) {
				System.out.println("====�뷡 ���====");
				controller.printMusicList();
			} else if (choice == 3) {
				System.out.println("====����====");
				controller.play();
			} else if (choice == 4) {
				System.out.println("====���� ��====");
				controller.preplay();
			} else if (choice == 5) {
				System.out.println("====���� ��====");
				controller.nextplay();
			} else if (choice == 6) {
				System.out.println("���α׷� ����");
				break;
			} else {
				System.out.println("��Ȯ�� ���ڸ� �Է����ּ���.");
			}
			
		}
		sc.close();
	}

}

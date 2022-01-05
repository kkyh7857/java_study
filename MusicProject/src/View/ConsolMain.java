package View;

import java.util.Scanner;

import Controller.MusicPlayer;

// ȭ�� ǥ�� + ���α׷� ���� �� >> view ����
public class ConsolMain {
	public static void main(String[] args) {
		System.out.println("=======================");
		System.out.println("==== Young's Music ====");
		System.out.println("=======================");
		System.out.println("���� �÷��̾� ����!!");
		
		Scanner sc = new Scanner(System.in);
		MusicPlayer player = new MusicPlayer();
		
		
		
		while(true) {
			System.out.println("[1]��� [2]���� [3]������ [4]������ [5]���� ");
			int choice = sc.nextInt();
			
			if(choice == 1) { // ���
				String musicinfo = player.play(); // ���� �����ϴ� ����� ����� �����Ѵ�. �Է�����: ����� ���� �� �� �־����?, ����� ������ �� ���������??   
				System.out.println("���� "+ musicinfo +"�� ������Դϴ�.");
			}else if(choice == 2) { // ����
				player.stop();
				System.out.println("������ ���� �Ǿ����ϴ�.");
			}else if(choice == 3) { // ������
				String musicinfo = player.prePlay();
				if(musicinfo == null) {
					System.out.println("��� ���� �� ���� ���� �����ϴ�.");					
				}else {
					System.out.println("���� "+ musicinfo +"�� ������Դϴ�.");
				}
			}else if(choice == 4) { // ������
				String musicinfo = player.nextPlay();
				if(musicinfo == null) {
					System.out.println("��� ���� �� ���� ���� �����ϴ�.");
				}else {
					System.out.println("���� "+ musicinfo +"�� ������Դϴ�.");
				}
			}else if(choice == 5) { // ����
				player.stop();
				System.out.println("���α׷��� ���� �Ǿ����ϴ�. ��ſ�̳���?");
				System.out.println("�����̴ٸ�, ����, ���ƿ�, �˸�����!!");
				System.out.println("������ �� ������~ byebye~");
				break;
			}
			
		}
			
	}
}

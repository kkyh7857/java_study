package Controller;

import java.util.ArrayList;

import Model.Music;
import javazoom.jl.player.MP3Player;

// ���� �÷��̾� �ٽ� �˰��� ����ϴ� Ŭ����
// Music�� ConsolMain�� �߰��ٸ� controller
public class MusicPlayer { // MusicPlayer�� ȣ�� �� ��
	
	private ArrayList<Music> MusicList; // �뷡 ������ ��� �ִ� ��.
	private int currentIndex; // �����÷��̾�� ���� ������� �뷡�� �ε���
	private MP3Player mp3 = new MP3Player(); // ���� ��� ����

	public MusicPlayer() {
		MusicList = new ArrayList<Music>();
		Music m = new Music("Butter", "BTS", 180, "�۰1", "C:\\Users\\smhrd\\Desktop\\music\\bts.mp3");
		MusicList.add(m);
		MusicList.add(new Music("���¿쿬", "������", 200, "�۰2", "C:\\Users\\smhrd\\Desktop\\music\\haize_real.mp3"));
		MusicList.add(new Music("NEST Level", "������", 180, "�۰3", "C:\\Users\\smhrd\\Desktop\\music\\next.mp3"));
	}

	public String play() {
		// �뷡 ��� �� ù��° �뷡�� ã�� ���
		Music m = MusicList.get(currentIndex);
		// ���� ���
		String path = m.getMusicPath();
		mp3.play(path);
		// �뷡����(����) ���ڿ��� + ������ �����ϴ�!!
		return m.getsongName() + "(" + m.getsinger() + ")";
	}

	// ���� ��
	public String nextPlay() {
		// 1. �뷡 ����Ʈ���� ���� ���� ������
		if (MusicList.size() - 1 > currentIndex) {
			Music m = MusicList.get(++currentIndex);
			// �뷡�� ������̶�� ���߰� �ٽ� �����϶�
			stopAndGo();
			// 2. �뷡����(����) ���·� ����
			return m.getsongName() + "(" + m.getsinger() + ")";
		} else {
			return null;
		}
	}

	// ���� ��
	public String prePlay() {
		if (currentIndex > 0) {
			Music m = MusicList.get(--currentIndex);
			// �뷡�� ������̶�� ���߰� �ٽ� �����϶�
			stopAndGo();
			// 2. �뷡����(����) ���·� ����
			return m.getsongName() + "(" + m.getsinger() + ")";
		} else {
			return null;
		}
	}

	// ����
	public void stop() {
		if (mp3.isPlaying()) { // �뷡�� ������̶��
			mp3.stop(); // ����
		}
	}
	// ��� ���̶�� ���߰� �����϶�
	public void stopAndGo() {
		// �뷡�� ������̶��
		Music m = MusicList.get(currentIndex);
		if (mp3.isPlaying()) {
			mp3.stop(); // ����
		}
		// ���� ���
		String path = m.getMusicPath();
		mp3.play(path);
	}
}

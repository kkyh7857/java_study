package Controller;

import java.util.ArrayList;

import Model.Music;
import javazoom.jl.player.MP3Player;

// 음악 플레이어 핵심 알고리즘를 담당하는 클래스
// Music과 ConsolMain의 중간다리 controller
public class MusicPlayer { // MusicPlayer가 호출 될 때
	
	private ArrayList<Music> MusicList; // 노래 정보를 담고 있는 놈.
	private int currentIndex; // 뮤직플레이어에서 현재 재생중인 노래의 인덱스
	private MP3Player mp3 = new MP3Player(); // 음원 재생 도구

	public MusicPlayer() {
		MusicList = new ArrayList<Music>();
		Music m = new Music("Butter", "BTS", 180, "작곡가1", "C:\\Users\\smhrd\\Desktop\\music\\bts.mp3");
		MusicList.add(m);
		MusicList.add(new Music("헤픈우연", "헤이즈", 200, "작곡가2", "C:\\Users\\smhrd\\Desktop\\music\\haize_real.mp3"));
		MusicList.add(new Music("NEST Level", "에스파", 180, "작곡가3", "C:\\Users\\smhrd\\Desktop\\music\\next.mp3"));
	}

	public String play() {
		// 노래 목록 중 첫번째 노래를 찾아 재생
		Music m = MusicList.get(currentIndex);
		// 음악 재생
		String path = m.getMusicPath();
		mp3.play(path);
		// 노래제목(가수) 문자열은 + 연산이 가능하다!!
		return m.getsongName() + "(" + m.getsinger() + ")";
	}

	// 다음 곡
	public String nextPlay() {
		// 1. 노래 리스트에서 다음 곡을 꺼내고
		if (MusicList.size() - 1 > currentIndex) {
			Music m = MusicList.get(++currentIndex);
			// 노래가 재생중이라면 멈추고 다시 실행하라
			stopAndGo();
			// 2. 노래제목(가수) 형태로 리턴
			return m.getsongName() + "(" + m.getsinger() + ")";
		} else {
			return null;
		}
	}

	// 이전 곡
	public String prePlay() {
		if (currentIndex > 0) {
			Music m = MusicList.get(--currentIndex);
			// 노래가 재생중이라면 멈추고 다시 실행하라
			stopAndGo();
			// 2. 노래제목(가수) 형태로 리턴
			return m.getsongName() + "(" + m.getsinger() + ")";
		} else {
			return null;
		}
	}

	// 정지
	public void stop() {
		if (mp3.isPlaying()) { // 노래가 재생중이라면
			mp3.stop(); // 중지
		}
	}
	// 재생 중이라면 멈추고 실행하라
	public void stopAndGo() {
		// 노래가 재생중이라면
		Music m = MusicList.get(currentIndex);
		if (mp3.isPlaying()) {
			mp3.stop(); // 중지
		}
		// 음악 재생
		String path = m.getMusicPath();
		mp3.play(path);
	}
}

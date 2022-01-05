package Question6_1;

import java.util.ArrayList;

public class MusicController {
	ArrayList<MusicVO> music = new ArrayList<MusicVO>();
	int index = 0;
	
	public void printMusicList() {
		for (int i = 0; i < music.size(); i++) {
			System.out.println(music.get(index).toString());
		}
	}

	public void play() {
		System.out.println(music.get(index).toString());
	}


	public void nextplay() {
		index++;
		if(index<music.size()) {
			System.out.println(music.get(index).toString());
		}else {
			index--;
		}
	}
	public void preplay() {
		index--;
		if(index>=0) {
			System.out.println(music.get(index).toString());
		}else {
			index++;
		}
	}
}


public class MusicVO {
	String title;
	String singer;
	int playTime;
	
	public MusicVO(String title, String singer, int playTime) {
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
	}
	public MusicVO() {
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	
	
}

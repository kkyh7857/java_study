package Question6_1;

public class MusicVO {

	String title;
	String singer;
	int playTime;
	
	public MusicVO(String title, String singer, int playTime) {
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
	}

	public void getTitle() {
		System.out.print(this.title);
	}

	public String setTitle(String title) {
		return title;
	}

	public void getSinger() {
		System.out.print(this.singer);
	}

	public String setSinger(String singer) {
		return singer;
	}

	public void getPlayTime() {
		System.out.print(this.playTime);
	}

	public int setPlayTime(int playTime) {
		return playTime;
	}
	public String toString() {
		return "�뷡 ����: "+ this.title + "\t���� �̸�: " + this.singer + "\t�뷡����" + this.playTime ;
	}
	
	
	
}

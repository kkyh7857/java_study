package Model;
// ���� ������<< �� ������ Ŭ����
public class Music {
	// �뷡 ����, ����, ����, �뷡����, ����ð�, �۰, �ٹ���Ʈ
	private String songName;
	private String singer;
	private String Lyrics;
	private int playTime;
	private String songWriter;
	private String albumArtPath; // �ٹ���Ʈ �̹��� ���
	private String musicPath; // ���� ���� ���
	
	// ������ : ��ü�� ������ �� ȣ��Ǵ� �޼ҵ�, 
	// ������ Ư¡ : �޼ҵ� ��ȯŸ���� ����(void�� ����), �޼ҵ� �̸��� Ŭ���� �̸��� ����.
	//           ��ü ������ �� �ѹ��� ȣ��
	// using field (������): ������ ���� �� ��, ()���� ����� �ʱ�ȭ �Ѵ�.
	public Music(String songName, String singer, int playTime, String songWriter) {
		this.songName = songName;
		this.singer = singer;
		this.playTime = playTime;
		this.songWriter = songWriter;
	}
	// ������ �����ε�
	public Music(String songName, String singer, 
			int playTime, String songWriter, String musicPath) {
		this.songName = songName;
		this.singer = singer;
		this.playTime = playTime;
		this.songWriter = songWriter;
		this.musicPath = musicPath;
		
	}
	
	// �뷡 ������ ������ �޼ҵ�
	public String getsongName() {
		return songName;
	}
	public String getsinger() {
		return singer;
	}
	// ���� ��θ� ������ �޼ҵ�
	public String getMusicPath() {
		return musicPath;
	}
	
}

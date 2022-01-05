package Model;
// 음악 데이터<< 모델 역할의 클래스
public class Music {
	// 노래 제목, 가수, 가사, 노래길이, 재생시간, 작곡가, 앨범아트
	private String songName;
	private String singer;
	private String Lyrics;
	private int playTime;
	private String songWriter;
	private String albumArtPath; // 앨범아트 이미지 경로
	private String musicPath; // 음원 파일 경로
	
	// 생성자 : 객체를 생성할 때 호출되는 메소드, 
	// 생성자 특징 : 메소드 반환타입이 없다(void도 없다), 메소드 이름이 클래스 이름과 같다.
	//           객체 생성시 딱 한번만 호출
	// using field (생성자): 음악이 생성 될 때, ()안의 값들로 초기화 한다.
	public Music(String songName, String singer, int playTime, String songWriter) {
		this.songName = songName;
		this.singer = singer;
		this.playTime = playTime;
		this.songWriter = songWriter;
	}
	// 생성자 오버로딩
	public Music(String songName, String singer, 
			int playTime, String songWriter, String musicPath) {
		this.songName = songName;
		this.singer = singer;
		this.playTime = playTime;
		this.songWriter = songWriter;
		this.musicPath = musicPath;
		
	}
	
	// 노래 제목을 꺼내는 메소드
	public String getsongName() {
		return songName;
	}
	public String getsinger() {
		return singer;
	}
	// 음원 경로를 꺼내는 메소드
	public String getMusicPath() {
		return musicPath;
	}
	
}

// 게더타운에 들어가는 TV를 설계해보자!!
// class(설계도)
public class TV {
	// 필드(Data)
	String color; // tv 색상
	double inch;  // tv 화면 크기
	int channel; // tv 채널
	int volume; // tv 음량
	String brandName; // tv 제조사
	boolean isTurnOn; // 전원 상태
	boolean isLED; // True -> LED
	String resolution; //해상도
	
	// 메소드(Logic): 객체의 동작에 관여하는 부분(기능적인 부분 = 함수)
	public void trunOnOff() {   //파이썬은 메소드와 함수 모두를 사용한다.
		isTurnOn = !isTurnOn;
	}
	public void ChangeCh(int ch) {
		channel = ch;
	}
}
// 설계도로 부터 만들어진 대상: 객체
// created from the class: Object

// 게더타운에 들어가는 TV를 설계해보자!!
// class(설계도)
public class 서대희_클래스 {
	// 필드(Data)
	int hunger; // 허기짐
	boolean isAwake;
	int money = 500000;
	String hairStyle = "2대8";
	// 메소드(Logic): 객체의 동작에 관여하는 부분(기능적인 부분 = 함수)
	public void eatRiceNoodle(int amount) {//파이썬은 메소드와 함수 모두를 사용한다.
		hunger = amount * 100;
	}
	public void sleep() {
		isAwake = false;
	}
	public void getGift() {
		money -= 10000;
	}
	public void settingHair(String st) {
		hairStyle = st;
	}
}
//설계도로 부터 만들어진 대상: 객체
//created from the class: Object
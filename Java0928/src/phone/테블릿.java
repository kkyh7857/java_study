package phone;

public class 테블릿 extends 전화 {
	// 메소드 오버라이딩(재정의)_상속에서 일어남
	// 메소드 오버로딩(중복정의)_
	// 1. 상속관계에서 슈퍼클래스에서 물려받는 메소드를 서브클래스에서 바꾸는 것
	// 2. 메소드 구조(이름, 반환타입, 매개변수)는 동일하고 알고리즘만 변경
	public void 전화걸기() {System.out.println("화상통화 걸기");}
	public void 그림() {System.out.println("그림그리기");}
}

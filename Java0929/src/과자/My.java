package 과자;

public class My {

	//	public void eat(바나나 banana) {
	//		banana.open();
	//	}
	//
	//	public void eat(썬칩 sun) {
	//		sun.open();
	//	}
	//
	//	public void eat(양파링 onion) {
	//		onion.open();
	//	}
	//	
	// 하위의 클래스 객체를 한번에 다룰 수 있게, 
	// -> 업캐스팅 오버라이딩 된 기능을 한번에 다룰 수 있다.
	// 상위 클래스에 있는 필드와 메소드만 사용
	public void eat(스넥 snack) {
		snack.open();
	}
	
}

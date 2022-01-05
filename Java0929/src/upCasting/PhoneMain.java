package upCasting;

public class PhoneMain {

	public static void main(String[] args) {

		Phone p = new Phone();
		SmartPhone sp = new SmartPhone();
		
		p.call();
		sp.call();
		
		// 업케스팅
		// 자식클래스 타입의 객체를 부모타입 객체로 넣어줌
		// ==> 자동형변환
		
		Phone p2 = sp;
		p2.call();
		//다운 캐스팅: 업캐스팅 된 것을 자식 클래스 타입으로 일시적 형변환
		SmartPhone sp2 = (SmartPhone) p2;
		((SmartPhone) p2).wifi();
		sp2.wifi();
	}
}

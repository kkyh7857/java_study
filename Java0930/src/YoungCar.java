// 일반 클래스에서 인터페이스를 구현 할 때
public class YoungCar implements KartRider, KartRider2{
	// 클래스를 상속 받을 때, extends
	// 인터페이스를 구현할 때, implements
	
	int youngCarPosition = position;

	@Override // 어노테이션: 밑에 있는 메소드를 설명해줌
	//implements KartRider.go
	public void go(int num) {
		youngCarPosition += num;
	}

	@Override
	public void back(int num) {
		youngCarPosition -= num;
	}

	@Override
	public void buster(int num) {
		youngCarPosition *= num;
	}

	@Override
	public void parking() {
		System.out.println("주차");
	}

}

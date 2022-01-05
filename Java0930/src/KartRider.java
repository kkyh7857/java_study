
public interface KartRider {
	// 인터페이스 라는 공간이 만들어짐(설계도)
	// 카트(차) 만듬!
	// 1. 인터페이스는 변수가 아닌 상수만 선언해 줄 수 있다.== final(상수)
	// 상수 ==> 변하지 않는 수, 항상 같은 수
	final int position = 0; // 시작 위치를 지정해주는 필드
	
	// 추상 메소드 선언
	
	// 앞으로 가는 메소드
	public abstract void go(int num);
	
	// 뒤로가는 메소드
	public abstract void back(int num);
	
	// 부스터
	public abstract void buster(int num);

	// 인터페이스는 설계도! 기능을 정의하지 않고 선언만 해준다.(추상메소드)
	
}

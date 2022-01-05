package phone;

// 슈퍼 클래스
// 공통 기능
// 1. 다중 상속은 지원하지 않는다. 
//-> 뭘 상속해야 하는지 모르기 때문에 생산성이 떨어진다.
//-> 오류가 발생할 수 있다.
// 2. 상속의 깊이에는 제한을 두지 않는다.
// 3. 모든 클래스는 object를 기본적으로 상속하고 있다.
public class 전화 {
	public void 전화걸기() {System.out.println("전화 걸기");}
	public void 전화받기() {System.out.println("전화 받기");}
}

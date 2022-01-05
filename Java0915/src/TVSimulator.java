// Object
public class TVSimulator {
	public static void main(String[] args) {
		TV tv1 = new TV(); // tv1 = 객체; 객체를 생성한다.
		TV tv2 = new TV();
		// 객체 생성 문법!!(Object)
		// 클래스명 변수명  = new 클래스명();
		// 기본데이터 타입:
		// 사용자정의(래퍼런스)타입: 
		// 각각이 다른 주소에서 각각의 데이터를 가지고 할당된다.
		
		tv1.color = "red";
		tv2.color = "blue";
		
		tv1.trunOnOff();
		System.out.println(tv1.isTurnOn);
		
		tv1.ChangeCh(5);
		System.out.println(tv1.channel);
		
		tv1.trunOnOff();
		System.out.println(tv1.isTurnOn);
		
		
		
	}

}

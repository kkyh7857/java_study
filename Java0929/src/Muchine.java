
public class Muchine {
	// 오버로딩 중복정의
	// 오버라이딩 재정의
	
	// 각각의 인형을 뽑는 기능 만들기
//	public void run(Pika pika) {
//		pika.get();
//	}
//	
//	public void run(Piri piri) {
//		piri.get();
//	}
//	
//	public void run(Kkobuk kkobuk) {
//		kkobuk.get();
//	}
	
	// upcasting
	// 현재 Doll만 run을 사용 할 수 있다.
	// 그런데 상속으로 인해 pika, kkobuk, piri가 doll의 run을 사용 할 수 있다.
	// 동시에 doll의 값이 pika로 치환되면서, 출력시 가져다 쓴 친구의 출력 값이 나타가게 된다.
	// doll -> pika 로 되는 것이다. 그래서 pika.get(); 이 된다. 
	public void run(Doll doll) {
		doll.get();
	}
}

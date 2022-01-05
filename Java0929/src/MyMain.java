
public class MyMain {

	public static void main(String[] args) {
		// 기계를 통해 각각의 인형을 뽑아주세요~

		Muchine m = new Muchine();

		Kkobuk kkobuk = new Kkobuk();
		Pika pika = new Pika();
		Piri piri = new Piri();
		// 추상클래스의 일반 메소드 사용
		pika.get2();
		// upcasting

		m.run(kkobuk);
		m.run(pika);
		m.run(piri);
		// 추상클래스는 몸체가 없기 때문에 객체를 생성 할 수 없다.
		// 임시적으로 생성 가능하지만 거의 사용하지 않는다.
		// 추상클래스라는 것은 하위클래스에서 구현할 부분을 정의 해놓을거이기 때문에.
		
		// Upcasting
		Doll doll2 = new Pika();
		doll2.get();
	}
}

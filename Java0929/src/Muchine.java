
public class Muchine {
	// �����ε� �ߺ�����
	// �������̵� ������
	
	// ������ ������ �̴� ��� �����
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
	// ���� Doll�� run�� ��� �� �� �ִ�.
	// �׷��� ������� ���� pika, kkobuk, piri�� doll�� run�� ��� �� �� �ִ�.
	// ���ÿ� doll�� ���� pika�� ġȯ�Ǹ鼭, ��½� ������ �� ģ���� ��� ���� ��Ÿ���� �ȴ�.
	// doll -> pika �� �Ǵ� ���̴�. �׷��� pika.get(); �� �ȴ�. 
	public void run(Doll doll) {
		doll.get();
	}
}

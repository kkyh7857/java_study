
public class MyMain {

	public static void main(String[] args) {
		// ��踦 ���� ������ ������ �̾��ּ���~

		Muchine m = new Muchine();

		Kkobuk kkobuk = new Kkobuk();
		Pika pika = new Pika();
		Piri piri = new Piri();
		// �߻�Ŭ������ �Ϲ� �޼ҵ� ���
		pika.get2();
		// upcasting

		m.run(kkobuk);
		m.run(pika);
		m.run(piri);
		// �߻�Ŭ������ ��ü�� ���� ������ ��ü�� ���� �� �� ����.
		// �ӽ������� ���� ���������� ���� ������� �ʴ´�.
		// �߻�Ŭ������� ���� ����Ŭ�������� ������ �κ��� ���� �س������̱� ������.
		
		// Upcasting
		Doll doll2 = new Pika();
		doll2.get();
	}
}

package upCasting;

public class PhoneMain {

	public static void main(String[] args) {

		Phone p = new Phone();
		SmartPhone sp = new SmartPhone();
		
		p.call();
		sp.call();
		
		// ���ɽ���
		// �ڽ�Ŭ���� Ÿ���� ��ü�� �θ�Ÿ�� ��ü�� �־���
		// ==> �ڵ�����ȯ
		
		Phone p2 = sp;
		p2.call();
		//�ٿ� ĳ����: ��ĳ���� �� ���� �ڽ� Ŭ���� Ÿ������ �Ͻ��� ����ȯ
		SmartPhone sp2 = (SmartPhone) p2;
		((SmartPhone) p2).wifi();
		sp2.wifi();
	}
}

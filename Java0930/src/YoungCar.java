// �Ϲ� Ŭ�������� �������̽��� ���� �� ��
public class YoungCar implements KartRider, KartRider2{
	// Ŭ������ ��� ���� ��, extends
	// �������̽��� ������ ��, implements
	
	int youngCarPosition = position;

	@Override // ������̼�: �ؿ� �ִ� �޼ҵ带 ��������
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
		System.out.println("����");
	}

}

// �Դ�Ÿ� ���� TV�� �����غ���!!
// class(���赵)
public class TV {
	// �ʵ�(Data)
	String color; // tv ����
	double inch;  // tv ȭ�� ũ��
	int channel; // tv ä��
	int volume; // tv ����
	String brandName; // tv ������
	boolean isTurnOn; // ���� ����
	boolean isLED; // True -> LED
	String resolution; //�ػ�
	
	// �޼ҵ�(Logic): ��ü�� ���ۿ� �����ϴ� �κ�(������� �κ� = �Լ�)
	public void trunOnOff() {   //���̽��� �޼ҵ�� �Լ� ��θ� ����Ѵ�.
		isTurnOn = !isTurnOn;
	}
	public void ChangeCh(int ch) {
		channel = ch;
	}
}
// ���赵�� ���� ������� ���: ��ü
// created from the class: Object

// �Դ�Ÿ� ���� TV�� �����غ���!!
// class(���赵)
public class ������_Ŭ���� {
	// �ʵ�(Data)
	int hunger; // �����
	boolean isAwake;
	int money = 500000;
	String hairStyle = "2��8";
	// �޼ҵ�(Logic): ��ü�� ���ۿ� �����ϴ� �κ�(������� �κ� = �Լ�)
	public void eatRiceNoodle(int amount) {//���̽��� �޼ҵ�� �Լ� ��θ� ����Ѵ�.
		hunger = amount * 100;
	}
	public void sleep() {
		isAwake = false;
	}
	public void getGift() {
		money -= 10000;
	}
	public void settingHair(String st) {
		hairStyle = st;
	}
}
//���赵�� ���� ������� ���: ��ü
//created from the class: Object
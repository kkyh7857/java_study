
public class Tv {
	int channel;
	String color;
	
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	public void print() {
		System.out.println("Tv�� ���� ä���� : " + channel + "�̰�, Tv ������ " + color + "�Դϴ�.");
	}
}

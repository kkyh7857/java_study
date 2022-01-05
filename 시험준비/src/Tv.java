
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
		System.out.println("Tv의 현재 채널은 : " + channel + "이고, Tv 색깔은 " + color + "입니다.");
	}
}

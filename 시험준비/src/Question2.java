
public class Question2 {

	public static void main(String[] args) {

		Tv t = new Tv();
		
		t.channel = 7;
		t.color = "red";
		t.print(); // 현재 Tv의 상태 출력
		t.channelUp();
		t.channelUp();
		t.print();
		t.color="black";
		t.channelDown();
		t.print();
	}

}

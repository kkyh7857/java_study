package ����;

public class Main {

	public static void main(String[] args) {
		My my = new My();

		�ٳ��� banana = new �ٳ���();
		my.eat(banana);
		
		��Ĩ sun = new ��Ĩ();
		my.eat(sun);
		
		���ĸ� onion = new ���ĸ�();
		my.eat(onion);
		
		���� snack = banana;
		�ٳ��� banana2 = (�ٳ���)snack;
		((�ٳ���)snack).source();
		banana2.source();
		
	}

}

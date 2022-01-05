package 과자;

public class Main {

	public static void main(String[] args) {
		My my = new My();

		바나나 banana = new 바나나();
		my.eat(banana);
		
		썬칩 sun = new 썬칩();
		my.eat(sun);
		
		양파링 onion = new 양파링();
		my.eat(onion);
		
		스넥 snack = banana;
		바나나 banana2 = (바나나)snack;
		((바나나)snack).source();
		banana2.source();
		
	}

}

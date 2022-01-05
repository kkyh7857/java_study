package 상속기초;

public class 상속main {

	public static void main(String[] args) {
		휠마우스  h = new 휠마우스();
		h.우클릭();
		h.좌클릭();
		// h.드래그(); 메소드의 접근제한자가 private이면 상속이 불가하다.
		마우스 m = new 휠마우스();
		마우스 m2 = new 사운드마우스();
	}

}

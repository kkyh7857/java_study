
public class Main {

	public static void main(String[] args) {
		// 학생 성적을 관리하는 시스템
		// 학생 객체가 중요하다.
		
		// 객제 만들기
		// 클래스명 변수명 = new 클래스명();
		//                 생성자 호출
		// 생성자 : 클래스로부터 객체를 생성(메모리에 할당)
		Student st1 = new Student("황해도","11");
		Student st2 = new Student("임승환","22");
		Student st3 = new Student("서대희","33");
		
		st1.changeJava(90);
		st2.changeJava(85);
		st3.changeJava(10);
		
		
		
	}

}

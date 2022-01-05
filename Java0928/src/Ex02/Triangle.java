package Ex02;

public class Triangle extends Figure{
	// 밑변 X 높이 / 2
	private double width; // 밑변
	private double height; // 높이
	// static 공용변수 생성
	// 객체를 생성하지 않고 바로 클래스명으로 사용할 수 있다. 
	// 특정 객체에 속하지 않는 변수를 지정할 때 주로 사용된다. 
	// triangle 은 객체에 상관없이 모든 객체에 붙는 것이기 때문에 static을 붙여준다.
	// 쉽게 생각했을 때, 우리는 base,height 를 가지고 오기 위해 객체 tri를 생성했다. 
	// 이때, 객체 생성 보다 넓은 범위에서 name이라는 변수가 사용되기 때문에 
	// 변수가 메모리 할당 변수가 static이 붙은 것이다.
	private static String name = "Triangle";
	
	// 생성자
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// 넓이 계산 메소드
	// 메소드 오버라이딩 : 재정의
	public double calArea() {
		return width * height / 2;
	}
	public static String getName() {
		return name;
	}
}

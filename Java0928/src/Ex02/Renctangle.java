package Ex02;

public class Renctangle {
	// 가로 X 세로
	private double width;
	private double height;
	private static String name = "Renctangle";
	
	public Renctangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// 넓이 계산 메소드
	public double calArea() {
		return width * height;
	}
	public static String getName() {
		return name;
	}
}

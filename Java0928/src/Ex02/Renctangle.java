package Ex02;

public class Renctangle {
	// ���� X ����
	private double width;
	private double height;
	private static String name = "Renctangle";
	
	public Renctangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// ���� ��� �޼ҵ�
	public double calArea() {
		return width * height;
	}
	public static String getName() {
		return name;
	}
}

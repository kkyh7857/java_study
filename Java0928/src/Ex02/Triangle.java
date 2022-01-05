package Ex02;

public class Triangle extends Figure{
	// �غ� X ���� / 2
	private double width; // �غ�
	private double height; // ����
	// static ���뺯�� ����
	// ��ü�� �������� �ʰ� �ٷ� Ŭ���������� ����� �� �ִ�. 
	// Ư�� ��ü�� ������ �ʴ� ������ ������ �� �ַ� ���ȴ�. 
	// triangle �� ��ü�� ������� ��� ��ü�� �ٴ� ���̱� ������ static�� �ٿ��ش�.
	// ���� �������� ��, �츮�� base,height �� ������ ���� ���� ��ü tri�� �����ߴ�. 
	// �̶�, ��ü ���� ���� ���� �������� name�̶�� ������ ���Ǳ� ������ 
	// ������ �޸� �Ҵ� ������ static�� ���� ���̴�.
	private static String name = "Triangle";
	
	// ������
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// ���� ��� �޼ҵ�
	// �޼ҵ� �������̵� : ������
	public double calArea() {
		return width * height / 2;
	}
	public static String getName() {
		return name;
	}
}


public class Student {
	// �ʵ�
	private String name;// �̸�
	private String stuNumber; // �й�
	private int grade;// �г� 
	private int java;// �ڹ� ����
	private int web;// �� ����
	private int iot;// iot ����
	
	// �޼ҵ�
	// ������: ��ü�� �����ϴ� �޼ҵ�
	// 1. ��ȯŸ���� ����(void�� ���� �ʴ´�.)
	// 2. �޼ҵ� �̸��� Ŭ���� �̸��� ����
	// 3. �޸𸮿� ��ü ������ �Ҵ�
	// 4. ������ �� �� ���� ȣ�� 
	
	public Student(String name, String stuNumber) {
		this.name = name; // this(��ü �ڽ�).name(��ü���� ������ name)
		this.stuNumber = stuNumber;
		System.out.println("�л� ��ü ����");
	}
	
	// Java ������ �����ϴ� �޼ҵ�
	public void changeJava(int java) {
		this.java = java;
	}
	
	// web ������ �����ϴ� �޼ҵ�
	public void changeWeb(int web) {
		this.web = web;
	}
	
	// iot ������ �����ϴ� �޼ҵ�
	public void changeIot(int iot) {
		this.iot = iot;
	}
	
	public void change (int java, int web, int iot) {
		this.java = java;
		this.web = web;
		this.iot = iot;
	}
	
	public String getName() {
		return name;
	}
	
	
}

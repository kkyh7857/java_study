
public class Info {
	private String name;
	private int age;
	
	public Info(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public void setName(String name) {
		// ��ó���� ���� �� �ִ�.>> �ص����� ������µ�.....����!!
		if(name != null) {
			this.name = name;
		}else {
			System.out.println("���Է�");
		}
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		
		// charAt�� �̷��� �� �� �ֱ���!!!!!
		// ��ó�� �������� ��ȣ�� ����..
		return name.charAt(0)+"*"+name.charAt(2);
	}
	public int getAge() {
		return age;
	}
}

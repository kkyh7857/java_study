
public class Info {
	private String name;
	private int age;
	
	public Info(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public void setName(String name) {
		// 전처리를 해줄 수 있다.>> 해도쌤이 말해줬는데.....에잇!!
		if(name != null) {
			this.name = name;
		}else {
			System.out.println("미입력");
		}
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		
		// charAt을 이렇게 쓸 수 있구나!!!!!
		// 전처리 개인정보 보호에 관한..
		return name.charAt(0)+"*"+name.charAt(2);
	}
	public int getAge() {
		return age;
	}
}

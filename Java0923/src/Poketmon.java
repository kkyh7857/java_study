
public class Poketmon {

	private String name; // 포켓몬 이름
	private String type; // 포켓몬 타입
	private int attack; // 공격력
	private int shield; // 방어력
	private int hp; // 체력

	// 원하는 설정값으로 바로 포켓몬을 만들 수 있게
	// 생성자 오버라이딩 (마우스 우클릭 - source - using field)
	public Poketmon(String name, String type, int attack, int shield, int hp) {
		this.name = name;
		this.type = type;
		this.attack = attack;
		this.shield = shield;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	
	
	
	
}

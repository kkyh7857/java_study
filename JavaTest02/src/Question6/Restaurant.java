package Question6;

public class Restaurant extends Store{

	double service; // ���� ������ �����ϴ� �ʵ�
	double flavor; // �� ������ �����ϴ� �ʵ�
	double clean; // û�� ������ �����ϴ� �ʵ�
	
	public Restaurant(String name, String event, double price, double service, double flavor, double clean) {
		this.name = name;
		this.event = event;
		this.price = price;
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
	}
	
	@Override
	public double grade() {
		
		return (price+service+flavor+clean)/4;
	}

}

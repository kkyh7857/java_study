package Question6;

public class Restaurant extends Store{

	double service; // 서비스 점수를 저장하는 필드
	double flavor; // 맛 점수를 저장하는 필드
	double clean; // 청결 점수를 저장하는 필드
	
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

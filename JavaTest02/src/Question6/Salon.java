package Question6;

public class Salon extends Store{

	double technoloy;
	double kindness;

	public Salon(String name, String event, double price, double technoloy, double kindness) {
		this.name = name; // 가게이름
		this.event = event; // 가게종목
		this.price = price; // 가격
		this.technoloy = technoloy; // 기술
		this.kindness = kindness; // 친절
	}

	
	@Override
	public double grade() {
		// TODO Auto-generated method stub
		return (price+technoloy+kindness)/3;
	}

	
	
	
}

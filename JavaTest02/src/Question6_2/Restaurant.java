package Question6_2;

public class Restaurant extends Store {
	
	public Restaurant(String name, String event, double price, double service, double flavor, double clean) {

		this.name = name;
		this.event = event;
		this.price = price;
		this.service = service;
		this.flavor = flavor;
		this.clean = clean;
	}
	double service;
	double flavor;
	double clean;
	@Override
	public double grade() {
		return (price + service + flavor + clean) / 4; 
	}
	
	
}

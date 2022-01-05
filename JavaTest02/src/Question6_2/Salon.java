package Question6_2;

public class Salon extends Store {
	public Salon(String name, String event, double price, double technology, double kindness) {
		this.name = name;
		this.event = event;
		this.price = price;
		this.technology = technology;
		this.kindness = kindness;
	}

	double technology;
	double kindness;

	@Override
	public double grade() {
		return (price+technology+kindness)/3;
	}

}

package Question6;

public class Salon extends Store{

	double technoloy;
	double kindness;

	public Salon(String name, String event, double price, double technoloy, double kindness) {
		this.name = name; // �����̸�
		this.event = event; // ��������
		this.price = price; // ����
		this.technoloy = technoloy; // ���
		this.kindness = kindness; // ģ��
	}

	
	@Override
	public double grade() {
		// TODO Auto-generated method stub
		return (price+technoloy+kindness)/3;
	}

	
	
	
}

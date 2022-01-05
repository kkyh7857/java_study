
public class Refrigerator {
	
	boolean OpenClose;
	boolean TurnOnOff;
	int temper;
	int RefSpace;
	String TurnOnColor;
	
	public void doorOnOff() {
		OpenClose = !OpenClose;
	}
	public void right() {
		TurnOnOff = !TurnOnOff;
	}
	public void temp(int num) {
		temper = num;
	}
	public void FullandEmpty() {
		
	}
	
	
}

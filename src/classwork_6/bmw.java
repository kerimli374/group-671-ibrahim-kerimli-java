package classwork_6;

public class bmw {
	String model;
	int motor;
	double Width;
	
	public void Changan(String model, int motor, double Weight) {
		this.model = model;
		this.motor = motor;
		this.Width = Width;
	}
	
	public void motorincrease() {
		if (motor > 140) {
			this.motor = 100;
		}
		else {
			this.motor += 20;
		}
	}
	
	public void modeal() {
		this.model += "+s60";
	}
	
	public void Widthtincreasse() {
		this.Width += 10;
	}
}

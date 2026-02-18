package classwork_6;

public class Changan {
		String model;
		int motor;
		double Weight;
		
		public void Changan(String model, int motor, double Weight) {
			this.model = model;
			this.motor = motor;
			this.Weight = Weight;
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
		
		public void Weightincreasse() {
			this.Weight += 10;
		}
}

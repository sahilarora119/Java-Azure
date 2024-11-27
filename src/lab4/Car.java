package lab4;

public class Car extends Vehicle implements Drivable, Comparable<Car> {

	private String model;
	private int speed;
	
	public Car() {
		this("Toyota" , 50);
	}
	
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public int compareTo(Car newCar) {
		if(this.speed > newCar.speed) {
			return 1;
		}
		else if(this.speed < newCar.speed) {
			return -1;
		}
		else {
			return 0;
		}		
	}

	@Override
	public String howToDrive() {
		return "Step on gas pedal";
	}

	@Override
	public void steer() {
		System.out.print("Turn Steering Wheel");
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			return this.model == ((Car)obj).getModel();
			}
		return false;
	}
}

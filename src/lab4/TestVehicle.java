package lab4;

public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle first = new Car("Tesla", 60);
		Vehicle second = new Car("Ferrari", 60);
		Vehicle third = new Car("Tesla", 90);
		
		System.out.println("Are vehicle 1 and 2 of Same Model? " + first.equals(second));
		System.out.println("Are vehicle 1 and 3 of Same Model? " + first.equals(third));
		System.out.println("Are vehicle 2 and 3 of Same Model? " + second.equals(third));
		
		System.out.print("Steer: ");
		second.steer();
		System.out.println("\nHow to drive the car?: " + ((Car)third).howToDrive());
		
		if(((Car)first).compareTo(((Car)second)) == 0) {
			System.out.println("The Cars are tavelling at the same speed");
		}
		if(((Car)third).compareTo(((Car)second)) == 1) {
			System.out.println(((Car)third).getModel() + " is travelling faster than "
					+ ((Car)second).getModel());
		}
		
	}

}

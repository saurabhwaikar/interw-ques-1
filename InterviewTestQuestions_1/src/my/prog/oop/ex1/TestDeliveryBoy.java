package my.prog.oop.ex1;

import java.util.Random;

public class TestDeliveryBoy {

	public static void main(String[] args) {
		DeliveryBoy db = getDeliveryBoy();
		db.deliver();
	}
	
	public static DeliveryBoy getDeliveryBoy() {
		Random rand = new Random();
		int num = rand.nextInt(10); // any random value up to 10
		return num % 2 == 0 ? new PizzaDeliveryBoy() : new Postman();
	}

}

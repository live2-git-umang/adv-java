package design_patterns;

public class EagerInitializeSingleton {

	public static void main(String[] args) {

		//Singelton_CoffeeVendingMachine singelteon_CoffeeVendingMachine = new Singelton_CoffeeVendingMachine();

		Singelton_CoffeeVendingMachine1 singelton_CoffeeVendingMachine = Singelton_CoffeeVendingMachine1.getInstance();
		singelton_CoffeeVendingMachine.brewACupOfCoffee();

		Singelton_CoffeeVendingMachine1 singelton_CoffeeVendingMachine1 = Singelton_CoffeeVendingMachine1.getInstance();
		singelton_CoffeeVendingMachine1.brewACupOfCoffee();

		System.out.println(singelton_CoffeeVendingMachine);
		System.out.println(singelton_CoffeeVendingMachine1);

	}


}

class Singelton_CoffeeVendingMachine1 {

	private static Singelton_CoffeeVendingMachine1 INSTANCE_SINGELTON_COFFEE_VENDING_MACHINE 
	= new Singelton_CoffeeVendingMachine1();


	//private constructor==
	private Singelton_CoffeeVendingMachine1() {

	}

	//Step3: create the accessor to access the instance
	public static Singelton_CoffeeVendingMachine1 getInstance() {
		if(INSTANCE_SINGELTON_COFFEE_VENDING_MACHINE==null) {
			INSTANCE_SINGELTON_COFFEE_VENDING_MACHINE = new Singelton_CoffeeVendingMachine1();
		}
		return INSTANCE_SINGELTON_COFFEE_VENDING_MACHINE;
	}

	//Business methods
	public void brewACupOfCoffee() {
		System.out.println("brew a coffee");
	}
}


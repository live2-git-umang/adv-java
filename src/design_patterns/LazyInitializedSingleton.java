package design_patterns;

public class LazyInitializedSingleton {

	public static void main(String[] args) {

		//Singelton_CoffeeVendingMachine singelteon_CoffeeVendingMachine = new Singelton_CoffeeVendingMachine();

		Singelton_CoffeeVendingMachine singelton_CoffeeVendingMachine = Singelton_CoffeeVendingMachine.getInstance();
		singelton_CoffeeVendingMachine.brewACupOfCoffee();

		Singelton_CoffeeVendingMachine singelton_CoffeeVendingMachine1 = Singelton_CoffeeVendingMachine.getInstance();
		singelton_CoffeeVendingMachine.brewACupOfCoffee();

		System.out.println(singelton_CoffeeVendingMachine);
		System.out.println(singelton_CoffeeVendingMachine1);

	}


}

class Singelton_CoffeeVendingMachine {

	private static final Singelton_CoffeeVendingMachine INSTANCE_SINGELTON_COFFEE_VENDING_MACHINE 
	= new Singelton_CoffeeVendingMachine();


	//private constructor==
	private Singelton_CoffeeVendingMachine() {

	}

	//Step3: create the accessor to access the instance
	public static Singelton_CoffeeVendingMachine getInstance() {
		return INSTANCE_SINGELTON_COFFEE_VENDING_MACHINE;
	}

	//Business methods
	public void brewACupOfCoffee() {
		System.out.println("brew a coffee");
	}
}
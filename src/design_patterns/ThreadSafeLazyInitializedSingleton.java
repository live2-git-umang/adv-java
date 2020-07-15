package design_patterns;

public class ThreadSafeLazyInitializedSingleton {

	public static void main(String[] args) {

		//Singelton_CoffeeVendingMachine3 singelteon_CoffeeVendingMachine = new Singelton_CoffeeVendingMachine3();

		Singelton_CoffeeVendingMachine3 Singelton_CoffeeVendingMachine = Singelton_CoffeeVendingMachine3.getInstance();
		Singelton_CoffeeVendingMachine.brewACupOfCoffee();

		Singelton_CoffeeVendingMachine3 Singelton_CoffeeVendingMachine1 = Singelton_CoffeeVendingMachine3.getInstance();
		Singelton_CoffeeVendingMachine1.brewACupOfCoffee();

		System.out.println(Singelton_CoffeeVendingMachine);
		System.out.println(Singelton_CoffeeVendingMachine1);

	}


}

class Singelton_CoffeeVendingMachine3 {

	private static Singelton_CoffeeVendingMachine3 INSTANCE_SINGELTON_COFFEE_VENDING_MACHINE;


	//private constructor==
	private Singelton_CoffeeVendingMachine3() {

	}

	//Step3: create the accessor to access the instance
	public static synchronized Singelton_CoffeeVendingMachine3 getInstance() {
		if(INSTANCE_SINGELTON_COFFEE_VENDING_MACHINE == null) {
			INSTANCE_SINGELTON_COFFEE_VENDING_MACHINE = new Singelton_CoffeeVendingMachine3();
		}
		return INSTANCE_SINGELTON_COFFEE_VENDING_MACHINE;
	}

	//Business methods
	public void brewACupOfCoffee() {
		System.out.println("brew a coffee");
	}
}
package design_patterns;

public class EagerInitializeStaticBlockSingleton {

	public static void main(String[] args) {

		//Singelton_CoffeeVendingMachine singelteon_CoffeeVendingMachine = new Singelton_CoffeeVendingMachine();

		Singelton_CoffeeVendingMachine2 singelton_CoffeeVendingMachine = Singelton_CoffeeVendingMachine2.getInstance();
		singelton_CoffeeVendingMachine.brewACupOfCoffee();

		Singelton_CoffeeVendingMachine2 singelton_CoffeeVendingMachine1 = Singelton_CoffeeVendingMachine2.getInstance();
		singelton_CoffeeVendingMachine1.brewACupOfCoffee();

		System.out.println(singelton_CoffeeVendingMachine);
		System.out.println(singelton_CoffeeVendingMachine1);

	}
}

class Singelton_CoffeeVendingMachine2 {

	private static Singelton_CoffeeVendingMachine2 INSTANCE_SINGELTON_COFFEE_VENDING_MACHINE 
	= new Singelton_CoffeeVendingMachine2();


	//private constructor==
	private Singelton_CoffeeVendingMachine2() {

	}

	//step 2.1 : add a static block to initialize and handle exceptions
		static {
			try {
				INSTANCE_SINGELTON_COFFEE_VENDING_MACHINE = new Singelton_CoffeeVendingMachine2();
				System.out.println("STATIC BLOCK EXECUTED AND INSTANCE CREATED!");
			} catch (Exception e) {
				throw new RuntimeException("ERROR CREATING AN INSTANCE OF A SINGLETON!");
			}
		}
		
	//Step3: create the accessor to access the instance
	public static Singelton_CoffeeVendingMachine2 getInstance() {
		return INSTANCE_SINGELTON_COFFEE_VENDING_MACHINE;
	}

	//Business methods
	public void brewACupOfCoffee() {
		System.out.println("brew a coffee");
	}
}


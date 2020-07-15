package java7.fundamentals;


public class AbstractClassWithConstructor {

	public static void main(String[] args) {
		DerivedFromAbstract derivedFromAbstract = new DerivedFromAbstract();
		System.out.println(derivedFromAbstract.message);

		InterfaceTest.test1();
		//Interface.Test2();
		derivedFromAbstract.test2();
		derivedFromAbstract.test1();
		InterfaceTest interfaceTest = new DerivedFromAbstract();
		interfaceTest.test2();
	}

}

class DerivedFromAbstract extends AbstractTest implements InterfaceTest{
	@Override
	public void test() {
		System.out.println("Overridden!");
		System.out.println(message);
	}

	@Override
	public void test2() {
		System.out.println("Overridden method");
	}

	public void test1() {
		System.out.println("new method");
	}

}

abstract class AbstractTest{
	public String message;
	public AbstractTest() {
		message = "Abstract Mssage";
	}
	public abstract void test();
	public void test1() {

	}
}

interface InterfaceTest{

	public abstract void test();
	public static void test1() {
		System.out.println("Functiona inside a interface");
	}

	public default void test2() {
		System.out.println("method for implementing instances");
	}
}

public class defaultMethod implements interfaceA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * default methods are good in interfaces because the classes implementing them 
		 * are not obligated to override the method, default methods in interfaces can have a body
		 * 
		 * AnotherDefault can override the interface method as well call the interface method itself using
		 * the super keyword
		 */
		AnothterDefault d = new AnothterDefault();
		d.show1();
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}

interface interfaceA { 
	void show();
	default void show1() {
		System.out.println("Show1 of InterfaceA");
	}
	
}

interface interfaceB {
	default void show1() {
		System.out.println("Show1 of interfaceB");
	}
}

class AnothterDefault implements interfaceA,interfaceB  {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("In show1 of another demo");
		interfaceA.super.show1();
		interfaceB.super.show1();
	} 
	
}
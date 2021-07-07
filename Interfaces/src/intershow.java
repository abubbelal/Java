
public class intershow implements i1 {
	/**
	 * we can implement more than one interface but we can only
	 * extend one class
	 * 
	 * since the methods in an interface are abstract we have to override them 
	 * in our classes before we can use an interface
	 * 
	 * at the bottom we are overriding both show and show1 method
	 */

	static final int x;
	static { 
		/**
		 * the static initialization block can be used to initialize
		 * all undefined static variables
		 */
		x = 20;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Any variable defined in an interface is by default:
		 * 		- public
		 * 		- final
		 * 		- static 
		 * variables must be initialized because we cannot change it later
		 */
		System.out.println(pie);
		
		float pieF = pie * 2;
		System.out.println(pieF);
		
//		pie = 4.5f; //cannot change value because it is final
		
		
	}

	@Override
	public void show1() {
		System.out.println("In Show1");
	}

	@Override
	public void show() {
		System.out.println("In Show");
	}

}


interface i1 extends i2 { 
	float pie = 3.14f;
	void show();
}

interface i2 { 
	void show1();
}
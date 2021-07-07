
public class polyuse {
	
	static void show(shape s) {
		s.calarea();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		square s = new square();
		rectangle r = new rectangle();
		
		show(s);
		show(r);
		
		
	}

}


interface shape { 
	/**
	 * interface is like a class but one of the main things is 
	 * it cannot have any non abstract methods
	 * all methods defined in an interface is by default abstract
	 * 
	 * and they are not extended rather implemented to other classes
	 */
	void calarea();
	
	/**
	 * any method defined here are by default public
	 * so any class implementing an interface must define the overridden method as public
	 * 
	 */
}

class rectangle implements shape { 
	
	int l = 10,w = 20;
	public void calarea() {
		System.out.println("Area of rectangle is: " + l*w);
	}
}

class square implements shape { 
	int s = 10;
	public void calarea() { 
		System.out.println("Area of square is: " + (s * s));
	}
}
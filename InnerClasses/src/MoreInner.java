
public class MoreInner {

	
	class Inner { 
		
		void show3() { 
			System.out.println("Show inside inner");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MoreInner().new Inner().show3();

//		new Outer9().new Inner.show3();
		
		/**
		 * for the second method, it would work if the Outer9 class 
		 * was extending MoreInner class instead of Inner
		 */
	}

}


class Outer9 extends MoreInner.Inner { 
	
	Outer9 () {
		new MoreInner().super();
		/**
		 * we need to create a new object of the outer{MoreInner} class before
		 * we can create an object of Outer. so in constructor method 
		 * we must create an outer class object first before being able to 
		 * extend the inner class
		 */
	}
	
//	Outer9 (MoreInner i) {
//		i.super(); 
//		/**
//		 * This is another way of defining our constructor
//		 * to pass the outer class object as the constructor argument 
//		 * and use the variable to extend our super
//		 */
//	}
	
	//You can use either methods to define the constructor
	
	
}

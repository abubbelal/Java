
public class RnTimePolymorphism {
	
	int x = 10;
	
//	void show() {
//		System.out.println("Show from RnTimePolymorphism");
//		
//	}
	
	
	
//	private void show() {
//		System.out.println("Show from RnTimePolymorphism");
//		
//	}
	
	static void show() {
		System.out.println("Show from RnTimePolymorphism");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RnTimePolymorphism rp = new RnTimePolymorphism();
		b1 b = new b1();
		c1 c = new c1();
		
//		rp.show(); //cannot run because we changed show method to private
		System.out.println(rp.x);
		b.show();
		System.out.println(b.x);
		c.show();
		System.out.println(c.x);
		
		/**
		 * We have one base class RnTimePolymorphism and two subclasses extending to it 
		 * b1, c1. they all haave the show method, and are overriding the base class method.
		 * 
		 * when we create objects of each class and call the show method we are calling 
		 * that specific object's show method, not the base classes method.
		 * 
		 */
		
		rp = b; //now we are passing the base class to the object of the child class 
		rp.show(); //this will output the child class method. 
		System.out.println(rp.x);
		rp = c; 
		rp.show(); //here we will output the c show method
		System.out.println(rp.x);
		/**
		 * this is known as runtime polymorphism because depending on what object we pass 
		 * to the parent object, it will output the method of that child. 
		 * 
		 * first output was from b1 class when we called show method instead of the base class
		 * second output was from c1 class when we called the show method 
		 */
		
		//the superclass variable/object can refer to the subclass object 
		
		/**
		 * if we change the base class method to private, there won't be any overriding happening in the subclasses
		 * and the no runtime polymorphism.
		 * 
		 * when we assign a base class object to a subclass object it will call the base class method 
		 */
		
	}

}



class b1 extends RnTimePolymorphism { 
	
	int x = 20;
	
//	void show() {
//		System.out.println("Show from B1");
//	}
	
	static void show() {
		System.out.println("Show from B1");
	}
}

class c1 extends RnTimePolymorphism { 
	
	int x = 30;
	
//	void show() {
//		System.out.println("Show from C1");
//	}
	
	static void show() {
		System.out.println("Show from C1");
	}
}

/** 
* Rule 1: It does not apply to private methods -> Private methods are never overwritten
* Rule 2: Static methods are not overwridden -> they are bound to the class so we cannot do runtime polymorphism
* Rule 3: No runtime polymorphism in case of variables
*
*/

public class Outer {
	
	int x = 10;
	static int y = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object of static inner class 
		Outer.Inner oi = new Outer.Inner(); //declaring an inner class object 
		oi.show();
		
		//creating object of nonstatic inner class 
		Outer o = new Outer();
		Outer.nonStatic on = o.new nonStatic();
		on.show();
		
		

	}
	
	static class Inner { 
		int z = 30;
		static int k = 40;
		void show() { 
			System.out.println(y+z+k);
		}
	}
	
	//instance class
	class nonStatic { 
		int n = 15;
		int m = x;
		
		void show() { 
			System.out.println(x+y+n+m);
		}
	}

	/**
	 * 4 types of inner classes in java
	 * 		1. static inner class
	 * 				1. it can only access the static members of the outer class
	 * 				2. it can itself declare instance as well as static members 
	 * 				3. Outer.Inner to create objects
	 *  	2. non-static inner class
	 *  			1. it can access everything of outter class (static and nonstatic)
	 *  			2. it cannot decalre anything static itself
	 *  			3. need an object of outer to create an object of non static inner class
	 *  	3. local inner class
	 *  			
	 *  	4. anonymous class
	 */
}


class d { 

}
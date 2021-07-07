
public class LocalInnerClass {
	
	int x = 10;
	static int y = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/**
		 * A local inner class is a class that is defined within a method
		 * the scope of the class is limited to the method itself
		 * the class can access everything from the outer class
		 * the only access modifier you can apply to this class is either abstract, or final
		 * cant decalre anything static
		 * local variables need to be declared final
		 */		
	}
	
	void show() {
		
		final int k = 40;
		
		class lic { 
			
			int xx = 30;
			
			void show1() { 
				System.out.println("output is " + (x + y + xx));
			}
			
		}
		
		lic aaLic = new lic();
		aaLic.show1();
		
	}

}

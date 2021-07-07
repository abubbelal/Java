
public class polyuse {
	
	static void show(shape s) {
		s.calarea(); //call the method of the shape object (s) 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		square s = new square();
		rectangle r = new rectangle();
		
		/**
		 * we created two objects of class square and rectangle
		 * they are both child classes of shape class 
		 * 
		 * in our main class "polyuse" we have a static method that will take in 
		 * a shape class object as an argument
		 * 
		 * since square and rectangle are both child classes of shape, we can use them as 
		 * method arguments as well. here we are passing in the square object we created 
		 * as the method argument for the show method in place of shape
		 * 
		 * we can do the same for rectangle and it will display the calcarea method of that 
		 * particular object 
		 */
		show(s); 
		
		show(r);
	}

}



abstract class shape { 
	
	abstract void calarea();
}


class rectangle extends shape { 
	
	int l = 10,w = 20;
	void calarea() {
		System.out.println("Area of rectangle is: " + l*w);
	}
}

class square extends shape { 
	int s = 10;
	void calarea() { 
		System.out.println("Area of square is: " + (s * s));
	}
}


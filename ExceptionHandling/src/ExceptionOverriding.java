import java.io.IOException;

public class ExceptionOverriding {

	void show() throws Exception {
		System.out.println("In show of super class");
	}
	
	public static void main(String[] args) throws Exception {
	
		// TODO Auto-generated method stub
		ExceptionOverriding ee = new subover();
		ee.show();
	}

}


class subover extends ExceptionOverriding {
	/**
	 * this show method is overriding super class show method
	 * the super show method is throwing an exception
	 * 
	 * the super class must have more exception than the sub class 
	 * if the super method has no exception then the sub class cannot have an exception
	 * being thrown
	 * 
	 * if the super class has an exception being thrown the sub class can have less 
	 * exceptions or no exception
	 */
	void show() throws IOException {
	
		System.out.println("In show of a sub class");
	}
}

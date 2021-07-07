
public class EH {
	
	static void show() {
		int x = 0;
		
		for(int i=5; i>-3; --i) {
			
			/**
			 * place any block of code likely to generate an error
			 * in a try block and use a catch block to catch that type of 
			 * exception
			 * 
			 * in this example once i = 0 we cannot divide by zero so it will
			 * generate an error and output our catch block
			 */
			
			try { 
				x = 10/i;
				System.out.println(x);
			} catch (ArithmeticException e) {
				System.out.println("error Case: " + x);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Our array catch example");
			} catch (Exception e) {
				System.out.println("Our General Exception class catch block -- will catch any exception");
				
				/**
				 * we can use Exception block to test what type of exception the try block raised
				 */
				if(e instanceof ArithmeticException) {
					System.out.println("arithematic exception");
				} 
				if (e instanceof ArrayIndexOutOfBoundsException) {
					System.out.println("array bounds exceptions");
				}
			}
		} //end of for loop
		
		/**
		 * One try block must have atleast one catch block, it can have more than
		 * the catch must begin where the try ends nothing can be in between
		 * 
		 * catch blocks are executed in the order it is in, make sure to pay attention to the specificy of 
		 * the catch block. For example if you have catch block for "Exception" first it will never go to the
		 * other catch blocks because this will catch all exceptions
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		show();
	}

}

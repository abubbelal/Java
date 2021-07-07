import java.io.IOException;

public class FinallyException {
	
	static int show() {
		try {
//			return 1;
			throw new IOException();
		} catch (IOException e) {
			throw new Exception();
		} finally {
//			System.out.println("Finally is called");
			throw new ArithmeticException(); //uncheck exception, we don't need to handle IOException
			//anything in finally supercedes anything in Try or Catch block
		}
	}
	
	/**
	 * Finally will exceute regardless of if there was an exception raised
	 * it supercedes both try and catch block
	 * it will also over rule any returns or exceptions thrown from either
	 * 
	 * EX:
	 * try returns 1
	 * finally returns 4
	 * 
	 * output will be 4
	 * 
	 * best to not have any returns in final block
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(show());
	}

}

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionThrow {
	
	void show() throws FileNotFoundException {
		/**
		 * here we can handle the filenotfoundexception or we can also throw it
		 */
		try {			
			show1();
		} catch (FileNotFoundException e) {
			System.out.println("In Show method");
		}
	}
	
	void show2() {
		try {
			show1();
		} catch (Exception e)  {
			/**
			 * Showing our own stack trace of exception
			 */
			Throwable t = e.fillInStackTrace();
			t.printStackTrace();
		}
	}
	
	void show1() throws FileNotFoundException {	
		/**
		 * this method will throw the exception to the method calling it
		 */
		FileInputStream fis = new FileInputStream("fff"); //file not found exception
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		/**
		 * last method handling the filenotfoundexception 
		 * 
		 * we can also throw the exception from the main method to the java runtim
		 */
		try {			
			new ExceptionThrow().show();
		}catch (FileNotFoundException e) {
			System.out.println("in main method");
		}
		
	}

}

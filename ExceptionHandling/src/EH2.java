
public class EH2 {
	
	static void show() {
		int x = 0;
		
		try {
			
			try {
				for(int i = 5; i > -3; --i) {
					x = 10/i;
					System.out.println(x);
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Caught in inner catch block");
			}
		} catch (ArithmeticException e) {
			System.out.println("Caught in outer catch block");
		}
		
		System.out.println("All ends");
	}
	
	
	static void show1() {
		
		/**
		 * the finally block executes regardless of if there was an exception
		 */
		
		for(int i = 5; i > -3; --i) {
			try {
			/**
			 * file open
			 * read
			 * close
			 */
				int x =10/i;
				System.out.println(x);
			} catch (ArithmeticException e) {
				System.out.println("Catch block");
			} finally {
				System.out.println("Finally block");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
		
		show1();
	}

}


public class MyException {

	static int count = 0;
	
	MyException() throws NoMoreObjects {
		count++;
		if (count > 5) {
			throw new NoMoreObjects();
		}
		
		System.out.println("Object created: " + count);
	}
	public static void main(String[] args) throws NoMoreObjects {
		// TODO Auto-generated method stub
		
		// lets try to create more than 5 objects of NoMoreObjects
		for (int i = 0; i < 10; ++i) {
			new MyException();
		}
	}

}

/**
 * 
 * for this class to throw exception it either needs to extend the
 * exception class
 * throwable class
 * or runtime exception class
 *
 */
class NoMoreObjects extends Exception {
	
	public NoMoreObjects() {
		super("No more objects can be created of my class");
	}
}
